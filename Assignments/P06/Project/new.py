import sys
import os
import pprint

alphabet = [chr(x+97) for x in range(26)]
class Incidence_of_Coincidence:
  def __init__(self,ct=None):
    #lower case alphabet
    #cipher text as is
    self.cipherText = ct.lower()
    #cipher text without blanks
    self.cip = ct.lower()
    #dictionary 
    self.lookup = None
    #summation
    self.sum_IC = 0.0
    #length of cipher text
    self.lenCT = 0.0
    #IC Value
    self.ICval = 0
    #2-16 length key length
    self.keyLen = None
    #key length 
    self.k_length = 0
    #dictionary the len of the word as KeyboardInterrupt
    self.KeyDiction = None
    #the actual key length - clean up later
    self.theactual_keylength = 0
    #list of words with actual key length
    self.listwithsize = []

  #initialize the letter counts to 0
  def build_let_lookup(self):
    self.lookup = {}
    for i in alphabet:
      self.lookup[i] = 0
    return self.lookup

  #initialize the keylengths to 0
  def build_int_key(self):
    self.keyLen = {}
    for i in range(1,17):
      self.keyLen[i] = 0
    return self.keyLen

  #removes spaces
  def remove_space(self):
    blank = ' '
    cip_text = ''
    for i in self.cip:
      if blank != i:
        cip_text += i
    self.cip = cip_text
    return self.cip

  #identifies how many letters are there
  def measure_length(self):
    if self.lookup == None:
      self.lookup = self.build_let_lookup()
    self.cip = self.remove_space()
    for i in self.cip:
      self.lookup[i] += 1
    return self.lookup

  #the summation
  def summation_IC(self):
    if self.lookup == None:
      self.lookup = self.measure_length()
    for i in alphabet:
      if self.lookup[i] > 1:
        self.sum_IC += (self.lookup[i]*(self.lookup[i]-1))
    return self.sum_IC

  def lenCipherLetters(self):
    self.cip = self.remove_space()
    self.lenCT = len(self.cip)
    return self.lenCT
  
  def cal_IC(self):
    if(self.sum_IC == 0):
      self.summation_IC
    if(self.lenCT == 0):
      self.lenCipherLetters
    bottom = ((self.lenCT)*(self.lenCT - 1))
    self.keyLen[1] = self.sum_IC/(bottom)
    # print(self.sum_IC, bottom,self.keyLen[1])

  def key_len_IC(self):
    for i in range(2,17):
      self.keyLen[i] = self.calculate_keyIC(i) 
    return self.keyLen

  def calculate_keyIC(self,i):
    sumIC = 0
    self.lenCipherLetters()
    self.remove_space()
    k = i
    newcip = ''
    sum_avg = 0
    while(k > 0):
      it = k - 1
      while (it < self.lenCT):
        newcip += self.cip[it]
        it = it + i 
      # print(newcip)
      sumIC += self.inCalc(newcip)
      newcip=''
      k = k - 1
    sum_avg = sumIC/i
    # print()
    return sum_avg

  def inCalc(self, text):
    sum_acc = 0
    IC_seg = 0
    len_txt = 0
    alphabet_seg = {}
    for i in alphabet:
      alphabet_seg[i] = 0
    for i in text:
      alphabet_seg[i] += 1
    for i in alphabet:
      if alphabet_seg[i] > 1:
        # print(i,alphabet_seg[i])
        sum_acc += (alphabet_seg[i]*(alphabet_seg[i]-1))
    len_txt = len(text) * (len(text) - 1)
    IC_seg = sum_acc/(len_txt)
    # print(sum_acc,len_txt)
    return IC_seg


  def foundKeyLen(self):
    found = False
    for j in self.keyLen:
      if(found == False and self.keyLen[j] > 0.06):
        # print(self.keyLen[j])
        found = True
        self.theactual_keylength = j
    return self.theactual_keylength
  
  def check(self, text):
    # print(text)
    sum = IC = 0.0
    lookup = {}
    lookup = self.Check_measure_length(text)
    sum = self.Check_summation_IC(lookup)
    len_text = len(text)
    IC = self.Check_cal_IC(sum,len_text)
    # print(IC)
    if (IC > .037 and IC < .039):
      return True
    else: 
      return False


  def Check_measure_length(self,text):
    lookup = {}
    for i in text:
      lookup[i] = 0
    for i in text:
      lookup[i] += 1
    return lookup

  #the summation
  def Check_summation_IC(self, lookup):
    sum_IC = 0
    for i in alphabet:
      if lookup[i] > 1:
        sum_IC += (lookup[i]*(lookup[i]-1))
    return sum_IC
  
  def Check_cal_IC(self,sum_IC,lenT):
    bottom = ((lenT)*(lenT - 1))
    return(sum_IC/(bottom))

  def findthekeyandsentence(self):
    with open("words","r") as f:
      words = f.readlines()

    for i in range(len(words)): 
      words[i] = words[i].strip()
    
    
    # print(words)
    return words

  def findthekeyandsentence2(self,words, theactual_keylength):
    for word in words:
      if len(word) == theactual_keylength:
        self.listwithsize.append(word)
    return self.listwithsize

def vigenere_cipher_decrypt(**kwargs):
    input_file = kwargs.get('input',None)
    output_file = kwargs.get('output',None)

    # should test if file exists
    with open(input_file) as f:
        ciphertext = f.read()
    print(ciphertext," ")
    A = Incidence_of_Coincidence(ciphertext)
    keylen = everything(ciphertext)
    actual_keylen = len(keylen[0])
    # print(actual_keylen)
    # print(keylen)
    found_theword = False
    for key in keylen:
      if(found_theword == False):
        count = 0
        print(key)
        # if(key == "identification"):
        decrypted = ''
        i = 0
        for letter in ciphertext:
          if letter in alphabet:
            a = ord(letter)-97
            b = ord(key[i])-97
            decrypted += chr(((a-b)%26)+97)

            i = (i + 1) % len(key)
          else:
            decrypted += letter
          
        found_count = 0
        for word in decrypted.split():
          if(word in A.findthekeyandsentence()):
            found_count += 1
          count += 1
        
        if(found_count/count > .95):
          real_key = key
          print(real_key)
          found_theword = True
    # decrypted = "wait"
            

    with open(output_file,'w') as f:
      f.write("Key length: " + str(actual_keylen)+'\n')
      f.write("Keyword: " + real_key+'\n')
      f.write("Decrypted Text:\n\n")
      f.write(decrypted+'\n')


def everything(text):
  A = Incidence_of_Coincidence(text)
  A.build_int_key()
  A.build_let_lookup()
  A.remove_space()
  A.measure_length()
  A.summation_IC()
  A.lenCipherLetters()
  A.cal_IC()
  A.keyLen
  # A.alphabet
  # A.calculate_keyIC()
  A.key_len_IC()
  # A.vigenere_cipher_decrypt()
  print("")
  print(A.foundKeyLen())
  print("")
  # print(A.findthekeyandsentence(A.foundKeyLen()))
  return A.findthekeyandsentence2(A.findthekeyandsentence(),A.foundKeyLen())



def mykwargs(argv):
    '''
    Processes argv list into plain args (list) and kwargs (dict).
    Just easier than using a library like argparse for small things.
    Example:
        python file.py arg1 arg2 arg3=val1 arg4=val2 -arg5 -arg6 --arg7
        Would create:
            args[arg1, arg2, -arg5, -arg6, --arg7]
            kargs{arg3 : val1, arg4 : val2}
        Params with dashes (flags) can now be processed seperately
    Shortfalls:
        spaces between k=v would result in bad params
        Flags aren't handled at all. Maybe in the future but this function
            is meant to be simple.
    Returns:
        tuple  (args,kargs)
    '''
    args = []
    kargs = {}

    for arg in argv:
        if '=' in arg:
            key,val = arg.split('=')
            kargs[key] = val
        else:
            args.append(arg)
    return args,kargs

def usage(message=None):
    if message:
        print(message)
    name = os.path.basename(__file__)
    print(f"Usage: python {name} [input=string filename] [output=string filename] [op=decrypt]")
    print(f"Example:\n\t python {name} input=input_file.txt output=output_file.txt op=decrypt\n")
    sys.exit()

if __name__=='__main__':
  required_params = 2
  
  _,params = mykwargs(sys.argv[1:])

  if len(params) < required_params:
    usage()

  operation = params.get('op',None)
  infile = params.get('input',None)
  outfile = params.get('output',None)

  if not operation and not infile and not outfile:
    usage()

  vigenere_cipher_decrypt(**params)
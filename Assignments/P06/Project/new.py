import sys
import os
import math
import collections.abc

alphabet = [chr(x+97) for x in range(26)]

typical_frequency = {
    "a": 8.167,
    "b": 1.492,
    "c": 2.782,
    "d": 4.253,
    "e": 12.702,
    "f": 2.228,
    "g": 2.015,
    "h": 6.094,
    "i": 6.966,
    "j": 0.153,
    "k": 0.772,
    "l": 4.025,
    "m": 2.406,
    "n": 6.749,
    "o": 7.507,
    "p": 1.929,
    "q": 0.095,
    "r": 5.987,
    "s": 6.327,
    "t": 9.056,
    "u": 2.758,
    "v": 0.978,
    "w": 2.360,
    "x": 0.150,
    "y": 1.974,
    "z": 0.074
}



class frequency():
    def __init__(self):
        self.text = ""
        self.freq = {}
        self.freq_percent = {}
        self.sort_freq = None

        for l in alphabet:
            self.freq[l] = 0
            self.freq_percent[l] = 0
    
    def typical(self):
        return typical_frequency

    def clear(self):
      for l in alphabet:
        self.freq[l] = 0
  
    def count(self,text):
        for l in text:
            l = l.lower()
            if l in alphabet:
                self.freq[l] += 1

        for k in self.freq_percent:
            self.freq_percent[k] = round(self.freq[k] / len(text),2)
        
        # https://realpython.com/python-lambda/
        self.sort_freq = sorted(self.freq.items(), key=lambda x: x[1], reverse=True)

    def print(self):
        if self.sort_freq:
            for f in self.sort_freq:
                print(f"{f[0]}:{f[1]}")
        else:
            print(self.freq)

    def getNth(self,n):
        if self.sort_freq:
            return self.sort_freq[n][0]

        return None

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

def break_vig(**kwargs):
  input_file = kwargs.get('input',None)

  with open(input_file) as f:
    ciphertext = f.read()

  #ciphertext = ciphertext.replace(' ','')
  ciphertext = ciphertext.lower()
  cleantext = ""
  for l in ciphertext:
    if l in alphabet:
      cleantext += l

  textFreq = frequency()

  keyLength = 0
  IC = 0
  indexCoincidence = 0
  tempText = ""

  # for each key length: N
  #   find frequency of each letter
  #   compare that letters frequency to the typical freguency by subtracting then squaring
  #   average those N value to get the I.C.


 #Start of Index of Coincidence Code
  for i in range(2,16):
    for j in range(i):
      #build temporary text
      for k in range(j, len(cleantext), i):
        tempText += cleantext[k]

      #count frequency of temp text
      textFreq.count(tempText)

      sum = 0
      total = 0
      for k,f in typical_frequency.items():
          total += textFreq.freq[k]
          sum += (f/100 - textFreq.freq[k]/len(tempText))**2

      #for every letter, add percent frequency squared
      N = len(tempText)
      for l in alphabet:
        ni = textFreq.freq[l]
        IC = IC + (ni*(ni-1))/(N*(N-1))
            
      #clear frequency and text for next pass
      textFreq.clear()
      tempText = ""
      
    #for all passes through the loop, divide to find avg
    #tempIndex = tempIndex/i
    IC = IC/i
    if IC > indexCoincidence:
      indexCoincidence = IC
      keyLength = i
    IC = 0
  print(keyLength)

  diction = open('dictionary', 'r')
  lines = diction.readlines()
  wordList = [""] * 45333
  words = [" "] * 45333
  count = 0
  count2 = 0

  for line in lines:
    line = line.lower()
    for l in line:
      if l in alphabet:
        wordList[count2] += l
    if (len(wordList[count2])) == keyLength:
      words[count] = wordList[count2]
      #print(words[count])
      count += 1
    count2 += 1
  
  texts = [" "] * count

  count = 0
  pos = 0
  plaintext = ""
  for entry in words:
    if entry != " ":
      for l in cleantext:
        if pos < 1000:
          tempLetter = l
          tempKey = entry[(pos % (len(entry)))]
          num1 = ord(tempLetter) - 97
          num2 = ord(tempKey) - 97
          result = ((num1 - num2) % 26) + 97
          letter = chr(result)
          #print(letter)
          if letter in alphabet:
            plaintext += letter
          pos += 1
      texts[count] = plaintext
      plaintext = ""
      count += 1
      #print(count)
      pos = 0

  match = 0
  timer = 0
  for entry in texts:
    for line in wordList:
      if line in entry:
        match += len(line)
    if match >= len(entry):
      print(words[timer])
      print(entry)
    timer += 1
    match = 0



def usage(message=None):
    if message:
        print(message)
    name = os.path.basename(__file__)
    print(f"Usage: python {name} [input=input_file_name]")
    print(f"Example:\n\t python {name} input=input_file.txt \n")
    sys.exit()

if __name__=='__main__':
    """
    Change the required params value below accordingly.
    """

    required_params = 1 # adjust accordingly

    # get processed command line arguments 
    _,params = mykwargs(sys.argv[1:])

    # print usage if not called correctly
    if len(params) < required_params:
      usage()

    infile = params.get('input',None)

    if not infile: 
      usage()

    break_vig(**params)
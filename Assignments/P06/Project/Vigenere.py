import sys

"""
    ***Examples terminal commands to run the program***
        
        run = "python3 CipherCracking.py input_file=ciphertext.txt output_file=decrypted.txt operation=Decrypt encryption_key=none"
        run = "python3 Vigenere.py input_file=plaintext.txt output_file=encrypted.txt operation=Encrypt encryption_key=factorial"
    *** Encryption Example***
        Operation: Encrypt
        Plaintext Message: a group of crows is called a murder
        Key: Vixen
        Repeated Key:      V IXENV IX ENVIX EN VIXENV I XENVIX
        Encrypted Message: V OOSJK WC GEKEP MF XIIPRY I JCEYMO
    ## Possible code snippet
    str[0] = (str[0] + int(key[i]) % 26)
     $$\    $$\ $$\                                                             
     $$ |   $$ |\__|                                                            
     $$ |   $$ |$$\  $$$$$$\   $$$$$$\  $$$$$$$\   $$$$$$\   $$$$$$\   $$$$$$\  
     \$$\  $$  |$$ |$$  __$$\ $$  __$$\ $$  __$$\ $$  __$$\ $$  __$$\ $$  __$$\ 
      \$$\$$  / $$ |$$ /  $$ |$$$$$$$$ |$$ |  $$ |$$$$$$$$ |$$ |  \__|$$$$$$$$ |
       \$$$  /  $$ |$$ |  $$ |$$   ____|$$ |  $$ |$$   ____|$$ |      $$   ____|
        \$  /   $$ |\$$$$$$$ |\$$$$$$$\ $$ |  $$ |\$$$$$$$\ $$ |      \$$$$$$$\ 
         \_/    \__| \____$$ | \_______|\__|  \__| \_______|\__|       \_______|
                    $$\   $$ |                                                  
                    \$$$$$$  |                                                  
                     \______/                                                   
"""


class Vigenere:

    def __init__(self, input = None, output = None):
        if not input is None:
            self.Input = input
        if not output is None:
            self.Output = output

        # self.alphabet = [chr(x + 65) for x in range(26)]
        ALPHABET = [chr(x+97) for x in range(26)]
        
        self.Words = "Dictionary_Words.txt"
        self.Plaintext = None
        self.CipherText = None
        self.Encrypted = ""
        self.Decrypted = None
        self.EncryptionKey = None
        self.Encrypt = False
        self.Decrypt = False

        ## List to keep track of the different keys to test
        self.KeyOrder = []

    
    def setIn_N_Out(self,**kargs):
        self.Input = kargs.get("input_file",None)
        self.Output = kargs.get("output_file",None)

    
    def setOperation(self, **kargs):
        if kargs["operation"] == 'Encrypt':
            self.Encrypt = True
            print("We are Encrypting")
            self.vigenere_cipher_encrypt (**kargs)
        
        else:
            self.Decrypt = True
            print("We are Decrypting")
            self.vigenere_cipher_decrypt(**kargs)


    def vigenere_cipher_encrypt(**kwargs):
        input_file = kwargs.get('input',None)
        output_file = kwargs.get('output',None)
        key = kwargs.get('key',None)

        # should test if file exists
        with open(input_file) as f:
            plaintext = f.read()

        plaintext = plaintext.lower()
        ciphertext = ''

        i = 0
        for letter in plaintext:
            if letter in ALPHABET:

                a = ord(letter)-97
                b = ord(key[i])-97
                ciphertext += chr(((a+b)%26)+97)

                i = (i + 1) % len(key)
            else:
                ciphertext += letter

        with open(output_file,'w') as f:
            f.write(ciphertext)

    def vigenere_cipher_decrypt(**kwargs):
        input_file = kwargs.get('input',None)
        output_file = kwargs.get('output',None)
        key = kwargs.get('key',None)


        # should test if file exists
        with open(input_file) as f:
            ciphertext = f.read()

        decrypted = ''
        i = 0
        for letter in ciphertext:
            if letter in ALPHABET:
                a = ord(letter)-97
                b = ord(key[i])-97
                decrypted += chr(((a-b)%26)+97)

                i = (i + 1) % len(key)
            else:
                decrypted += letter

        with open(output_file,'w') as f:
            f.write(decrypted)

"""
    $$\                                                             
    $$ |                                                            
    $$ |  $$\ $$\  $$\  $$\  $$$$$$\   $$$$$$\   $$$$$$\   $$$$$$$\ 
    $$ | $$  |$$ | $$ | $$ | \____$$\ $$  __$$\ $$  __$$\ $$  _____|
    $$$$$$  / $$ | $$ | $$ | $$$$$$$ |$$ |  \__|$$ /  $$ |\$$$$$$\  
    $$  _$$<  $$ | $$ | $$ |$$  __$$ |$$ |      $$ |  $$ | \____$$\ 
    $$ | \$$\ \$$$$$\$$$$  |\$$$$$$$ |$$ |      \$$$$$$$ |$$$$$$$  |
    \__|  \__| \_____\____/  \_______|\__|       \____$$ |\_______/ 
                                                $$\   $$ |          
                                                \$$$$$$  |          
                                                \______/      
    Helper Function to strip out key arguments that are passed in 
    when running the program            
    Processes argv list into plain args (list) and kwargs (dict).
    Just easier than using a library like argparse for small things.
    Example:
        python file.py arg1 arg2 arg3=val1 arg4=val2 -arg5 -arg6 --arg7
        Would create:
            args[arg1, arg2, -arg5, -arg6, --arg7]
            kargs{arg3 : val1, arg4 : val2}
        kargs with dashes (flags) can now be processed seperately
    Shortfalls:
        spaces between k=v would result in bad kargs
        Flags aren't handled at all. Maybe in the future but this function
            is meant to be simple.
    Returns:
        tuple  (args,kargs)          
                    
# """

def mykwargs(argv):
    args = []
    kargs = {}

    for arg in argv:
        if '=' in arg:
            key,val = arg.split('=')
            kargs[key] = val
        else:
            args.append(arg)
    return args,kargs




"""
    $$\      $$\           $$\                 $$$$$$$\  $$\                     $$\       
    $$$\    $$$ |          \__|                $$  __$$\ $$ |                    $$ |      
    $$$$\  $$$$ | $$$$$$\  $$\ $$$$$$$\        $$ |  $$ |$$ | $$$$$$\   $$$$$$$\ $$ |  $$\ 
    $$\$$\$$ $$ | \____$$\ $$ |$$  __$$\       $$$$$$$\ |$$ |$$  __$$\ $$  _____|$$ | $$  |
    $$ \$$$  $$ | $$$$$$$ |$$ |$$ |  $$ |      $$  __$$\ $$ |$$ /  $$ |$$ /      $$$$$$  / 
    $$ |\$  /$$ |$$  __$$ |$$ |$$ |  $$ |      $$ |  $$ |$$ |$$ |  $$ |$$ |      $$  _$$<  
    $$ | \_/ $$ |\$$$$$$$ |$$ |$$ |  $$ |      $$$$$$$  |$$ |\$$$$$$  |\$$$$$$$\ $$ | \$$\ 
    \__|     \__| \_______|\__|\__|  \__|      \_______/ \__| \______/  \_______|\__|  \__|
                                                                                                                                                                                                                                                   
"""

    
if __name__=='__main__':
        
    V1 = Vigenere()

    argv = sys.argv[1:]                     # strip file name (main.py) out of args

    args,program_kargs = mykwargs(argv)
        
    try:

        V1.setIn_N_Out(**program_kargs)
        V1.setOperation(**program_kargs)
        
        # keeps window alive

    except:

        print("Looks like you're missing some parameters, here's what you need.\n")
        print("Example run: python3 filename.py input_file=[inputfile name] output_file=[outputfile name] operation=[Encrypt or Decrypt] encryption_key=[key]\n")
        print("Decrypt:","python3 Vigenere.py input_file=ciphertext.txt output_file=decrypted.txt operation=Decrypt encryption_key=none")
        print("Encrypt:","python3 Vigenere.py input_file=plaintext.txt output_file=encrypted.txt operation=Encrypt encryption_key=factorial")
        sys.exit()




















# import sys

# """
#     ***Examples terminal commands to run the program***
        
#         run = "python3 CipherCracking.py input_file=ciphertext.txt output_file=decrypted.txt operation=Decrypt encryption_key=none"
#         run = "python3 Vigenere.py input_file=plaintext.txt output_file=encrypted.txt operation=Encrypt encryption_key=factorial"
#     *** Encryption Example***
#         Operation: Encrypt
#         Plaintext Message: a group of crows is called a murder
#         Key: Vixen
#         Repeated Key:      V IXENV IX ENVIX EN VIXENV I XENVIX
#         Encrypted Message: V OOSJK WC GEKEP MF XIIPRY I JCEYMO
#     ## Possible code snippet
#     str[0] = (str[0] + int(key[i]) % 26)
#      $$\    $$\ $$\                                                             
#      $$ |   $$ |\__|                                                            
#      $$ |   $$ |$$\  $$$$$$\   $$$$$$\  $$$$$$$\   $$$$$$\   $$$$$$\   $$$$$$\  
#      \$$\  $$  |$$ |$$  __$$\ $$  __$$\ $$  __$$\ $$  __$$\ $$  __$$\ $$  __$$\ 
#       \$$\$$  / $$ |$$ /  $$ |$$$$$$$$ |$$ |  $$ |$$$$$$$$ |$$ |  \__|$$$$$$$$ |
#        \$$$  /  $$ |$$ |  $$ |$$   ____|$$ |  $$ |$$   ____|$$ |      $$   ____|
#         \$  /   $$ |\$$$$$$$ |\$$$$$$$\ $$ |  $$ |\$$$$$$$\ $$ |      \$$$$$$$\ 
#          \_/    \__| \____$$ | \_______|\__|  \__| \_______|\__|       \_______|
#                     $$\   $$ |                                                  
#                     \$$$$$$  |                                                  
#                      \______/                                                   
# """


# class Vigenere:

#     def __init__(self, input = None, output = None):
#         if not input is None:
#             self.Input = input
#         if not output is None:
#             self.Output = output

#         self.alphabet = [chr(x + 65) for x in range(26)]
#         self.Words = "Dictionary_Words.txt"
#         self.Plaintext = None
#         self.CipherText = None
#         self.Encrypted = ""
#         self.Decrypted = None
#         self.EncryptionKey = None
#         self.Encrypt = False
#         self.Decrypt = False

#         ## List to keep track of the different keys to test
#         self.KeyOrder = []

    
#     def setIn_N_Out(self,**kargs):
#         self.Input = kargs.get("input_file",None)
#         self.Output = kargs.get("output_file",None)

    
#     def setOperation(self, **kargs):
#         if kargs["operation"] == 'Encrypt':
#             self.Encrypt = True
#             print("We are Encrypting")
#             self.Encrypt (**kargs)
        
#         else:
#             self.Decrypt = True
#             print("We are Decrypting")
#             self.Index_Of_Coincidence(**kargs)


#     def Index_Of_Coincidence(self, **kargs):
#         print("IOC Method")

#         with open(self.Input,'r') as f:
#             self.Encrypted = f.read()

#         min_key_length = 2
#         max_key_length = 16
#         group_of = []

#         ## Normalize all data by Upercasing everything
#         self.Encrypted = self.Encrypted.upper()

#         reduced = self.Encrypted.replace()

#         print(self.Encrypted,"\n")
#         print("Reduced Message is:\n",reduced,"\n")

#         for i in range(min_key_length, max_key_length, 1):
#             KL = i

#             for j in range(0, KL, 1):
#                 temp = ""
#                 index = j
#                 sequences = []

#                 print("index is:", index)

#                 for letter in reduced:
#                     if index < len(reduced):
#                         temp += reduced[index]

#                     index = index + KL
                    
#                 sequences.append(temp)
#                 self.CryptoMath(sequences)

#         group_of.append(sequences)


#     def CryptoMath(self, Slices):
#         print("In CryptoMath")
#         print(Slices)

#         ## Need a dictionary or parallel lists to count letter frequency

#         Final_IOC = float()
#         Sigma_Big_N = len(self.Encrypted)       ## Length of our Cipher Text
#         Sigma_Small_n = float()
#         Numerator = float()
#         Denominator = float()

#     # Loic Start implementing the encrypt function
#     # str[0] = (str[0] + int(key[i]) % 26)
#     # The ord() function returns an integer representing the Unicode character.
    
#     def Encrypt(self,**kargs):
    
#         key = kargs.get('key',None)

#         # should test if file exists
#         with open(self.Input, 'r') as f:
#             self.Plaintext = f.read()

#         Plaintext = self.Plaintext.upper()        
#         print(self.Plaintext)
        
#         self.CipherText = " "
        
#         i = 0
#         for letter in Plaintext:
#             if letter in self.alphabet:

#                 a = ord(letter)-65
#                 b = ord(key[i])-65
#                 self.CipherText.txt += chr(((a+b)%26)+65)

#                 i = (i + 1) % len(key)
#             else:
#                 self.CipherText.txt += letter

#         with open(self.Output, 'w') as f:
#             f.write(self.CipherText.txt)
#         return self.CipherText.txt
    

#     ## Loic start implementing the dictionary attack
#     def Decrypt(self,**kargs):# was self,cipheredtext,key

#         key = kargs.get('key',None)

#         #cipheredtext = cipheredtext.lower()

#         # should test if file exists
#         with open(self.Input, 'r') as f:
#             ciphertext = f.read()
#         ciphertext = ciphertext.lower()
#         self.plain_text = ""

#         i = 0
#         for letter in ciphertext:
#             if letter in self.alphabet:

#                 a = ord(letter)-97
#                 b = ord(key[i])-97
#                 self.plain_text += chr(((a-b)%26)+97)

#                 i = (i + 1) % len(key)
#             else:
#                 self.plain_text += letter
        
#         #return self.plain_text
#         with open(self.Output,'w') as f:
#             f.write(self.plain_text)

# """
#     $$\                                                             
#     $$ |                                                            
#     $$ |  $$\ $$\  $$\  $$\  $$$$$$\   $$$$$$\   $$$$$$\   $$$$$$$\ 
#     $$ | $$  |$$ | $$ | $$ | \____$$\ $$  __$$\ $$  __$$\ $$  _____|
#     $$$$$$  / $$ | $$ | $$ | $$$$$$$ |$$ |  \__|$$ /  $$ |\$$$$$$\  
#     $$  _$$<  $$ | $$ | $$ |$$  __$$ |$$ |      $$ |  $$ | \____$$\ 
#     $$ | \$$\ \$$$$$\$$$$  |\$$$$$$$ |$$ |      \$$$$$$$ |$$$$$$$  |
#     \__|  \__| \_____\____/  \_______|\__|       \____$$ |\_______/ 
#                                                 $$\   $$ |          
#                                                 \$$$$$$  |          
#                                                 \______/      
#     Helper Function to strip out key arguments that are passed in 
#     when running the program            
#     Processes argv list into plain args (list) and kwargs (dict).
#     Just easier than using a library like argparse for small things.
#     Example:
#         python file.py arg1 arg2 arg3=val1 arg4=val2 -arg5 -arg6 --arg7
#         Would create:
#             args[arg1, arg2, -arg5, -arg6, --arg7]
#             kargs{arg3 : val1, arg4 : val2}
#         kargs with dashes (flags) can now be processed seperately
#     Shortfalls:
#         spaces between k=v would result in bad kargs
#         Flags aren't handled at all. Maybe in the future but this function
#             is meant to be simple.
#     Returns:
#         tuple  (args,kargs)          
                    
# # """

# def mykwargs(argv):
#     args = []
#     kargs = {}

#     for arg in argv:
#         if '=' in arg:
#             key,val = arg.split('=')
#             kargs[key] = val
#         else:
#             args.append(arg)
#     return args,kargs




# """
#     $$\      $$\           $$\                 $$$$$$$\  $$\                     $$\       
#     $$$\    $$$ |          \__|                $$  __$$\ $$ |                    $$ |      
#     $$$$\  $$$$ | $$$$$$\  $$\ $$$$$$$\        $$ |  $$ |$$ | $$$$$$\   $$$$$$$\ $$ |  $$\ 
#     $$\$$\$$ $$ | \____$$\ $$ |$$  __$$\       $$$$$$$\ |$$ |$$  __$$\ $$  _____|$$ | $$  |
#     $$ \$$$  $$ | $$$$$$$ |$$ |$$ |  $$ |      $$  __$$\ $$ |$$ /  $$ |$$ /      $$$$$$  / 
#     $$ |\$  /$$ |$$  __$$ |$$ |$$ |  $$ |      $$ |  $$ |$$ |$$ |  $$ |$$ |      $$  _$$<  
#     $$ | \_/ $$ |\$$$$$$$ |$$ |$$ |  $$ |      $$$$$$$  |$$ |\$$$$$$  |\$$$$$$$\ $$ | \$$\ 
#     \__|     \__| \_______|\__|\__|  \__|      \_______/ \__| \______/  \_______|\__|  \__|
                                                                                                                                                                                                                                                   
# """

    
# if __name__=='__main__':
        
#     V1 = Vigenere()

#     argv = sys.argv[1:]                     # strip file name (main.py) out of args

#     args,program_kargs = mykwargs(argv)
        
#     try:

#         V1.setIn_N_Out(**program_kargs)
#         V1.setOperation(**program_kargs)
        
#         # keeps window alive

#     except:

#         print("Looks like you're missing some parameters, here's what you need.\n")
#         print("Example run: python3 filename.py input_file=[inputfile name] output_file=[outputfile name] operation=[Encrypt or Decrypt] encryption_key=[key]\n")
#         print("Decrypt:","python3 Vigenere.py input_file=ciphertext.txt output_file=decrypted.txt operation=Decrypt encryption_key=none")
#         print("Encrypt:","python3 Vigenere.py input_file=plaintext.txt output_file=encrypted.txt operation=Encrypt encryption_key=factorial")
#         sys.exit()
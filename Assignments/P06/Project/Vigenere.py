import sys
import copy

"""
    ***Examples terminal commands to run the program***
        
        run = "python3 Vigenere.py input_file=ciphertext.txt output_file=decrypted.txt operation=Decrypt encryption_key=none"
        run = "python3 Vigenere.py input_file=plaintext.txt output_file=encrypted.txt operation=Encrypt encryption_key=factorial"

    *** Encryption Example***

        Operation: Encrypt
        Plaintext Message: a group of crows is called a murder
        Key: Vixen

        Repeated Key:      V IXENV IX ENVIX EN VIXENV I XENVIX
        Plaintext Message: a group of crows is called a murder
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

    def __init__(self, input=None, output=None):
        if not input is None:
            self.Input = input
        if not output is None:
            self.Output = output

        self.Words = "Dictionary_Words.txt"
        self.Plaintext = None
        self.CipherText = None
        self.Encrypted = None
        self.Decrypted = None
        self.EncryptionKey = None
        self.Encrypt = False
        self.Decrypt = False

        ## List to keep track of the different keys to test
        self.KeyInfo = []
        self.KeyOrder = []

    
    
    def setIn_N_Out(self,**params):
        try:
            self.Input = params.get("input_file",None)
            self.Output = params.get("output_file",None)

        except:
            print("File not Found Error")

    

    def setOperation(self, **params):
        if params["operation"] == 'Encrypt':
            self.Encrypt = True
            print("We are Encrypting")
            self.vigenere_cipher_encrypt(**params)
        
        else:
            self.Decrypt = True
            print("We are Decrypting")
            self.Index_Of_Coincidence(**params)
            self.vigenere_cipher_decrypt(**params)



    def Index_Of_Coincidence(self, **params):
        print("IOC Method")
        
        Key_Result = {
            "IOC": float(),
            "Key_Length": 0,
            "SubStrings": []
        }

        with open(self.Input,'r') as f:
            self.Encrypted = f.read()

        min_key_length = 2
        max_key_length = 16

        ## Normalize all data by Upercasing everything
        self.Encrypted = self.Encrypted.upper()

        reduced = self.Encrypted.replace(" ", "")

        print(self.Encrypted,"\n")
        print("Reduced Message is:\n",reduced,"\n")

        for i in range(min_key_length, max_key_length + 1, 1):
            KL = i
            sequences = []


            Key_Result["Key_Length"] = KL
            print("Key Length is:", KL)

            for j in range(0, KL, 1):
                temp = ""
                index = j

                for letter in reduced:
                    if index < len(reduced):
                        temp += reduced[index]

                    index = index + KL
                    
                sequences.append(temp)

            Key_Result["IOC"] = self.CryptoMath(sequences)
            Key_Result["SubStrings"] = sequences

            self.KeyInfo.append(copy.deepcopy(Key_Result))

        self.KeyOrder = sorted(self.KeyInfo, key = lambda i: i['IOC'], reverse=True)

        self.Dictionary_Attack(**params)

        # print()
        # print("Sorted Testing Order:")
        # for key in self.KeyOrder:

        #     print("IOC Score:", key['IOC'], "Key Length:", key['Key_Length'])



    def CryptoMath(self, Slices):
    
        print("In CryptoMath")

        Key_IOC = float()
        Temp_IOC = float()
        Final_IOC = float()
        Result = float()
        Stack_Size = len(Slices)
        

        for i in range(0, len(Slices), 1):

            letters = []
            alphabet = [chr(x+65) for x in range(26)]
            frequency = [0] * 26

            temp = Slices[i]
            # print(temp)
            # print()

            letters = list(temp)
            #print(letters)

            index = 0

            for char in alphabet:

                for letter in letters:

                    if char == letter:

                        frequency[index] += 1

                index += 1


            #print(frequency)

            for num in frequency:

                Sigma_Big_N = len(temp)
                Sigma_Small_n = float(num)
                Numerator = (Sigma_Small_n * (Sigma_Small_n - 1))
                Denominator = float()
                Denominator = (Sigma_Big_N * (Sigma_Big_N - 1))

                Temp_IOC = Numerator / Denominator

                Result += Temp_IOC


        Final_IOC = Result / Stack_Size
        print("Final IOC is:", Final_IOC)
        return Final_IOC



    def Dictionary_Attack(self, **params):

        pass


    def vigenere_cipher_encrypt(self, **kwargs):
        input_file = kwargs.get('input',None)
        output_file = kwargs.get('output',None)
        key = kwargs.get('key',None)

        # should test if file exists
        with open(input_file) as f:
            plaintext = f.read()

        plaintext = plaintext.lower()
        print("hello encrypt")
        ciphertext = ''

        i = 0
        for letter in plaintext:
            if letter in self.ALPHABET:
            
                a = ord(letter)-97
                b = ord(key[i])-97
                ciphertext += chr(((a+b)%26)+97)

                i = (i + 1) % len(key)
            else:
                ciphertext += letter

        with open(output_file,'w') as f:
            f.write(ciphertext)
        print("Cipher text:", ciphertext)
            


    def vigenere_cipher_decrypt(self, **kwargs):
        input_file = kwargs.get('input',None)
        output_file = kwargs.get('output',None)
        key = kwargs.get('key',None)


        # should test if file exists
        with open(input_file) as f:
            ciphertext = f.read()
        
        print("hello world!")

        decrypted = ''
        i = 0
        for letter in ciphertext:
            if letter in self.ALPHABET:
                a = ord(letter)-97
                b = ord(key[i])-97
                decrypted += chr(((a-b)%26)+97)

                i = (i + 1) % len(key)
            else:
                decrypted += letter

        with open(output_file,'w') as f:
            f.write(decrypted)
        print("Decrypted text:", decrypted)



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

        Params with dashes (flags) can now be processed seperately
    Shortfalls:
        spaces between k=v would result in bad params
        Flags aren't handled at all. Maybe in the future but this function
            is meant to be simple.
    Returns:
        tuple  (args,kargs)          
                    
"""


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
    """
    Main block
    """
    V1 = Vigenere()

    argv = sys.argv[1:]                     # strip file name (main.py) out of args

    args,program_params = mykwargs(argv)

    # V1.setIn_N_Out(**program_params)
    # V1.setOperation(**program_params)

    try:

        V1.setIn_N_Out(**program_params)
        V1.setOperation(**program_params)


    except:

        print("Looks like you're missing some parameters, here's what you need.\n")
        print("Example run: python3 filename.py input_file=[inputfile name] output_file=[outputfile name] operation=[Encrypt or Decrypt] encryption_key=[key]\n")
        print("Decrypt:","python3 Vigenere.py input_file=ciphertext.txt output_file=decrypted.txt operation=Decrypt encryption_key=none")
        print("Encrypt:","python3 Vigenere.py input_file=plaintext.txt output_file=encrypted.txt operation=Encrypt encryption_key=factorial")
        sys.exit()

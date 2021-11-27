import sys
import copy
import time

"""
    ***Examples terminal commands to run the program***
        
        run = "python3 Vigenere.py input_file=ciphertext.txt output_file=decrypted.txt operation=Decrypt encryption_key=none"
        run = "python3 Vigenere.py input_file=plaintext.txt output_file=encrypted.txt operation=Encrypt encryption_key=factorial"

        run = "python3 Vigenere.py input_file=VCT1.txt output_file=decrypted.txt operation=Decrypt encryption_key=none"

    *** Encryption Example***

        Operation: Encrypt
        Plaintext Message: a group of crows is called a murder
        Key: Vixen

        Repeated Key:      V IXENV IX ENVIX EN VIXENV I XENVIX
        Plaintext Message: a group of crows is called a murder
        Encrypted Message: V OOSJK WC GEKEP MF XIIPRY I JCEYMO



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

            self.output = output

        self.Plaintext = None
        self.EncryptionKey = None

        self.CipherText = None
        self.Encrypted = None
        self.Decrypted = None

        self.Encrypt = False
        self.Decrypt = False

        self.Cracked = False
        self.highest = None

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
            self.t1 = time.perf_counter()
        
        else:
            self.Decrypt = True
            print("We are Decrypting")
            self.Index_Of_Coincidence(**params)



    """
    $$$$$$\     $$$$$$\      $$$$$$\  
    \_$$  _|   $$  __$$\    $$  __$$\ 
      $$ |     $$ /  $$ |   $$ /  \__|
      $$ |     $$ |  $$ |   $$ |      
      $$ |     $$ |  $$ |   $$ |      
      $$ |     $$ |  $$ |   $$ |  $$\ 
    $$$$$$\ $$\ $$$$$$  |$$\\$$$$$$  |
    \______|\__|\______/ \__|\______/ 
                                                     
    """


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


    """
    
     $$$$$$\                                 $$\               $$\      $$\            $$\     $$\       
    $$  __$$\                                $$ |              $$$\    $$$ |           $$ |    $$ |      
    $$ /  \__| $$$$$$\  $$\   $$\  $$$$$$\ $$$$$$\    $$$$$$\  $$$$\  $$$$ | $$$$$$\ $$$$$$\   $$$$$$$\  
    $$ |      $$  __$$\ $$ |  $$ |$$  __$$\\_$$  _|  $$  __$$\ $$\$$\$$ $$ | \____$$\\_$$  _|  $$  __$$\ 
    $$ |      $$ |  \__|$$ |  $$ |$$ /  $$ | $$ |    $$ /  $$ |$$ \$$$  $$ | $$$$$$$ | $$ |    $$ |  $$ |
    $$ |  $$\ $$ |      $$ |  $$ |$$ |  $$ | $$ |$$\ $$ |  $$ |$$ |\$  /$$ |$$  __$$ | $$ |$$\ $$ |  $$ |
    \$$$$$$  |$$ |      \$$$$$$$ |$$$$$$$  | \$$$$  |\$$$$$$  |$$ | \_/ $$ |\$$$$$$$ | \$$$$  |$$ |  $$ |
     \______/ \__|       \____$$ |$$  ____/   \____/  \______/ \__|     \__| \_______|  \____/ \__|  \__|
                        $$\   $$ |$$ |                                                                   
                        \$$$$$$  |$$ |                                                                   
                         \______/ \__|                                                                   
    """


    def CryptoMath(self, Slices):
    
        print("In CryptoMath")

        Temp_IOC = float()
        Final_IOC = float()
        Result = float()
        Stack_Size = len(Slices)
        

        for i in range(0, len(Slices), 1):

            letters = []
            alphabet = [chr(x+65) for x in range(26)]
            frequency = [0] * 26

            temp = Slices[i]

            letters = list(temp)

            index = 0

            for char in alphabet:

                for letter in letters:

                    if char == letter:

                        frequency[index] += 1

                index += 1


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




    """
    $$$$$$$\  $$\             $$\     $$\                                                         
    $$  __$$\ \__|            $$ |    \__|                                                        
    $$ |  $$ |$$\  $$$$$$$\ $$$$$$\   $$\  $$$$$$\  $$$$$$$\   $$$$$$\   $$$$$$\  $$\   $$\       
    $$ |  $$ |$$ |$$  _____|\_$$  _|  $$ |$$  __$$\ $$  __$$\  \____$$\ $$  __$$\ $$ |  $$ |      
    $$ |  $$ |$$ |$$ /        $$ |    $$ |$$ /  $$ |$$ |  $$ | $$$$$$$ |$$ |  \__|$$ |  $$ |      
    $$ |  $$ |$$ |$$ |        $$ |$$\ $$ |$$ |  $$ |$$ |  $$ |$$  __$$ |$$ |      $$ |  $$ |      
    $$$$$$$  |$$ |\$$$$$$$\   \$$$$  |$$ |\$$$$$$  |$$ |  $$ |\$$$$$$$ |$$ |      \$$$$$$$ |      
    \_______/ \__| \_______|   \____/ \__| \______/ \__|  \__| \_______|\__|       \____$$ |      
                                                                                  $$\   $$ |      
                                                                                  \$$$$$$  |      
                                                                                    \______/       
                             $$$$$$\    $$\     $$\                         $$\                   
                            $$  __$$\   $$ |    $$ |                        $$ |                  
                            $$ /  $$ |$$$$$$\ $$$$$$\    $$$$$$\   $$$$$$$\ $$ |  $$\             
                            $$$$$$$$ |\_$$  _|\_$$  _|   \____$$\ $$  _____|$$ | $$  |            
                            $$  __$$ |  $$ |    $$ |     $$$$$$$ |$$ /      $$$$$$  /             
                            $$ |  $$ |  $$ |$$\ $$ |$$\ $$  __$$ |$$ |      $$  _$$<              
                            $$ |  $$ |  \$$$$  |\$$$$  |\$$$$$$$ |\$$$$$$$\ $$ | \$$\             
                            \__|  \__|   \____/  \____/  \_______| \_______|\__|  \__|            
                                                                                                                                                                                                                                                                                            
    """

    def Dictionary_Attack(self, **params):

        # with open("Dictionary_Words.txt", "r") as Fin:
            
        #     self.Words = Fin.readlines()


        if not self.Cracked:

            for index in self.KeyOrder:

                self.highest = 0.0
                self.Decrypted = ""
                self.EncryptionKey = ""

                Narrowed = []

                curr = index["Key_Length"]
                print("Testing key length", curr)

                with open("Words.txt", "r") as Fin:
            
                    for word in Fin:

                        if (len(word) - 1) == int(curr):

                            Narrowed.append(copy.deepcopy(word))

                
                message = str(self.Encrypted)

                for temp in Narrowed:

                    j = 0
                    result = ""

                    for i in range(len(message)):
                        
                        if (j >= len(temp) - 1):

                            j = 0

                        if message[i] == " ":

                            result += " "

                        else:

                            letter = (ord(message[i]) - ord(temp[j])) % 26
                            letter += ord('A')
                            result += chr(letter)
                            j += 1

                    self.Score_Results(result, temp)

                print("Encrypted text of:", self.Encrypted)
                print()
                print("Decrypted to:", self.Decrypted)
                print("Encryption Key:", self.EncryptionKey)

                answer = ""

                try:
                    print("Was Decryption successful? Y/N")
                    answer = str(input())

                    if answer == 'Y':

                        print("Encryption successful")
                        self.Cracked = True
                        break

                    if answer == 'N':

                        continue
                        
                except:
                    print("Please enter either Y or N")


    """
     $$$$$$\                                                                                
    $$  __$$\                                                                               
    $$ /  \__| $$$$$$$\  $$$$$$\   $$$$$$\   $$$$$$\                                        
    \$$$$$$\  $$  _____|$$  __$$\ $$  __$$\ $$  __$$\                                       
     \____$$\ $$ /      $$ /  $$ |$$ |  \__|$$$$$$$$ |                                      
    $$\   $$ |$$ |      $$ |  $$ |$$ |      $$   ____|                                      
    \$$$$$$  |\$$$$$$$\ \$$$$$$  |$$ |      \$$$$$$$\                                       
    \______/  \_______| \______/ \__|       \_______|                                      
                                                                                            
                                                                                                                                            
                            $$$$$$$\                                $$\   $$\               
                            $$  __$$\                               $$ |  $$ |              
                            $$ |  $$ | $$$$$$\   $$$$$$$\ $$\   $$\ $$ |$$$$$$\    $$$$$$$\ 
                            $$$$$$$  |$$  __$$\ $$  _____|$$ |  $$ |$$ |\_$$  _|  $$  _____|
                            $$  __$$< $$$$$$$$ |\$$$$$$\  $$ |  $$ |$$ |  $$ |    \$$$$$$\  
                            $$ |  $$ |$$   ____| \____$$\ $$ |  $$ |$$ |  $$ |$$\  \____$$\ 
                            $$ |  $$ |\$$$$$$$\ $$$$$$$  |\$$$$$$  |$$ |  \$$$$  |$$$$$$$  |
                            \__|  \__| \_______|\_______/  \______/ \__|   \____/ \_______/ 
                                                                                                                                                                                                                                                                            
    """

    def Score_Results(self, stuff, potkey):

            alphabet = [chr(x+65) for x in range(26)]
            Temp_IOC = float()
            Result = float()


            letters = []
            frequency = [0] * 26


            letters = list(stuff)

            index = 0

            for char in alphabet:

                for letter in letters:

                    if char == letter:

                        frequency[index] += 1

                index += 1

            for num in frequency:

                Sigma_Big_N = len(stuff)
                Sigma_Small_n = float(num)
                Numerator = (Sigma_Small_n * (Sigma_Small_n - 1))
                Denominator = float()
                Denominator = (Sigma_Big_N * (Sigma_Big_N - 1))

                Temp_IOC = Numerator / Denominator

                Result += Temp_IOC

            if Result > self.highest:

                print("Pushing new Result", Result)
                self.highest = Result
                self.Decrypted = stuff
                self.EncryptionKey = potkey



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

    t1 = time.perf_counter()
    V1.setIn_N_Out(**program_params)
    V1.setOperation(**program_params)
    t2 = time.perf_counter()

    print(f"Cipher cracked in: {t2-t1:0.4f} seconds")

    # try:

    #     tic = time.perf_counter()
    #     V1.setIn_N_Out(**program_params)
    #     V1.setOperation(**program_params)
    #     toc = time.perf_counter()
    #     print(f"Finished in {toc-tic:0.4f} seconds")


    # except:

    #     print("Looks like you're missing some parameters, here's what you need.\n")
    #     print("Example run: python3 filename.py input_file=[inputfile name] output_file=[outputfile name] operation=[Encrypt or Decrypt] encryption_key=[key]\n")
    #     print("Decrypt:","python3 Vigenere.py input_file=ciphertext.txt output_file=decrypted.txt operation=Decrypt encryption_key=none")
    #     print("Encrypt:","python3 Vigenere.py input_file=plaintext.txt output_file=encrypted.txt operation=Encrypt encryption_key=factorial")
    #     sys.exit()

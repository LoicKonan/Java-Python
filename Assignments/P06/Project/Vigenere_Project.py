import sys
import copy
import time

"""
    ***Examples terminal commands to run the program***
        
        run = "python3 Vigenere.py input_file=ciphertext.txt output_file=decrypted.txt operation=Decrypt encryption_key=none"
        run = "python3 Vigenere.py input_file=plaintext.txt output_file=encrypted.txt operation=Encrypt encryption_key=VIXEN"

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

    def __init__(self, input_file=None, output_file=None):

        if not input_file is None:

            self.Input = input_file

        if not output_file is None:

            self.output = output_file

        ## Variables used to keep track of the before and after message/s
        self.Plaintext = None
        self.EncryptionKey = None
        self.CipherText = None
        self.Encrypted = None
        self.Decrypted = None

        ## Bool status variables
        self.Encrypt = False
        self.Decrypt = False

        ## Class global variables used in the scoring method
        self.Cracked = False
        self.highest = None

        ## List to keep track of the different keys to test
        self.KeyInfo  = []
        self.KeyOrder = []

    
    """
    $$$$$$\ $$\   $$\         $$\   $$\          $$$$$$\  $$\   $$\ $$$$$$$$\ 
    \_$$  _|$$$\  $$ |        $$$\  $$ |        $$  __$$\ $$ |  $$ |\__$$  __|
      $$ |  $$$$\ $$ |        $$$$\ $$ |        $$ /  $$ |$$ |  $$ |   $$ |   
      $$ |  $$ $$\$$ |$$$$$$\ $$ $$\$$ |$$$$$$\ $$ |  $$ |$$ |  $$ |   $$ |   
      $$ |  $$ \$$$$ |\______|$$ \$$$$ |\______|$$ |  $$ |$$ |  $$ |   $$ |   
      $$ |  $$ |\$$$ |        $$ |\$$$ |        $$ |  $$ |$$ |  $$ |   $$ |   
    $$$$$$\ $$ | \$$ |        $$ | \$$ |         $$$$$$  |\$$$$$$  |   $$ |   
    \______|\__|  \__|        \__|  \__|         \______/  \______/    \__|   


                                                    BURGERS

            This method will receives the **params dictionary object and will
            strip out the input and output file destinations that are sent at
            run time and set those values.

            The next method, setOperation is immediately called afterwards and
            will also receive a copy of **params and will strip out the value
            operation and determine where to go next depending on if the op is
            Encrypt or Decrypt.                                                                                                                                               
    """  

    def setIn_N_Out(self):

        try:
            Operation = input("Are we Encrypting or Decrypting?")

            if Operation == "Encrypting":
                self.Encrypt = True

            elif Operation == "Decrypting":
                self.Decrypt = True

        except:
            print("Invalid input please try again")

        try:

            if self.Encrypt == True:

                PT = input("Enter the plaintext message to be encrypted: ")
                self.Plaintext = PT

                self.EncryptionKey = input("Enter the encryption key: ")
                self.EncryptionKey = self.EncryptionKey.upper()

            else:
                CT = input("Enter the Vigenere message to be decrypted: ")
                self.Encrypted = CT

        except:
            print("Error")

        
    def getPath(self):

        if self.Encrypt == True:

            self.Encrypt_Message()

        else:

            self.Index_Of_Coincidence()


    """
        $$$$$$$$\                                                    $$\     
        $$  _____|                                                   $$ |    
        $$ |      $$$$$$$\   $$$$$$$\  $$$$$$\  $$\   $$\  $$$$$$\ $$$$$$\   
        $$$$$\    $$  __$$\ $$  _____|$$  __$$\ $$ |  $$ |$$  __$$\\_$$  _|  
        $$  __|   $$ |  $$ |$$ /      $$ |  \__|$$ |  $$ |$$ /  $$ | $$ |    
        $$ |      $$ |  $$ |$$ |      $$ |      $$ |  $$ |$$ |  $$ | $$ |$$\ 
        $$$$$$$$\ $$ |  $$ |\$$$$$$$\ $$ |      \$$$$$$$ |$$$$$$$  | \$$$$  |
        \________|\__|  \__| \_______|\__|       \____$$ |$$  ____/   \____/ 
                                                $$\   $$ |$$ |               
                                                \$$$$$$  |$$ |               
                                                 \______/ \__|               
    

            Encrypt will receive a copy of **params and will use that to
            read in the plaintext message and the encryption key that was
            passed in and use that to encrypt the message and print the
            result to the terminal/GUI and update the file destination.

            The encrypt process is the same as the Decrypt process but
            instead of subtracting the key % 26 we're adding.
    """

    def Encrypt_Message(self):

        # with open(self.Input,'r') as f:
        #     self.Plaintext = f.read()

        msg = self.Plaintext
        msg = msg.upper()
        crypt_key = self.EncryptionKey
        print("Plaintext:", msg)
        print("Encryption Key:", crypt_key)
        
        
        j = 0
        result = ""
        for i in range(len(msg)):

            if (j >= len(crypt_key)):

                j = 0

            if msg[i] == " ":

                result += " "
                continue

            else:

                letter = (ord(msg[i]) + ord(crypt_key[j])) % 26
                letter += ord('A')
                result += chr(letter)
                j += 1

        print()
        print("New Encrypted Message is:", result, "\n")
        # f.close()



    """
                        $$$$$$\     $$$$$$\      $$$$$$\  
                        \_$$  _|   $$  __$$\    $$  __$$\ 
                          $$ |     $$ /  $$ |   $$ /  \__|
                          $$ |     $$ |  $$ |   $$ |      
                          $$ |     $$ |  $$ |   $$ |      
                          $$ |     $$ |  $$ |   $$ |  $$\ 
                        $$$$$$\ $$\ $$$$$$  |$$\\$$$$$$  |
                        \______|\__|\______/ \__|\______/ 


        This method is responsible for testing all of the different possible
		key lengths of the key that the cipher text was encrypted with. For this
		program, we are testing a key length of 2 all the way to a potential key
		length of 16. The testing calculates the I.O.C value of a key length which involves 
		splitting the cipher text into sequences according to the key length. If a key
		length is 2, we turn the cipher text into two sequences, alternating every other
		character and then these are stored in a list and sent to the Cryptomath
		method. After that method call is complete, the loop iterates, and the next
		possible key length is tested.
    """


    def Index_Of_Coincidence(self):

        print("IOC Method")
        
        Key_Result = {
            "IOC": float(),
            "Key_Length": 0,
            "SubStrings": []
        }

        # with open(self.Input,'r') as f:
        #     self.Encrypted = f.read()

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


        ## Sorting the dictionary of objects by highest IOC value
        self.KeyOrder = sorted(self.KeyInfo, key = lambda i: i['IOC'], reverse=True)

        self.Dictionary_Attack()


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
    
    
    
        Method is directly called from the Index of Coincidence method and receives a
		slcies list object that has the separate slices of sequences according to the key
        length that is being tested. The testing process involves counting the instances 
        of letters occuring more than once in the slices instance tfrom the last method. 
        This eventually results in an Index of Coincidence value such as: 0.048. Once 
		completed, the IOC value is stored in a list of dictionary objects that will be
        sorted later by this value. The highest score indicates the most "English Like"
        and therefore that is the most likely key length to begin the dictionary attack on.

		For more information on the math involved in calculating the index of coincidence,
		please see the following references:

			- https://en.wikipedia.org/wiki/Index_of_coincidence
			- https://www.dcode.fr/index-coincidence
			- http://practicalcryptography.com/cryptanalysis/text-characterisation/index-coincidence/

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
                                                                                                                                                                                                                                                                                            
    
    
            Method is responsible for utilizing the results of the most likely key
            lengths, and eventually performing a dictionary attack on the cipher.
            This is of course assuming that the key that was used to encrypt the cipher
            is a dictionary word. A list of words from the dictionary file are read in 
            and then a narrowed version is created by appending words that are equal to 
            the key length we are testing. This helps us eliminate the majority of
            the dictionary words and limit it to only words that are of the key length.

            Once this is completed, the method will brute force every shift combination
            of this narrowed list of dictionary words and pass the result to the Score Results
            method and determine the result. 
    """

    def Dictionary_Attack(self):

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

                
                Fin.close()
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

                    if answer.upper() == 'Y':

                        print("Encryption successful")
                        self.Cracked = True
                        break

                    if answer.upper() == 'N':

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
                                                                                                                                                                                                                                                                            
    

            The score Results method is nearly identical to the Index of Coincidence
            method and in fact share most of the same code. The only difference is that
            the I.O.C method is testing key lengths are therefore is splitting the message
            into sequences and testing each sequence. Since we are testing the whole message
            and not key lengths, we skip the sequence splitting part and just test the 
            message using the same math. Whichever result scores the highest is updated and
            eventually once the process is done, ideally, the highest scoring result should be
            the correct result and is the most English-like.

            I say ideally because this caveat will be discussed in class as the I.O.C is much
            more reliable when it has more text to work with. On larger results, this calculation
            is bulletproof reliable. However, on shorter sample sizes, it is not always 100% and
            in fact non-English-Like results can score higher than the actual correct result.
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

    t1 = time.perf_counter()

    V1.setIn_N_Out()
    V1.getPath()


    t2 = time.perf_counter()

    print(f"Cipher cracked in: {t2-t1:0.4f} seconds")

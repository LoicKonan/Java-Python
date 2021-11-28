import sys
import copy
import time

import tkinter as tk

FONT = ("calbri", 20, "bold")


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



    def Encrypt_Message(self):

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


    def Index_Of_Coincidence(self):

        print("IOC Method")
        
        Key_Result = {
            "IOC": float(),
            "Key_Length": 0,
            "SubStrings": []
        }

       
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
                    

    def Dictionary_Attack(self):

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

                    if answer == 'Y':

                        print("Encryption successful")
                        self.Cracked = True
                        break

                    if answer == 'N':

                        continue
                        
                except:
                    print("Please enter either Y or N")
                    

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
   


    #####################################
    ###############  GUI  ###############
    #####################################

class Vigenere_GUI(Vigenere):
    
    def __init__(self, master):
        master.title("Byron Dowling & Loic Konan \n Vigenère Cipher")
        self.plaintext = tk.StringVar(master, value="")
        self.ciphertext = tk.StringVar(master, value="")
        self.key = tk.IntVar(master)

        # Plaintext controls
        self.plain_label = tk.Label(master, text="Plaintext", fg="green", font=FONT).grid(row=0, column=0)
        self.plain_entry = tk.Entry(master,
                                    textvariable=self.plaintext, width=50, font=FONT)
        self.plain_entry.grid(row=0, column=1, padx=20)
        self.encrypt_button = tk.Button(master, text="Encrypt",
                                        command=lambda: self.encrypt_callback(), font=FONT).grid(row=0, column=2)
        self.plain_clear = tk.Button(master, text="Clear",
                                     command=lambda: self.clear('plain'), font=FONT).grid(row=0, column=3)

        # Key controls
        self.key_label = tk.Label(master, text="Key", font=FONT).grid(row=1, column=0)
        self.key_entry = tk.Entry(master, textvariable=self.key, width=10, font=FONT).grid(row=1, column=1,
                                                                                           sticky=tk.W, padx=20)

        # Ciphertext controls
        self.cipher_label = tk.Label(master, text="Ciphertext", fg="red", font=FONT).grid(row=2, column=0)
        self.cipher_entry = tk.Entry(master,
                                     textvariable=self.ciphertext, width=50, font=FONT)
        self.cipher_entry.grid(row=2, column=1, padx=20)
        self.decrypt_button = tk.Button(master, text="Decrypt",
                                        command=lambda: self.decrypt_callback(), font=FONT).grid(row=2, column=2)
        self.cipher_clear = tk.Button(master, text="Clear",
                                      command=lambda: self.clear('cipher'), font=FONT).grid(row=2, column=3)

    def clear(self, str_val):
        if str_val == 'cipher':
            self.cipher_entry.delete(0, 'end')
        elif str_val == 'plain':
            self.plain_entry.delete(0, 'end')

    def get_key(self):
        try:
            key_val = self.key.get()
            return key_val
        except tk.TclError:
            pass


    def encrypt_callback(self):
        key = self.get_key()
        ciphertext = Vigenere.Encrypt_Message(self.plain_entry.get(), key)
        self.cipher_entry.delete(0, tk.END)
        self.cipher_entry.insert(0, ciphertext)

    def decrypt_callback(self):
        key = self.get_key()
        plaintext = Vigenere.Index_Of_Coincidence(self.cipher_entry.get(), key)
        self.plain_entry.delete(0, tk.END)
        self.plain_entry.insert(0, plaintext)



if __name__ == "__main__":
    
    
    root = tk.Tk()
    V1 = Vigenere_GUI(root)    
    
    t1 = time.perf_counter()

    V1.setIn_N_Out()
    V1.getPath()


    t2 = time.perf_counter()

    print(f"Cipher cracked in: {t2-t1:0.4f} seconds")
    
    root.mainloop()

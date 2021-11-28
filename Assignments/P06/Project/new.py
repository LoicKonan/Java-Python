import tkinter as tk

FONT = ("calbri", 20, "bold")

class Vigenere_GUI:
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

        # Ciphertext controls
        self.cipher_label = tk.Label(master, text="Ciphertext", fg="red", font=FONT).grid(row=2, column=0)
        self.cipher_entry = tk.Entry(master,
                                     textvariable=self.ciphertext, width=50, font=FONT)
        self.cipher_entry.grid(row=2, column=1, padx=20)
        self.decrypt_button = tk.Button(master, text="Decrypt",
                                        command=lambda: self.decrypt_callback(), font=FONT).grid(row=2, column=2)
        self.cipher_clear = tk.Button(master, text="Clear",
                                      command=lambda: self.clear('cipher'), font=FONT).grid(row=2, column=3)

        self.tme_label = tk.Label(master, text="Time", fg="red", font=FONT).grid(row=2, column=0)


    def clear(self, str_val):
        if str_val == 'cipher':
            self.cipher_entry.delete(0, 'end')
        elif str_val == 'plain':
            self.plain_entry.delete(0, 'end')

   

    def encrypt_callback(self):
        ciphertext = encrypt(self.plain_entry.get(), key)
        self.cipher_entry.delete(0, tk.END)
        self.cipher_entry.insert(0, ciphertext)

    def decrypt_callback(self):
        plaintext = decrypt(self.cipher_entry.get(), key)
        self.plain_entry.delete(0, tk.END)
        self.plain_entry.insert(0, plaintext)


def Encrypt_Message(self, **params):
    
        with open(self.Input,'r') as f:
            self.Plaintext = f.read()

        msg = self.Plaintext
        msg = msg.upper()
        crypt_key = params.get("encryption_key", None)
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
        f.close()
        # return ciphertext


def decrypt(ciphertext):
    plaintext = ""
    for char in ciphertext.upper():
        if char.isalpha():
            plaintext += chr((ord(char) - key - 65) % 26 + 65)
        else:
            plaintext += char
    return plaintext


if __name__ == "__main__":
    root = tk.Tk()
    Vigenere = Vigenere_GUI(root)
    root.mainloop()
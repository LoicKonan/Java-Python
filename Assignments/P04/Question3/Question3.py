 #****************************************************************************
 # Author:          Loic Konan 
 # Email:           loickonan.lk@gmail.com 
 # Label:           Question 3 
 # Title:           Programing Assignment 04 
 # Course:          CMPS 4143 
 # Semester:        Fall 2021 
 # Date:            11/10/2021
 # 
 # Description:     
 #                  Write the OOP program in python using class. 
 #                  Assuming you have four classes: Bank account which is 
 #                  the parent class and it has two child classes Saving
 #                  Account class and Checking account class. 
 #                  Customer is another class who has a bank
 #                  account; either saving or checking or both.
 #                  
 # Solution:
 #                  Used  Inheritance:                                                
 #                      - Shown within the saving and checking account.        
 #                  
 #                  Used polymorphism:                                               
 #                       - Shown by overriden the:
 #                              - saving account
 #                              - checking account  
 #                                                             
 #                  abstraction:                                                
 #                      - member variable of each class.                 
 #                                                             
 #                  encapsulation:                                               
 #                      - The Mutators: 
 #                          - set methods
 #                          - getter methods                 
 #
 # Files:           
 #                  Question3.py
 # 
 #****************************************************************************/
 
from abc import abstractmethod, ABC

class B_Account(ABC):
    
    def __init__(self, account_number, balance):
        self.__account_number = account_number
        self.__balance = balance

    def get_Account(self):
        return self.__account_number
    
    def get_Balance(self):
        return self.__balance

    def set_Account(self, account_number):
        self.__account_number = account_number
        
    def set_Balance(self, balance):
        self.__balance = balance


    def deposit(self, amount):
        self.__balance += amount
        print("Your Deposit of  {} $ was successful".format(amount))

    @ abstractmethod
    def withdraw(self, amount):
        if self.__balance >= amount:
            self.__balance -= amount
            print("Your Withdrawl of  {}  $ was successful".format(amount))
        else:
            print("Not enough Money!!!!")

    def Diplay_Balance(self):
        print("Balance : {}".format(self.__balance))

 
    def Account_Information(self):
        return "Acct #       : {}\nAcct Balance : {}".\
            format(self.__account_number, self.__balance)



class SavingsAccount(B_Account):
    
    def __init__(self, account_number, balance, BankingRate = 0.15):
        super().__init__(account_number, balance)
        self.__BankingRate = BankingRate

    def get_CryptoRate(self):
        return self.__BankingRate
    
    def set_CryptoRate(self, BankingRate):
        self.__BankingRate = BankingRate

    def Crypto_BalanceRate(self):
        AddedRate = self.get_Balance() * self.__BankingRate
        print("The Crypto Rate is : {}".format(AddedRate))

    def Account_Information(self):
        return "Savings Acct :\n" + super().Account_Information() + \
        "\nCrypto Rate    : {}".format(self.__BankingRate)
        
    def withdraw(self, amount):
        if self.__balance >= amount:
            self.__balance -= amount
            print("Your Withdrawl of  {}  $ was successful".format(amount))
        else:
            print("Not enough Money!!!!")



class CheckingAccount(B_Account):
    # create constructor
    def __init__(self, account_number, balance, BankingFee):
        super().__init__(account_number, balance)
        self.__BankingFee = BankingFee
   
   
    def get_Fee(self):
        return self.__BankingFee
    
    def set_Fee(self, BankingFee):
        self.__BankingFee = BankingFee


    def withdraw(self, amount):
        super().withdraw(amount)
        self.set_Balance(self.get_Balance() - self.__BankingFee)

    
    def Account_Information(self):
        return "Checking Acct: \n" + super().Account_Information() + \
            "\nCrypto Fee  : {}".format(self.__BankingFee)


class Customer:
   
    def __init__(self, CustomerName, age):
        self.__CustomerName = CustomerName
        self.__age = age
        self.__accounts = []

    
    def get_Name(self):
        return self.__CustomerName
   
    def get_Age(self):
        return self.__age

 
    def set_Name(self, CustomerName):
        self.__CustomerName = CustomerName
    
    def set_Age(self, age):
        self.__age = age


    # method to ad an account for the customer
    def Create_Account(self, account):
        self.__accounts.append(account)


    def get_Account(self, account_number):
        for account in self.__accounts:
            if account.get_Account()== account_number:
                return account
        return None

    def Account_Information(self):
        account_str = "\n"
        for account in self.__accounts:
            account_str += str(account) 
                
        return "CustomerName: {}\nCustomer Age: {}\nAccount ID: {}"\
            .format(self.__CustomerName, self.__age, account_str)


# Driver code

print('\n***********************************************')
print(" Welcome to the First Crypto Currency Bank")
print('***********************************************')    

First_Customer = Customer('Lebron James', 20)
First_Customer.Create_Account(1)
print(First_Customer.Account_Information()) 

print('\n')
First_Customer = CheckingAccount(85, 5000, 3)
print(First_Customer.Account_Information()) 

print('\n')
First_Customer.deposit(300)
print(First_Customer.Account_Information()) 

print('\n')
First_Customer.withdraw(10)
print(First_Customer.Account_Information()) 

print('\n***********************************************')
Second_Customer = Customer('Satoshi Nakamoto', 35)
Second_Customer.Create_Account(2)


print('\n')
Second_Customer = CheckingAccount(1000, 5000, 1)
print(Second_Customer.Account_Information()) 

print('\n')
Second_Customer.deposit(3000)
print(Second_Customer.Account_Information()) 

print('\n')
Second_Customer.withdraw(100)
print(Second_Customer.Account_Information()) 

print('\n***********************************************')

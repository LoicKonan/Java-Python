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

class BankAccount(ABC):
    
    def __init__(self, account_number, balance):
        self.__account_number = account_number
        self.__balance = balance

    def get_account_number(self):
        return self.__account_number
    
    def get_balance(self):
        return self.__balance

    def set_account_number(self, account_number):
        self.__account_number = account_number
        
    def set_balance(self, balance):
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

    def show_balance(self):
        print("Balance : {}".format(self.__balance))

 
    def AccountInformation(self):
        return "Acct #       : {}\nAcct Balance : {}".\
            format(self.__account_number, self.__balance)



class SavingsAccount(BankAccount):
    
    def __init__(self, account_number, balance, BankingRate = 0.15):
        super().__init__(account_number, balance)
        self.__BankingRate = BankingRate

    def get_BankRate(self):
        return self.__BankingRate
    def set_BankRate(self, BankingRate):
        self.__BankingRate = BankingRate

    def BalancePlusRate(self):
        AddedRate = self.get_balance() * self.__BankingRate
        print("The Bank Rate is : {}".format(AddedRate))

    def AccountInformation(self):
        return "Savings Acct :\n" + super().AccountInformation() + \
        "\nBank Rate    : {}".format(self.__BankingRate)
        
    def withdraw(self, amount):
        if self.__balance >= amount:
            self.__balance -= amount
            print("Your Withdrawl of  {}  $ was successful".format(amount))
        else:
            print("Not enough Money!!!!")



class CheckingAccount(BankAccount):
    # create constructor
    def __init__(self, account_number, balance, BankingFee):
        super().__init__(account_number, balance)
        self.__BankingFee = BankingFee
   
   
    def get_fee(self):
        return self.__BankingFee
    
    def set_fee(self, BankingFee):
        self.__BankingFee = BankingFee


    def withdraw(self, amount):
        super().withdraw(amount)
        self.set_balance(self.get_balance() - self.__BankingFee)

    
    def AccountInformation(self):
        return "Checking Acct: \n" + super().AccountInformation() + \
            "\nBanking Fee  : {}".format(self.__BankingFee)
            
    def withdraw(self, amount):
        if self.__balance >= amount:
            self.__balance -= amount
            print("Your Withdrawl of  {}  $ was successful".format(amount))
        else:
            print("Not enough Money!!!!")



class Customer:
   
    def __init__(self, CustomerName, age):
        self.__CustomerName = CustomerName
        self.__age = age
        self.__accounts = []

    
    def get_name(self):
        return self.__CustomerName
   
    def get_age(self):
        return self.__age

 
    def set_name(self, CustomerName):
        self.__CustomerName = CustomerName
    
    def set_age(self, age):
        self.__age = age


    # method to ad an account for the customer
    def CreateAccount(self, account):
        self.__accounts.append(account)


    def get_Account(self, account_number):
        for account in self.__accounts:
            if account.get_account_number()== account_number:
                return account
        return None

    def AccountInformation(self):
        account_str = "\n"
        for account in self.__accounts:
            account_str += str(account) 
                
        return "CustomerName: {}\nCustomer Age: {}\nAccount ID: {}"\
            .format(self.__CustomerName, self.__age, account_str)


# Driver code

print('\n***********************************************')
print(" Welcome to the First Crypto Currency Bank")
print('***********************************************\n')    

First_Customer = Customer('Lebron James', 20)
First_Customer.CreateAccount(1)
print(First_Customer.AccountInformation()) 

First_Customer = CheckingAccount(85, 5000, 0.05)
First_Customer.deposit(522)

print(First_Customer.AccountInformation()) 


print('\n***********************************************')
Second_Customer = Customer('Satoshi Nakamoto', 35)
Second_Customer.CreateAccount(2)
print(Second_Customer.AccountInformation())      

First_Customer = CheckingAccount(30, 5000, 0.05)
First_Customer.deposit(800)

print(First_Customer.AccountInformation())  

print('\n***********************************************')

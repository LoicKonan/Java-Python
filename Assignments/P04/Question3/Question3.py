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
        print("Your Depoist of  {} $ was successful".format(amount))

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
                
        return "CustomerName: {}\nCustomer Age: {}\nAccounts: {}"\
            .format(self.__CustomerName, self.__age, account_str)

    
print('\n***********************************************')
print(" Welcome to the First Crypto Currency Bank")
print('***********************************************\n')

First_Customer = Customer('Lebron James', 20)
First_Customer.CreateAccount(1235)
print(First_Customer.AccountInformation())      

print('\nNow changing the Account user name and age and Account Number')
First_Customer.set_name('BOSS')
First_Customer.get_name()

First_Customer.set_age(55)
First_Customer.get_age()
print(First_Customer.AccountInformation())
      
      
print('\n***********************************************')
Second_Customer = Customer('Satoshi Nakamoto', 35)
Second_Customer.CreateAccount(124566)

print(Second_Customer.AccountInformation())      

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
# class BankAccount(ABC):
    
#     def __init__(self, name, age, _balance):

#         self.name = name

#         self.age = age

#         self._balance = _balance


#     def get_info(self):

#         print(f"Name: {self.name}")

#         print(f"Age: {self.age}")

#         self.print_balance()

#     def get_balance(self):

#         return self._balance
        

#     def print_balance(self):

#         print(f"Current Balance: {self.get_balance()}")


#     def deposit_money(self, amount):

#         if(type(amount) == int and amount > 0):

#             self._balance += amount

#             print(f"Deposited {amount} in your account")

#         else:

#             print("Please enter valid data for amount")
            
#     @ abstractmethod
#     def withdraw(self, amount):
                
#         if self.balance >= amount and (type(amount)):
            
#             self.balance -= amount
#             print("\n You Withdrew:", amount)
#         else:
#             print("\n Please don't try to seal from us!!!")



# class SavingAccount(BankAccount):

#     def __init__(self, name, age, balance, interest_rate):

#         BankAccount.__init__(self, name, age, balance)

#         self._interest_rate = interest_rate
        
#     def get_info(self):

#         print("Account Type: Savings")

#         print(f"Name: {self.name}")

#         print(f"Age: {self.age}")

#         self.print_balance()

#         self.print_interest_rate()


#     def print_interest_rate(self):

#         print(f"Current rate of interest = {self.get_interest_rate()}")


#     def set_interest_rate(self, rate):

#         if(type(rate) == int and rate > 0):

#             self._interest_rate = rate

#         else:

#             print("Please enter valid data for interest rate")


#     def get_interest(self, years):

#         return self.get_interest_rate()*years*self.get_balance()/100
    

#     def get_interest_rate(self):

#         return self._interest_rate
    
#     def withdraw(self, amount):
                
#         if self.balance >= amount and (type(amount)):
            
#             self.balance -= amount
#             print("\n You Withdrew:", amount)
#         else:
#             print("\n Please don't try to seal from us!!!")




# class CheckingAccount(BankAccount):

#     def __init__(self, name, age, balance):

#         BankAccount.__init__(self, name, age, balance)


#     def get_info(self):

#         print("Account Type: Current")

#         print(f"Name: {self.name}")

#         print(f"Age: {self.age}")

#         self.print_balance()
    
#     def withdraw(self, amount):
                
#         if self.balance >= amount and (type(amount)):
            
#             self.balance -= amount
#             print("\n You Withdrew:", amount)
#         else:
#             print("\n Please don't try to seal from us!!!")





# class Customer(SavingAccount, CheckingAccount):

#     def __init__(self, name, age, balance, type):

#         self.type = type

#         if(type == "s"):

#             interest_rate = int(input("Enter interest rate: "))
            
#             SavingAccount.__init__(self, name, age, balance, interest_rate)

#         if(type == "c"):

#             cheques_issued = int(input("Enter number of cheques: "))

#             CheckingAccount.__init__(self, name, age, balance, cheques_issued)

#         if(type == "s+c" or type == "c+s"):

#             rate = int(input("Enter interest rate: "))

#             cheques_issued = int(input("Enter number of cheques: "))

#             SavingAccount.__init__(self, name, age, balance, rate)

#             CheckingAccount.__init__(self, name, age, balance, cheques_issued)


#     def get_info(self):

#         if(self.type == "s"):

#             SavingAccount.get_info(self)

#         elif(self.type == "c"):

#             CheckingAccount.get_info(self)

#         else:

#             print("Account Type: Savings + Checking")

#             print(f"Name: {self.name}")

#             print(f"Age: {self.age}")

#             self.print_balance()

#             self.print_interest_rate()

#             self.print_cheques()


# print('\n************************************************\n')
# print("\tOpen a bank account")

# print("\tchoose account type:")

# print("\ts: savings account")

# print("\tc: checking account")

# print("\ts+c or c+s : savings + checking account")

# c = input("\tEnter your choice:")

# name = input("\tEnter your name:")

# age = int(input("\tEnter your age:"))

# balance = int(input("\tEnter your opening amount:"))

# customer1 = Customer(name, age, balance, c)
# print(customer1.age)

# print('\n************************************************\n')

 
 
 
 
# # import re

# # class BankAccount:
# #     def __init__(self, account_number, balance):
# #         self.__account_number = account_number
# #         self.__balance = balance

# #     def get_account_number(self):
# #         return self.__account_number
    
# #     def get_balance(self):
# #         return self.__balance

# #     def set_account_number(self, account_number):
# #         self.__account_number = account_number
        
# #     def set_balance(self, balance):
# #         self.__balance = balance

# #     def deposit(self, amount):
# #         self.__balance += amount
# #         print("Your Depoist of  {} was successful".format(amount))

# #     def withdraw(self, amount):
# #         if self.__balance >= amount:
# #             self.__balance -= amount
# #             print("Your Withdrawl of  {}  was successful".format(amount))
# #         else:
# #             print("Not enough Money to Withdraw that much!!!!")

# #     def show_balance(self):
# #         print("Balance : {}".format(self.__balance))

# #     def AccountInformation(self):
# #         return "Acct #       : {}\nAcct Balance : {}".format(self.__account_number, self.__balance)


# # # create first child class 
# # class SavingsAccount(BankAccount):
# #     def __init__(self, account_number, balance, BankingRate=0.5):
# #         super().__init__(account_number, balance)
# #         self.__BankingRate = BankingRate

# #     def get_BankRate(self):
# #         return self.__BankingRate
# #     def set_BankRate(self, BankingRate):
# #         self.__BankingRate = BankingRate

# #     def BalancePlusRate(self):
# #         AddedRate = self.get_balance() * self.__BankingRate
# #         print("The Bank Rate is : {}".format(AddedRate))

# #     def AccountInformation(self):
# #         return "Savings Acct :\n" + super().AccountInformation() + "\nBank Rate    : {}".format(self.__BankingRate)

# # class CheckingAccount(BankAccount):
# #     def __init__(self, account_number, balance, BankingFee):
# #         super().__init__(account_number, balance)
# #         self.__BankingFee = BankingFee
        
# #     def get_fee(self):
# #         return self.__BankingFee
    
# #     def set_fee(self, BankingFee):
# #         self.__BankingFee = BankingFee

# #     def withdraw(self, amount):
# #         super().withdraw(amount)
# #         self.set_balance(self.get_balance() - self.__BankingFee)

# #     def AccountInformation(self):
# #         return "Checking Acct: \n" + super().AccountInformation() + "\nBanking Fee  : {}".format(self.__BankingFee)


# # class Customer:
# #     def __init__(self, CustomerName, CustomerAddress, age):
# #         self.__CustomerName = CustomerName
# #         self.__CustomerAddress = CustomerAddress
# #         self.__age = age
# #         self.__accounts = []

# #     def get_name(self):
# #         return self.__CustomerName
    
# #     def get_address(self):
# #         return self.__CustomerAddress
    
# #     def get_age(self):
# #         return self.__age

# #     def set_name(self, CustomerName):
# #         self.__CustomerName = CustomerName
        
# #     def set_address(self, CustomerAddress):
# #         self.__CustomerAddress = CustomerAddress
        
# #     def set_age(self, age):
# #         self.__age = age

# #     def CreateAccount(self, account):
# #         self.__accounts.append(account)

# #     def get_Account(self, account_number):
# #         for account in self.__accounts:
# #             if account.get_account_number()== account_number:
# #                 return account
# #         return None

# #     def AccountInformation(self):
# #         account_str = "\n"
# #         for account in self.__accounts:
# #             account_str += "\n----------------\n" + str(account) + "\n----------------\n"
# #         return "CustomerName: {}\nAddress: {}\nCustomer ID: {}\nAccounts: {}".format(self.__CustomerName, self.__CustomerAddress, self.__age, account_str)

# # # create a new customer with everything overriden
# # First_Customer = Customer("Biblo Baggins", "111th NoAdventures Street", "2")
# # # creating a checking and savings account for customer 2
# # savings_account = SavingsAccount("00001", 5000, 0.05)
# # checking_account = CheckingAccount("00002", 60000, 20)
# # # customer 2 now has a checking and savings account
# # First_Customer.CreateAccount(savings_account)
# # First_Customer.CreateAccount(checking_account)
# # # for sanity sake print out the customer to see their info
# # #print(First_Customer)

# # # deposit 1000 and withdraw 10000 from savings
# # First_Customer.get_Account("00001").deposit(1000)
# # First_Customer.get_Account("00001").withdraw(10000)

# # # now from checking depoist and withraw utilizes get and set
# # First_Customer.get_Account("00002").deposit(10000)
# # First_Customer.get_Account("00002").withdraw(5000)
# # print()

# # # print out the details of the second customer
# # #print(First_Customer)
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
 #                                           ABC (grandparent)
 #
 #                                                   |
 #
 #                                       BankingAccount (parent)
 #
 #                                           /              \
 #
 #                              SavingAccount            Checking_Account                
 #
 #
 # Files:           
 #                  Question3.py
 # 
 #****************************************************************************/
 
from abc import abstractmethod, ABC


##
# This is the Bank Account class which is inheriting from
# the built in Abstract class call ABC. 
# In this class we will set up the basic information 
# need it to for a normal bank account. such as the account
# the deposit and how to withdraw, with the muttator methods.
# 
##
class B_Account(ABC):
    # Constructor
    def __init__(self, account_number, balance):
        self.__account_number = account_number
        self.__balance = balance

    # getter function for the account number
    def get_Account(self):
        return self.__account_number
    
    # getter function to get the balance.
    def get_Balance(self):
        return self.__balance

    # setter method for the account number
    def set_Account(self, account_number):
        self.__account_number = account_number
        
    # setter method for the Balance number
    def set_Balance(self, balance):
        self.__balance = balance

    # This function handle the deposit of the money.
    def deposit(self, amount):
        self.__balance += amount
        print("Your Deposit of  {} $ was successful".format(amount))

    @ abstractmethod
    #Implementing the abstractmethod that we inherited from python.
    # then we set up the process for the withdrawal
    # if the amount enter is not an integer or if the amount enter
    # is more than the amount that we have: then we will tell the 
    # user that he broke.
    def withdraw(self, amount):
        if self.__balance >= amount and (type(amount)):
            self.__balance -= amount
            print("Your Withdrawl of  {}  $ was successful".format(amount))
        else:
            print("You are broke stop wasting our computational energy!!!")

    # This method will just diplay the user balance.
    def Diplay_Balance(self):
        print("Balance : {}".format(self.__balance))

    # This method will diplay the full information about the account.
    def Account_Information(self):
        return "Acct #       : {}\nAcct Balance : {}".\
            format(self.__account_number, self.__balance)


# In this class we will inherit from the bank account class   
# and we will initialize new variable to use in order to perfom some 
# of the crypto rate and crypto balance rate checks.
class Saving_Account(B_Account):
    # Constructor
    def __init__(self, account_number, balance, BankingRate = 0.15):
        super().__init__(account_number, balance)
        self.__CryptoRate = BankingRate

    # getter Method that will return Crypto rate 
    def get_CryptoRate(self):
        return self.__CryptoRate
    
    # setter Method for Crypto rate 
    def set_CryptoRate(self, BankingRate):
        self.__CryptoRate = BankingRate

    # Display the crypto balance
    def Crypto_BalanceRate(self):
        AddedRate = self.get_Balance() * self.__CryptoRate
        print("The Crypto Rate is : {}".format(AddedRate))

    # Display the account information
    def Account_Information(self):
        return "Savings Acct :\n" + super().Account_Information() + \
        "\nCrypto Rate    : {}".format(self.__CryptoRate)
    
    # method to handle the withdraw.
    # if the amount enter is not an integer or if the amount enter
    # is more than the amount that we have: then we will tell the 
    # user that he broke
    def withdraw(self, amount):
        if self.__balance >= amount and (type(amount)):
            self.__balance -= amount
            print("Your Withdrawl of  {}  $ was successful".format(amount))
        else:
            print("Not enough Money!!!!")



# In this class we will inherit from the bank account class   
# and we will initialize new variable to use in order to perfom some 
# of the crypto rate and crypto balance rate checks
class Checking_Account(B_Account):
    # create constructor
    def __init__(self, account_number, balance, BankingFee):
        super().__init__(account_number, balance)
        self.__BankingFee = BankingFee
   
    # getters methods
    def get_Fee(self):
        return self.__BankingFee
    
    # setters methods
    def set_Fee(self, BankingFee):
        self.__BankingFee = BankingFee

    # to handle the withdraw in the checking account
    def withdraw(self, amount):
        super().withdraw(amount)
        self.set_Balance(self.get_Balance() - self.__BankingFee)

    # Display the account information
    def Account_Information(self):
        return "Checking Acct: \n" + super().Account_Information() + \
            "\nCrypto Fee  : {}".format(self.__BankingFee)



# in this class create our cutomer class which will be used
# for the customer account id and age and names.
class Customer:
   
   # Constructor 
    def __init__(self, CustomerName, age):
        self.__CustomerName = CustomerName
        self.__age = age
        self.__accounts = []

    # getter function
    def get_Name(self):
        return self.__CustomerName
      
    # getter function
    def get_Age(self):
        return self.__age

    # setters method
    def set_Name(self, CustomerName):
        self.__CustomerName = CustomerName
    
    # setters method
    def set_Age(self, age):
        self.__age = age

    # this method will create the account
    def Create_Account(self, account):
        self.__accounts.append(account)

    # getters method
    def get_Account(self, account_number):
        for account in self.__accounts:
            if account.get_Account()== account_number:
                return account
        return None

    # Display the account information
    def Account_Information(self):
        account_str = "\n"
        for account in self.__accounts:
            account_str += str(account) 
                
        return "CustomerName: {}\nCustomer Age: {}\nAccount ID: {}"\
            .format(self.__CustomerName, self.__age, account_str)


# Driver code
print('\n***********************************************')
print(" Welcome to the Best Crypto Currency Bank")
print('***********************************************\n')    

# Here we display the first customer name and age and accunt ID
First_Customer = Customer('Lebron James', 20)
First_Customer.Create_Account(1)
print(First_Customer.Account_Information()) 

print('\n')
# Here we display the Second customer full account information
First_Customer = Checking_Account(85, 5000, 3)
print(First_Customer.Account_Information()) 

print('\n')
# Here we deposit some money in the account and display the result.
First_Customer.deposit(300)
print(First_Customer.Account_Information()) 

print('\n')
# Here we Withdraw some money in the account and display the result.
First_Customer.withdraw(10)
print(First_Customer.Account_Information()) 

print('\n***********************************************')
# Here we display the Second customer name and age and accunt ID
Second_Customer = Customer('Satoshi Nakamoto', 35)
Second_Customer.Create_Account(2)
print(Second_Customer.Account_Information()) 

print('\n')
# Here we display the Second customer full account information
Second_Customer = Checking_Account(1000, 5000, 1)
print(Second_Customer.Account_Information()) 

print('\n')
# Here we deposit some money in the account and display the result.
Second_Customer.deposit(3000)
print(Second_Customer.Account_Information()) 

print('\n')
# Here we Withdraw some money in the account and display the result.
Second_Customer.withdraw(100)
print(Second_Customer.Account_Information()) 

print('\n***********************************************')

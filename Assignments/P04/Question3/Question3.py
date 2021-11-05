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
 #                  
 #                  
 # 
 # Solution:
 #                  
 #
 #
 # Files:           Question3.py
 # 
 #****************************************************************************/
 
 
# import re
# # First we create our parent class called bank account
# class BankAccount:
#     # first we define out constructor for the customer class
#     # this will hold the person account number an balance
#     def __init__(self, account_number, balance):
#         # by using the self.underscore, we create the priveate 
#         # variable and initialize them to the valures
#         self.__account_number = account_number
#         self.__balance = balance

#     # our getter methods that will access the private data
#     def get_account_number(self):
#         return self.__account_number
#     def get_balance(self):
#         return self.__balance

#     # create the setter variables to set the account_number and balance
#     def set_account_number(self, account_number):
#         self.__account_number = account_number
#     def set_balance(self, balance):
#         self.__balance = balance

#     # deposit methos that will add to to the balance with the 
#     # ammount specified
#     def deposit(self, amount):
#         self.__balance += amount
#         # print out the depoist transcation
#         print("Your Depoist of  {} was successful".format(amount))

#     # withdraw methos that will check if there is enough to withdraw 
#     # using the if statement we iterate through and print out one
#     # of the two
#     def withdraw(self, amount):
#         # check if amount is greater than or equal to balance
#         if self.__balance >= amount:
#             self.__balance -= amount
#             print("Your Withdrawl of  {}  was successful".format(amount))
#         # otherwise, print error message
#         else:
#             print("Not enough Money to Withdraw that much!!!!")

#     # our show_balance methos that will print the balance in the account
#     def show_balance(self):
#         print("Balance : {}".format(self.__balance))

#     # we then create the function definition method that will we turn the
#     # the formatted account information
#     def __str__(self):
#         return "Acct #       : {}\nAcct Balance : {}".format(self.__account_number, self.__balance)


# # create first child class call savings account that will
# # be derived and inherited from the parent class 
# # bank account which is inside of the parameter field of the 
# # class creation
# class SavingsAccount(BankAccount):
#     # we create our constructor that has it own private data field 
#     # and we user the constuctor ffrom the super class that
#     # hold the account number and the balance and this own 
#     # will have its or parameter
#     def __init__(self, account_number, balance, BankingRate=0.5):
#         super().__init__(account_number, balance)
#         self.__BankingRate = BankingRate

#     # set up the get and set methods to initialize and access the 
#     # interest rate which will be calle in the main function of 
#     # our program and then return the update interest rate
#     def get_BankRate(self):
#         return self.__BankingRate
#     def set_BankRate(self, BankingRate):
#         self.__BankingRate = BankingRate

#     # we create a method called BalancePlusRate(self)
#     # inside of here, we will access the balance and make changes to it
#     # by multiplying by the interest rate inside of the metho
#     def BalancePlusRate(self):
#         AddedRate = self.get_balance() * self.__BankingRate
#         print("The Bank Rate is : {}".format(AddedRate))

#     # our return method will have all the contents includd in this 
#     # class as well as deriving from the super(Bank Account class)
#     # in essecnce, we will return the savings account data, the CustomerName and the account num
#     # the CustomerName and the accout number are derived from inside of the bank account
#     # class and access through here
#     def __str__(self):
#         return "Savings Acct :\n" + super().__str__() + "\nBank Rate    : {}".format(self.__BankingRate)

# # creation of the second child class which is calle Checking Account
# # inside of this, we will be drawing from the constructor of the super class
# # which is the bank account that holds the account number and balance
# # then we define our of constructor will private memeber BankingFee
# class CheckingAccount(BankAccount):
#     # create constructor
#     def __init__(self, account_number, balance, BankingFee):
#         super().__init__(account_number, balance)
#         self.__BankingFee = BankingFee
#     # next, we must create our get and set methods to access and return tht value
#     # create getter and setter methods for BankingFee
#     def get_fee(self):
#         return self.__BankingFee
#     def set_fee(self, BankingFee):
#         self.__BankingFee = BankingFee

#     #we then create a withdraw  method in which we derive the balance from the super
#     # class where we access that and make changes to it
#     def withdraw(self, amount):
#         super().withdraw(amount)
#         # subtract BankingFee from the balance 
#         self.set_balance(self.get_balance() - self.__BankingFee)

#     # return method that will return everything ffrom the super class
#     # includeing the account number and the balance as well as the 
#     # checking account information
#     def __str__(self):
#         return "Checking Acct: \n" + super().__str__() + "\nBanking Fee  : {}".format(self.__BankingFee)


# # We lastly, create our cutomer class which will be used in the creation of a 
# # customer utilizing the bank account but the parameter is not place inside of here
# class Customer:
#     #  create the private sconstructor variable in which store the 
#     # customeres information as well as their account information
#     def __init__(self, CustomerName, CustomerAddress, CustomerPhoneNum, CustomerIDNumber):
#         self.__CustomerName = CustomerName
#         self.__CustomerAddress = CustomerAddress
#         self.__CustomerPhoneNum = CustomerPhoneNum
#         self.__CustomerIDNumber = CustomerIDNumber
#         self.__accounts = []

#     # initialize the get and set methods to have access to setting 
#     # and getting the necesary data that pertains to the customer
#     def get_name(self):
#         return self.__CustomerName
#     def get_address(self):
#         return self.__CustomerAddress
#     def get_phone_number(self):
#         return self.__CustomerPhoneNum
#     def get_customer_id(self):
#         return self.__CustomerIDNumber

#     # intilize the set methos to set the corresponding ata to the part
#     # particular customer 
#     def set_name(self, CustomerName):
#         self.__CustomerName = CustomerName
#     def set_address(self, CustomerAddress):
#         self.__CustomerAddress = CustomerAddress
#     def set_phone_number(self, CustomerPhoneNum):
#         self.__CustomerPhoneNum = CustomerPhoneNum
#     def set_customer_id(self, CustomerIDNumber):
#         self.__CustomerIDNumber = CustomerIDNumber


#     # method to ad an account for the customer
#     def add_account(self, account):
#         self.__accounts.append(account)

#     # get method for the customer that will access the 
#     # account information for the customer and append it
#     def get_account(self, account_number):
#         for account in self.__accounts:
#             if account.get_account_number() == account_number:
#                 return account
#         # if nothing found return none
#         return None

#     # method to return the data for the accounts in the cutomer data classs
#     def __str__(self):
#         account_str = "\n"
#         for account in self.__accounts:
#             account_str += "\n----------------\n" + str(account) + "\n----------------\n"
#         return "CustomerName: {}\nAddress: {}\nPhone Number: {}\nCustomer ID: {}\n\nAccounts: {}".format(self.__CustomerName, self.__CustomerAddress, self.__CustomerPhoneNum, self.__CustomerIDNumber, account_str)


# # when called, main will be intialized and come to this
# # function definition to iterate through bank
# def main():

#     print("""\t    Welcome to Ethans Bank
#                Pick From My Menu\n\n
#             [1] -- Create Account
#             [2] -- Make Deposit
#             [3] -- Make Withdrawl
#             [4] -- Display Info
#             [Q] -- Quit Bank Simulation
    
#             """)
#     keep_going = True
#     while keep_going:

#     # prompt the user what they would like to do
#         userInput = str(input('Please Select One of the Following, or type the letter Q to exit '))
    
    
#         if userInput == '1':
#             # prompt for the details of the customer
#             # to include CustomerName,CustomerAddress,phonenumber and the customer is given an
#             #idnumber
#             NameOfCustomer=str(input(" What is the Name of the customer? : "))
#             AddressofCustomer= str(input("Enter the Customers Address: "))
#             CustomerPhoneNumber=str(input("Please enter the phone number: "))
#             IdNumber="1"
#             print("\rYour IdNumber is 1\n")
#             customer = Customer(NameOfCustomer,AddressofCustomer,
#                          CustomerPhoneNumber,IdNumber)

#     # create a SavingsAccount and  a CheckingAccount
#             print("\r Now lets create a savings and checking account ")
#             CheckNum=str(input("Please Enter a Account Number for Checking: "))
             
#             while True:
#                     try:
#                         StartingBal= int(input(" Please enter starting ammount of account: "))
#                         if not re.match('^[0-9]*$',StartingBal):
#                             # loop back again till a numeric value is acchieved
#                             continue
#                         else:
#                             break;   
#                     except:
#                         print(" Must be a number bonehead try again")
#                         continue 
#             checking_account = CheckingAccount(CheckNum, StartingBal, 12)

#         # now enter the savings account information including acct num
#         # and the startingbalance
#             SavNum=str(input("Please Enter a Account Number for Savings : "))
#             while True:
#                     try:
#                         SavBal=int(input("Please Enter a Balance  for Savings : "))
#                         if not re.match('^[0-9]*$',SavBal):
#                             # loop back again till a numeric value is acchieved
#                             continue
#                         else:
#                             break;   
#                     except:
#                         print(" Must be a number bonehead try again")
#                         continue
#             savings_account = SavingsAccount(SavNum, SavBal, 0.90)
#     # add accounts to customer
#             customer.add_account(savings_account)
#             customer.add_account(checking_account)

#         if userInput == '2':
#             while True:
#                 try:
#                     AcctType = input('What account to deposit to? Enter Savings of Checking ' )
                    
#                     if AcctType == "Savings" or AcctType == "Checking":
#                         break;
#                     else:
#                         print("Account Type Should be Savings or Checking")   
#                 except:
#                     continue
            
#             if AcctType=='Savings':
#                 # prompt the user for acct number of savings and the ammount
#                 print("\r Now lets do some moeny stuff on savings\n")
#                 SavingAcctNum=str(input("please enter the account number for savings "))
#                 while True:
#                     try:
#                         Savingsdeposit= int(input("how much would you like to deposit     "))
#                         if not re.match('^[0-9]*$',Savingsdeposit):
#                             # loop back again till a numeric value is acchieved
#                             continue
#                         else:
#                             break;   
#                     except:
#                         print("enter a valid integer number")
#                         continue
#                 customer.get_account(SavingAcctNum).deposit(Savingsdeposit)
    
#             if AcctType=='Checking':
#             # prompt the user for ammount and the account nuber of checking
#                 CheckingAcctNum=str(input("please enter the account number for checking "))
#                 while True:
#                     try:
#                         deposit= int(input("how much would you like to deposit     "))
#                         if not re.match('^[0-9]*$',deposit):
                            
#             # loop back again till a numeric value is acchieved
#                             continue
#                         else:
#                             break;   
#                     except:
#                         print("enter a valid integer number try again loser")
#                         continue
#                 customer.get_account(CheckingAcctNum).deposit(deposit)

#         if userInput=='3':
#             while True:
#                 try:
#                     account_type = str(input('What account To Withdraw From? Enter Savings of Checking ' ))
                    
#                     if account_type == "Savings" or account_type== "Checking":
#                         break;
#                     else:
#                         print("Account Type Should be Savings or Checking")   
#                 except:
#                     continue
#             if account_type=='Savings':
#             # prompt for the account number read in 
#                 while True:
#                     try:
#                         withdrawl_ammount = int(input('How Much Would ifYou Like to Withdraw? ' ))
#                         if not re.match('^[0-9]*$',withdrawl_ammount):
#             # loop back again till a numeric value is acchieved
#                             continue
#                         else:
#                             break;   
#                     except:
#                         print(" try again enter valid integer number")
#                         continue
#                 SavingAcctNum=str(input("please enter the account number for Savings "))
#                 customer.get_account(SavingAcctNum).withdraw(withdrawl_ammount)
#             if account_type=='Checking':
#                 while True:
#                     try:
#                         withdrawl_ammount = int(input('How Much Would ifYou Like to Withdraw? ' ))
#                         if not re.match('^[0-9]*$',withdrawl_ammount):
                            
#             # loop back again till a numeric value is acchieved
#                             continue
#                         else:
#                             break;   
#                     except:
#                         print("print valid integer number try again meathead")
#                         continue
#             # prompt for the user to enter the ammount and the account number
#                 accountnumber=str(input("please enter the account number for checking "))
#                 customer.get_account(accountnumber).withdraw(withdrawl_ammount)

#         if userInput=='4':
#             print(customer)
    
#         if userInput == 'Q':
#             keep_going = False # close out of the program

# # call the main function to access main
# if __name__ == "__main__":
#     main()
# # create a new customer with everything overriden
# customer2 = Customer("Biblo Baggins", "111th Birthday Street", "1800NOADVENTURES", "2")
# # creating a checking and savings account for customer 2
# savings_account = SavingsAccount("00001", 5000, 0.05)
# checking_account = CheckingAccount("00002", 60000, 20)
# # customer 2 now has a checking and savings account
# customer2.add_account(savings_account)
# customer2.add_account(checking_account)
# # for sanity sake print out the customer to see their info
# print(customer2)

# # deposit 1200 and withdraw 500 from savings
# customer2.get_account("00001").deposit(1200)
# customer2.get_account("00001").withdraw(200)

# # now from checking depoist and withraw utilizes get and set
# customer2.get_account("00002").deposit(500)
# customer2.get_account("00002").withdraw(250)
# print()

# # print out the details of the second customer
# print(customer2)
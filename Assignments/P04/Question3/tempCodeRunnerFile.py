
# # creating a checking and savings account for customer 2
# savings_account = SavingsAccount("00001", 5000, 0.05)
# checking_account = CheckingAccount("00002", 60000, 20)
# # customer 2 now has a checking and savings account
# First_Customer.CreateAccount(savings_account)
# First_Customer.CreateAccount(checking_account)
# # for sanity sake print out the customer to see their info
# print(First_Customer)

# # deposit 1000 and withdraw 10000 from savings
# First_Customer.get_Account("00001").deposit(1000)
# # First_Customer.get_Account("00001").withdraw(100)

# # now from checking depoist and withraw utilizes get and set
# First_Customer.get_Account("00002").deposit(10000)
# # First_Customer.get_Account("00002").withdraw(5000)
# print()

# # print out the details of the second customer
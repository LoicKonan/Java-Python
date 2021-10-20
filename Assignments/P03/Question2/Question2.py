#  #****************************************************************************
#  # Author:          Loic Konan 
#  # Email:           loickonan.lk@gmail.com 
#  # Label:           Question 2 
#  # Title:           Programing Assignment 03 
#  # Course:          CMPS 4143 
#  # Semester:        Fall 2021 
#  # Date:            10/20/2021
#  # 
#  # Description:     
#  #                  
#  # 
#  # Solution:
#  #
#  # Files:           Question2.py
#  # 
#  #****************************************************************************/

# name_age = []

# Fname_array = list()
# Lname_array = list()
# age_array = list()
# Occupation_array = list()
# Address_array = list()

# number = input("How many people do you need to enter: ")

# for x in range(0,int(number)):    
    
#     #Get nane and input
#     LName = input("Enter your Last Name: ")
#     FName = input("Enter your First Name: ")
#     ageRecord = int(input("Age: "))
#     Occupation = input("Enter your occupation: ")
#     address = input("Enter your address: ")
    
    
#     #Update name and age array
#     Lname_array.append(LName)
#     Fname_array.append(FName)
#     age_array.append(ageRecord)
#     Occupation_array.append(Occupation)
#     Address_array.append(address)
    
# for Lname, Fname, age, job, addy in zip(Lname_array, Fname_array, age_array, Occupation_array, Address_array):
#     print(Lname, '\t', Fname,'\t', age, '\t', job, '\t', addy)

 
i=0
entry=int(input("How many people would you like to add?"))
while i<entry:

    # now for the basis of the individuals
    
    while(True):
        try:
            FirstName=str(input("What is the persons first name?"))# user prompt
        except:
            raise ValueError('FirstName  is not valid')
        if FirstName.isnumeric(): #check if the name is entered as a number
            ErrorWarning= ValueError("Invalid input, insert correct First Name using non numeric values")
            print(ErrorWarning)
        else: 
            break
        
    while(True):
        try:
            LastName=str(input("What is the persons last  name?"))# user prompt
        except:
            raise ValueError('Last Name  is not valid')
        if LastName.isnumeric(): #chek if occupation contains only numeric value or not
            ErrorWarning= ValueError("Invalid input, insert correct Last Name using non numeric values")
            print(ErrorWarning)
        else: #else if the occupation is correct
            break
    

    # start try catch block that will catch invalid data  whcih consists of nums between 0 and 150
    
    while True:
        try:
            Age = int(input("Enter the person Age(must be less than 150: "))
            while Age > 150 or Age < 0:
                print('Please print a valid age')
                Age = int(input())
        except ValueError:
            Age = int(input("Please Enter a valid age: "))
            break
                    
    # try catch to read in valid non numeric occupation
    while(True):
        try:
            Occupation= str(input("What is their occupation?"))# prompt the user
        except:
            raise ValueError('Occupation is not valid')# if invalid say invalid
        if Occupation.isnumeric(): #chek if occupation contains only numeric value or not
            ErrorWarning= ValueError("Invalid input, insert correct occupation using non numeric values")
            print(ErrorWarning)# printing the error warning
        else: #else if the occupation is correct
            break
    
    # try catch me to get valid address
    while(True):
        try:
            Address=str(input("What is this persons Address?: "))
        except:
            raise ValueError('Address  is not valid')
        if Address.isnumeric(): #chek if address contains only numeric value or not
            ErrorWarning= ValueError("address was invalid")
            print(ErrorWarning)
        else: #else if the occupation is correct
            break

    # format the output for each individual person to be this  formatted
    print(FirstName, LastName, " aged", Age," years, worked as a ",Occupation,
             " and currently lives at ",Address,".\n")
    i+=1# increment the ocunter variable go back to loop begining until satisfied
# end of the program exitting out
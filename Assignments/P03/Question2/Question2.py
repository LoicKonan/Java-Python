 #****************************************************************************
 # Author:          Loic Konan 
 # Email:           loickonan.lk@gmail.com 
 # Label:           Question 2 
 # Title:           Programing Assignment 03 
 # Course:          CMPS 4143 
 # Semester:        Fall 2021 
 # Date:            10/20/2021
 # 
 # Description:     
 #                  
 # 
 # Solution:
 #
 # Files:           Question2.py
 # 
 #****************************************************************************/

Fname_array = list()
Lname_array = list()
age_array = list()
Occupation_array = list()
Address_array = list()

while True:
        number = input("How many people do you need to enter: ")
        if number.isdigit(): 
            break
        else: print("Please Enter a valid Number: ")
        
for x in range(0,int(number)):    
    
    #Get nane and input
    LName = input("Enter the Last Name of the " + x+1 + "person: ")
    
    FName = input("Enter the First Name of the " + x + "person: ")
    
    while True:
        Age = input("Enter age of " + x  + " person: ")
        
        if Age.isdigit() and (0 <int(Age)< 130): 
            break
        else: print("Please Enter a valid age for the " + x + "person: ")
            
    Occupation = input("Enter the occupation for the " + x + "person:")
    
    
    address = input("Enter the address for the " + x + "person:")
    
    
    #Update name and age array
    Lname_array.append(LName)
    Fname_array.append(FName)
    age_array.append(Age)
    Occupation_array.append(Occupation)
    Address_array.append(address)
    
for x in range(0,int(number)):    
    print(Lname_array[x], Fname_array[x], " aged", age_array[x]," years, worked as a ",Occupation_array[x],
             " and currently lives at ",Address_array[x],".\n")
 
 
# i=0
# entry=int(input("How many people would you like to add?"))
# while i<entry:

#     # now for the basis of the individuals
    
#     while(True):
#         try:
#             FirstName=str(input("What is the persons first name?"))# user prompt
#         except:
#             raise ValueError('FirstName  is not valid')
#         if FirstName.isnumeric(): #check if the name is entered as a number
#             ErrorWarning= ValueError("Invalid input, insert correct First Name using non numeric values")
#             print(ErrorWarning)
#         else: 
#             break
        
#     while(True):
#         try:
#             LastName=str(input("What is the persons last  name?"))# user prompt
#         except:
#             raise ValueError('Last Name  is not valid')
#         if LastName.isnumeric(): #chek if occupation contains only numeric value or not
#             ErrorWarning= ValueError("Invalid input, insert correct Last Name using non numeric values")
#             print(ErrorWarning)
#         else: #else if the occupation is correct
#             break
    

#     # start try catch block that will catch invalid data  whcih consists of nums between 0 and 150
    
#     while True:
#         Age = input("Please Your age: ")
#         if Age.isdigit() and (0 < int(Age) < 150): 
#             break
#         else: print("Please Enter a valid age")
                    
#     # try catch to read in valid non numeric occupation
#     while(True):
#         try:
#             Occupation= str(input("What is their occupation?"))# prompt the user
#         except:
#             raise ValueError('Occupation is not valid')# if invalid say invalid
#         if Occupation.isnumeric(): #chek if occupation contains only numeric value or not
#             ErrorWarning= ValueError("Invalid input, insert correct occupation using non numeric values")
#             print(ErrorWarning)# printing the error warning
#         else: #else if the occupation is correct
#             break
    
#     # try catch me to get valid address
#     while(True):
#         try:
#             Address=str(input("What is this persons Address?: "))
#         except:
#             raise ValueError('Address  is not valid')
#         if Address.isnumeric(): #chek if address contains only numeric value or not
#             ErrorWarning= ValueError("address was invalid")
#             print(ErrorWarning)
#         else: #else if the occupation is correct
#             break

#     # format the output for each individual person to be this  formatted
#     print(FirstName, LastName, " aged", Age," years, worked as a ",Occupation,
#              " and currently lives at ",Address,".\n")
#     i+=1# increment the ocunter variable go back to loop begining until satisfied
# # end of the program exitting out
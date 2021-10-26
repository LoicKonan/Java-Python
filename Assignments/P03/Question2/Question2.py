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
 #                  This program will asks the user to enter the number of people, 
 #                  then based on this number it will iterate that amount of time  
 #                  where each time it will get a single person’s information 
 #                  like First Name, then Last Name, Age, Occupation and Address.
 #                  Then finally it will Display the user details one by one.
 # 
 # Solution:        
 #                  Used Lists to preserve the sequence of my data and for my iteration.           
 #                  Made a List for each information that the user entered.         
 #                  I then use if statement to to validate the information entered.
 #                  I use the regex to validate the addres.
 #    
 # Files:           Question2.py
 # 
 #****************************************************************************/

import re


Fname_array = list()                                                # This is a list for the First name.
Lname_array = list()                                                # This is a list for the Last Name.
age_array = list()                                                  # This is a list for the the age.
Occupation_array = list()                                           # This is a list for the occupation.
Address_array = list()                                              # This is a list for the address.


# If this while loop is true, we then ask the user
# to enter a number and we make sure that it is a number
# if not we print an error message.
# Using the strip to remove spaces. 
while True:
        number = input("\nHow many people to enter: ")
        if number.strip().isdigit():                                # if the input enter is a number break out of the loop.
            break
        else: print("Please Enter a valid Number: ")                # if the input enter is not a number print that message.
        
        
# Using this for loop to iterate as many time as
# that number entered by the user.        
for x in range(0, int(number)):    
    
    # Using this while loop to prompt the user for his Last name.
    # Then check if the name is valid or not.
    while True:
        LName = input("\nEnter the Last Name of person number " + str(x+1) + " : ")
      
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
 #                  Used Lists to preserve the sequence of my data and for my           
 #                  iteration. Made a List for each information that the user entered.         
 #                  I then use if statement to validate: 
 #
 #                  - Last Name
 #                  - First Name
 #                  - Age 
 #                  - Occupation
 #                  - Address
 #                  
 # Files:           Question2.py
 # 
 #****************************************************************************/

Fname_array = list()                                                # This is a list for the First name.
Lname_array = list()                                                # This is a list for the Last Name.
age_array = list()                                                  # This is a list for the the age.
Occupation_array = list()                                           # This is a list for the occupation.
Address_array = list()                                              # This is a list for the address.


# While this loop is true, we ask the user
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
       
        if LName.strip().isalpha():  
            break                                       
                                                                    
        else:                                                         # if the input enter has some numbers in it print that message.
            print("Please Enter a valid Last Name for the person number " + str(x+1) + " : ")
    
    
    # Using this while loop to prompt the user for his First name.
    # Then check if the name is valid or not.
    while True:
        FName = input("Enter the First Name of person number " + str(x+1) + ": ")
        
        if FName.strip().isalpha():                                          
            break 
        
        else:                                                         # if the input enter has some numbers in it print that message.
            print("Please Enter a valid First Name for the person number " + str(x+1) + " : ")
    
    
    # Using this while loop to prompt the user for his Age.
    # Then check if the Age is valid or not.
    while True:
        Age = input("Enter the age of person number " +  str(x+1)  + " : ")
        
        if Age.strip().isdigit() and (0 < int(Age) < 150):            # if the input enter is a number break out of the loop.
            break
                                                                      # if the input enter is not a number then print that message.
        else: print("Please Enter a valid age person number " + str(x+1) + " : ")
            
            
    # Using this while loop to prompt the user for his Occupation.
    # Then check if the Occupation is valid or not.      
    while True:        
        Occupation = input("Enter the occupation for person number " + str(x+1) + " :")
        
        if Occupation.strip().isalpha():                             
            break
        
        else:                                                         # if the input enter is numberic print that message.
            print("Please Enter a valid Occupation for the person number " + str(x+1) + " : ")
    
    
    # Using this while loop to prompt the user for his address.
    # Then check if the address is valid or not. 
    while True:
        addy = input("Enter the address for person number " + str(x+1) + " :")
         
        # Split the address into 4 pieces because of the commas,
        # then assign each pieces to a variable using a for loop.      
        var1,var2,var3,var4 = [str(i) for i in addy.split(",")]

        # Removing any leading commas.
        var4 = var4.lstrip()                                        
        var3 = var3.lstrip()

        # Using this if  and else statement below to check: 
        #       - Street and City name are STRING.
        #       - State name equal to 2 CHARACTER.
        #       - Zip Code is 5 digit number.
        
        if type(var1) and type(var2) == str and type(var3) == str and \
            len(var3) == 2 and var4.isdigit() and len(var4) == 5:
            address = addy
            
        else:
            print("1 Please Enter a valid address for the person number " + str(x+1) + " : ") 

    Lname_array.append(LName)                                          # Adding the Last name to our List of Last Name.
    Fname_array.append(FName)                                          # Adding the First name to our List of First names.
    age_array.append(Age)                                              # Adding the Age name to our List of Age.
    Occupation_array.append(Occupation)                                # Adding the Occupation name to our List of Occupation.
    Address_array.append(address)                                      # Adding the Address to our List of Address.
    
    
print("\n\nOutput: \n")
 
 
 # Using this for loop iterate through each one of our different List
 # then display the each store values to the console in the right order. 
for x in range(0,int(number)):    
    print(Lname_array[x], Fname_array[x], ", aged", age_array[x]," years, worked as a ",Occupation_array[x],
             " and currently lives at ",Address_array[x],".\n")
 

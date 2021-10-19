Fname_array = list()
Lname_array = list()
age_array = list()
Occupation_array = list()
Address_array = list()

number = input(int(print("How many people do you need to enter: ")))

while(number):

    #Get nane and input
    LName = input("Enter your Last Name: ")
    FName = input("Enter your First Name: ")
    ageRecord = int(input("Age: "))
    Occupation = input("Enter your occupation: ")
    address = input("Enter your address: ")
    
    
    #Update name and age array
    Lname_array.append(LName)
    Fname_array.append(FName)
    age_array.append(ageRecord)
    Occupation_array.append(Occupation)
    Address_array.append(address)
    
    
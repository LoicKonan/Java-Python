name_age = []

Fname_array = list()
Lname_array = list()
age_array = list()
Occupation_array = list()
Address_array = list()

number = input("How many people do you need to enter: ")

for x in range(0,int(number)):    
    
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
    
# print (Lname_array)
# print (Fname_array)
# print (age_array)
# print (Occupation_array)
# print (Address_array)

for Lname, Fname, age, job, addy in zip(Lname_array, Fname_array, age_array, Occupation_array, Address_array):
    print(Lname, '\t', Fname,'\t', age, '\t', job, '\t', addy)
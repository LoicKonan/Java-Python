 #****************************************************************************
 # Author:          Loic Konan 
 # Email:           loickonan.lk@gmail.com 
 # Label:           Question 1 
 # Title:           Programing Assignment 04 
 # Course:          CMPS 4143 
 # Semester:        Fall 2021 
 # Date:            11/10/2021
 # 
 # Description:     
 #                  Write a Python program using file operation.              
 #                  You will open an input file “students.dat” that will 
 #                  contain a list of student names, classification, 
 #                  and grade in the class. (All student info is completely made up) 
 #                  You should read through the entire input file. 
 #                  After reading in all information, do operations (No built-in    
 #                  functions like Average, min, max, count, etc.)
 #                  
 #
 # Solution:
 #
 #
 #                   •  Highest grade in the class                                          
 #                   •	Lowest grade in the class                                            
 #                   •	Class average grade                   
 #                   •	Number of freshmen students                                          
 #                   •	Number of sophomore students                                         
 #                   •	Number of junior students                                            
 #                   •	Number of senior students      
 #                  
 #
 #
 # Files:           Question1.py
 # 
 #****************************************************************************/

try:
    infile = open('students.dat', 'r')
    
except FileNotFoundError:
    print("Could not open the file for reading")


# While the file are open continue.
with infile:
   
    # initialize variables for all the different categories of grades.
    Lowest_Grade  = 0
    Highest_Grade = 0
    Average_Grade = 0   
        
    #initializing the classification of each student   
    Numb_FreshMen  = 0
    Numb_Sophmores = 0
    Numb_Juniors   = 0
    Numb_Seniors   = 0
    
    # Number of lines in our input file.
    NumLines     = 0
    
    # Setting our flag to true for the comparison of the grades.
    flag = True 
    
    # reading each line of the infile
    for line in infile: 
        
        # Removing the whitespace and splitting by the whitespace.
        input = line.strip().split(' ') 
        
        # since we splitted the input like an array, 
        # the first element of our input[0] is First name 
        FName  = str(input[0])
        
        # since we splitted the input like an array, 
        # the second element of our input[1] is Last name
        LName = str(input[1])
        
        # The last element in our input is the grade.
        grade = int(input[-1])
        
        # if our flag is true, then update the lowest and highest
        # grade to the current grade, then immediately set our flag back to false.
        if flag:
           Lowest_Grade = grade
           Highest_Grade = grade
           flag = False
           
           
        # In this else statement we will compare the current 
        # grade then update it to the right variable.
        else:
         
           # if the current grade is less than Lowest_Grade then update.
           if grade < Lowest_Grade: 
                Lowest_Grade = grade
            
           # if current grade is greater than highest_Grade then update. 
           if grade > Highest_Grade: 
                Highest_Grade = grade
                
                # Here we assign the highest grade to the right person.
                First_Name = FName
                Last_Name = LName
                
        # Here we just add the total grades in order to perfom the math later.
        Average_Grade += grade 
        
        # incrementing the line number. (Which is also the number of student per line.)
        NumLines   += 1 


        # Here we grabbing the second element of the input to determine 
        # which classification is the student. 
        # Then incrementing that classification by one.
        if input[-2].lower() == 'sophomore':
           Numb_Sophmores += 1
           
        elif input[-2].lower() == 'freshman':
           Numb_FreshMen += 1
           
        elif input[-2].lower() == 'senior':
           Numb_Seniors += 1
           
        elif input[-2].lower() == 'junior':
           Numb_Juniors += 1
 
 
# 
try:
    OutFile = open('student_statistics.txt', 'w')
      
except FileNotFoundError:
    print("Could not open the file for writing")
    
OutFile.write("\r===================================================\n")
# writing to the output file
# first we print the person first and last name that had highest grade
# then we print out the highest grade
# the display the lowest grade 
# then the class average  
OutFile.write('\rPerson With the Highest Grade Was :  '+ First_Name + " "+ Last_Name)
OutFile.write('\rThe Highest Grade Was             :  ' + str(Highest_Grade))
OutFile.write('\rThe Lowest Grade Was              :  ' + str(Lowest_Grade))

# average rounded to one decimal place %.1f
OutFile.write('\rThe Class Average Was             :  %.1f'%(Average_Grade / NumLines))


# after we have this printed out, we display the count off all the class 
# members from freshmen to sophmore and then display the name and then the total for 
# each class 
OutFile.write('\r\nThe total # of People in Each Class is Displayed Below\n')
OutFile.write('=================================================\n')
OutFile.write('\rTotal # of Freshman   : ' + str(Numb_FreshMen))
OutFile.write('\rTotal # of Sophomores : ' + str(Numb_Sophmores))
OutFile.write('\rTotal # of Juniors    : ' + str(Numb_Juniors))
OutFile.write('\rTotal # of Seniors    : ' + str(Numb_Seniors) + '\r\n')

# we are done with both the input and output so we can close out
OutFile.close()
infile.close()
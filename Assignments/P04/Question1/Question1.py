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


# try opening up the input file specified by the user then print warning and close program
try:
    InFile = open('students.dat', 'r')
    
except FileNotFoundError:
    print("Could not open the file for reading")


# While the file are open continue.
with InFile:
   
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
    for line in InFile: #read line 
        
        LineElement = line.strip().split(' ') # extract the elements on whitespace
           # after reading each line, the last element is the grade
        # assign default value to start at the first index to hold first and last name
        Name  = str(LineElement[0])# first in the line is first name index 0
        LName = str(LineElement[1])# second in the line is the last name index 1
        
        grade = int(LineElement[3])# grade is the last element
        if flag:
           Lowest_Grade = grade
           Highest_Grade = grade
           flag = False
        else:
           if grade < Lowest_Grade: #if comparison grade is less  than current, update 
                Lowest_Grade = grade
           if grade > Highest_Grade: #if comparison grade is higher than current, update
                Highest_Grade = grade
                
                # assign the values of the person with highest grade change the name
                FirstNamePerson = Name
                LastNamePerson = LName
                
        #find the total grades to be used in average below
        Average_Grade = 0 += grade 
        NumLines   += 1 #increment the line number till no more 

        # iterate over the second index to sum up the class member count for each grade
        # if occurance occurs, increment the counter  for each
        # on the index 2, this is the name of the class
        if LineElement[2].lower() == 'sophomore':
           Numb_Sophmores += 1
        elif LineElement[2].lower() == 'freshman':
           Numb_FreshMen += 1
        elif LineElement[2].lower() == 'senior':
           Numb_Seniors += 1
        elif LineElement[2].lower() == 'junior':
           Numb_Juniors += 1
 
 
 
# try opening up the output file, if exception occured then display to viewer
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
OutFile.write('\rPerson With the Highest Grade Was :  '+ FirstNamePerson +" "+LastNamePerson)
OutFile.write('\rThe Highest Grade Was             :  ' + str(Highest_Grade))
OutFile.write('\rThe Lowest Grade Was              :  ' + str(Lowest_Grade))

# average rounded to one decimal place %.1f
OutFile.write('\rThe Class Average Was             :  %.1f'%(Average_Grade = 0/NumLines))


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
InFile.close()
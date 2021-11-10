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
 #                   Used the try and except to open the input file and output file.
 #                   Use mostly some if and elif statement to Display those below: 
 #
 #                      •  Highest grade in the class                                          
 #                      •	Lowest grade in the class                                            
 #                      •	Class average grade                   
 #                      •	Number of freshmen students                                          
 #                      •	Number of sophomore students                                         
 #                      •	Number of junior students                                            
 #                      •	Number of senior students      
 #                  
 #
 #
 # Files:           - Question1.py
 #                  - student_statistics.txt
 #                  - students.dat
 # 
 #****************************************************************************/

# Using this to open the file for reading, but if the file can't be opened, 
# a File not found exception will be thrown.
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
 
 

# Using this to open the file for writting, but if the file can't be opened, 
# a File not found exception will be thrown.
try:
    OutFile = open('student_statistics.txt', 'w')
      
except FileNotFoundError:
    print("Could not open the file for writing")
    
# Displaying the result to the student statistics file.
OutFile.write("\r#********************** STATISTICS ************************")
OutFile.write('\r# \tStudent with the Highest grade in the class:  '+ First_Name + " "+ Last_Name)
OutFile.write('\r# \tHighest grade in the class                 :  ' + str(Highest_Grade))
OutFile.write('\r# \tThe Lowest Grade in the class              :  ' + str(Lowest_Grade))

# Using the variable call average Grade then 
# dividing it by the number of line( which really is the number of student).
# Then we proceed to rounded to 1 decimal place.
OutFile.write('\r# \tThe Class Average grade                    :  %.1f'%(Average_Grade / NumLines))
OutFile.write("\r#**********************************************************")


# Now we print to the file the total number of each classification.
OutFile.write("\r\n#********************** CLASSIFICATION ********************")
OutFile.write('\r# \tNumber of freshmen students                 : ' + str(Numb_FreshMen))
OutFile.write('\r# \tNumber of Sophomores students               : ' + str(Numb_Sophmores))
OutFile.write('\r# \tNumber of Juniors students                  : ' + str(Numb_Juniors))
OutFile.write('\r# \tNumber of Seniors students                  : ' + str(Numb_Seniors))
OutFile.write("\r#**********************************************************")

# Closing the input and output file.
OutFile.close()
infile.close()
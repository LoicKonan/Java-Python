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
 #                  
 #                  
 # 
 # Solution:
 #                  
 #
 #
 # Files:           Question1.py
 # 
 #****************************************************************************/
 
 
# # try opening up the input file specified by the user
# # if acception occured, then print warning and close program
# try:
#     InFile = open('Program4\Students.dat', 'r')
# except:
#     raise OSError("Could not open or read file Exiting Now")
    

# # try opening up the output file, if exception occured then
# # display to viewer
# try:
#     OutFile = open('Program4\student_statistics.txt', 'w')
# except:
#     raise OSError("Could not open or write to file Exiting Now")

# # if no exceptions occured, continue on with the program
# with InFile:
#     # initialize variables to starting values
#     LowestGrade = 0
#     HighestGrade = 0
#     GradeTotal = 0
#     NumLines = 0
#     TotFreshMen = 0
#     TotSophmores = 0
#     TotSeniors = 0
#     TotJuniors = 0
#     flag = True #flag is true 
    
#     # reading each line of the infile
#     for line in InFile: #read line 
        
#         each_element = line.strip().split(' ') # extract the elements on whitespace
#            # after reading each line, the last element is the grade
#         # assign default value to start at the first index to hold first and last name
#         Name=str(each_element[0])
#         LName=str(each_element[1])
        
#         grade = int(each_element[3])
#         if flag:
#            LowestGrade = grade
#            HighestGrade = grade
#            flag = False
#         else:
#            if grade < LowestGrade: #if comparison grade is less  than current, update 
#                 LowestGrade = grade
#            if grade > HighestGrade: #if comparison grade is higher than current, update
#                 HighestGrade = grade
#                 # assign the values of the person with highest grade change the name
#                 FirstNamePerson=Name
#                 LastNamePerson=LName
                
#         #find the total grades to be used in average below
#         GradeTotal = GradeTotal + grade 
#         NumLines+=1 #increment the line number till no more 

#         # iterate over the second index to sum up the class member count for each grade
#         # if occurance occurs, increment the counter  for each
#         if each_element[2].lower() == 'sophomore':
#            TotSophmores += 1
#         elif each_element[2].lower() == 'freshman':
#            TotFreshMen += 1
#         elif each_element[2].lower() == 'senior':
#            TotSeniors += 1
#         elif each_element[2].lower() == 'junior':
#            TotJuniors += 1
 
# OutFile.write("After Iterating Through our Infile, We determined that")
# OutFile.write("\r===================================================\n")
# # writing to the output file
# # first we print the person first and last name that had highest grade
# # then we print out the highest grade
# # the display the lowest grade 
# # then the class average  
# OutFile.write('\rPerson With the Highest Grade Was :  '+ FirstNamePerson +" "+LastNamePerson)
# OutFile.write('\rThe Highest Grade Was             :  ' + str(HighestGrade))
# OutFile.write('\rThe Lowest Grade Was              :  ' + str(LowestGrade))

# # average rounded to one decimal place %.1f
# OutFile.write('\rThe Class Average Was             :  %.1f'%(GradeTotal/NumLines))

# # after we have this printed out, we display the count off all the class 
# # members from freshmen to sophmore and then display the name and then the total for 
# # each class 
# OutFile.write('\r\nThe total # of People in Each Class is Displayed Below\n')
# OutFile.write('=================================================\n')
# OutFile.write('\rTotal # of Freshman   : ' + str(TotFreshMen))
# OutFile.write('\rTotal # of Sophomores : ' + str(TotSophmores))
# OutFile.write('\rTotal # of Juniors    : ' + str(TotJuniors))
# OutFile.write('\rTotal # of Seniors    : ' + str(TotSeniors) + '\r\n')

# # we are done with both the input and output so we can close out
# OutFile.close()
# InFile.close()


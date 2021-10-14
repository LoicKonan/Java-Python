#/**
# This is program about:
#
# # if
# if - else
# if elif else
# for
# while - find the summation of all lower digits.
# 
# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/11/2021 
# 

# if statements.
print('Enter Hello')
usrinput = input(">> ")

if usrinput == "Hello":
  print("Hi")


# if else statements.
x = 5
print('x val is: ', x)

if(int (x > 10)):
    print('x is greater than 10')
    
else:
    print('Your value is less than 10')
    
print('ed of the program')


# if elif else

if(int(x) > 10):
    print('Greater than 5')

elif(int(x) > 5):
    print('Greater than 10')
    
elif(int(x) > 15):
    print('Greater than 15')
            
else:
    print('Printing from default')

print('End of code')


# try # while

try:
    val = int(x)
    
    while  val > 0: 
        print(val)
        val -= 1
    
except: 
    print('You have not entered a number')
    
finally: 
    print('BYE')
    


num = int(input("Enter a number: ")) 

if num < 0:
   print("Please enter a positive number")
else:
   sum = 0
   
   # use while loop to iterate until zero
   while(num > 0):
       sum += num
       num -= 1
   print("The result is", sum)
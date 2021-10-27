# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/20/2021 
# 

# def addition(param1,param2):
#     return param1 + param2


# print('Enter two values: ')
# x = int(input())
# y = int(input()) 
# print('You have entered: ', x, y)

# res = addition(x,y)
    
# print(res)



# def fib(n):
#     if n < 0:
#         print("That invalid input")
 
#     # Check if n is 0
#     # then it will return 0
#     elif n == 0:
#         return 0
 
#     # Check if n is 1,2
#     # it will return 1
#     elif n == 1 or n == 2:
#         return 1
 
#     else:
#         return fib(n-1) + fib(n-2)

# print("Give me nth fib number")
# x = int(input())
# fibn = fib(x)
# print(fibn)


# str1 = 'apple'
# print(type(str1))
# print(dir(str1))


# str2 = ''
# str2 = str1[3:]

# str2.lstrip()
# str1 = str2
# print(str1)

# str2 = str(input("Please enter a string of values: "))
# print(str2.lstrip())


word = '3410 Taft Blvd, Wichita Falls, TX, 84112'
      
var1,var2,var3,var4 = [str(i) for i in word.split(",")]

if type(var1) and type(var1) == str:
    pass
else:
    print("1 Please Enter a valid address for the person number ") # + str(x+1) + " : ") 

if type(var3) == str and len(var3) == 2:
    pass
else:
    print("2 Please Enter a valid address for the person number ") # + str(x+1) + " : ") 

if var4.isdigit() and len(var3) == 5:
    pass
else:
    print("3 Please Enter a valid address for the person number ") # + str(x+1) + " : ") 
 
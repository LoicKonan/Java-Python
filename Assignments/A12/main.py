# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/20/2021 
# 

def addition(param1,param2):
    return param1 + param2


print('Enter two values: ')
x = int(input())
y = int(input()) 
print('You have entered: ', x, y)

res = addition(x,y)
    
print(res)



def fib(n):
    if n < 0:
        print("That invalid input")
 
    # Check if n is 0
    # then it will return 0
    elif n == 0:
        return 0
 
    # Check if n is 1,2
    # it will return 1
    elif n == 1 or n == 2:
        return 1
 
    else:
        return fib(n-1) + fib(n-2)

print("Give me nth fib number")
x = int(input())
fibn = fib(x)
print(fibn)


str1 = 'apple'

print(str1[-3:])
print(str1[1:])
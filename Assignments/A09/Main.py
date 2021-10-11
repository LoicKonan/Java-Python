#/**
# This is program about Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/11/2021 
# 

# built in funtion
# str()
# float()
# int()
# len()
# type()
# divmod()
# string concat()

var = '3'

print(type(var))
var = int(var)
print(type(var))

var = float(var)
print(type(var))

var =  31
var1 = var//2
var2 = var/2
var3 = var % 5
d, m = divmod(var, 5)
print(d,m)
print(var1, var2, var3)


var1 = 'Hello'
var2 = 'word'

print(var1 + ' ' + var2)

print(len(var1))


print('Enter your name and last name:')
fname = input()
lname = input()

print("your name is: ", fname, lname)



var1 = '3'
var2 = var * 3
print(type(var2))

arr = [0] 
arr = arr * 3
arr = [0,0,0]
print(arr)


var = 3

if var < 10:
    print('var is less than 10')
else:
    print('var is greater')
    
print('End')


var =  31
var1 = var//2
var2 = var/2
var3 = var % 5
d, m = divmod(var, 5)
print(d,m)
print(var1, var2, var3)

var4 = 2 ** 3
print(var4)

print(float('inf'))

var1 = 'Hello'
var2 = 'word'

print(var1 + ' ' + var2)


print('Enter your name and last name:')
fname = input()
lname = input()

print("your name is: ", fname, lname)
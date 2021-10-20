# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/20/2021 
# 

def salary(param1,param2):
    
    if(param1 <= 40):
        return param1 * param2
    
    elif (param1 > 40): 
        A = param1 - 40
        return 40 * param2 + A * 15 


print('Enter your hours and your your rate: ')
x = float(input())
y = float(input()) 
print('You have entered: ', x, y)

res = salary(x,y)
    
print(res)
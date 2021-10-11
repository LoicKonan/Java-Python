# 3 types of vars, int float, str;

var = '3'

print(type(var))
var = int(var)
print(type(var))

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
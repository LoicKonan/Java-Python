

def addition(param1,param2):
    return param1 + param2

print('Enter two values: ')
x = int(input)
y = int(input)
print('You have entered: ', x, y)

try:
    x = int(input)
    y = int(input) 
    
    res = addition(x,y)
    
    print(res)

except:   
    print('no')
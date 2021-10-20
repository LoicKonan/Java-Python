# enter hours: 45
# Enter rate: 10   

# pay: 475.0  

#475 = 40 * 10 + 5 * 15


def addition(param1,param2):
    return param1 * param2


print('Enter your hours and your your rate: ')
x = int(input())
y = int(input()) 
print('You have entered: ', x, y)

res = addition(x,y)
    
print(res)


def addition(param1,param2):
    return param1 + param2


print('Enter two values: ')
x = int(input())
y = int(input()) 
print('You have entered: ', x, y)

res = addition(x,y)
    
print(res)



def fib(n):
    if n < 1:
        return -1
    
    elif n == 1 or n == 2:
        return 1
    
    else:
        return fib(n-1) + (n-2) 


print("Give me nth fib number")
x = int(input())
fibn = fib(x)
print(fibn)
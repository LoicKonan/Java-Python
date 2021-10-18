# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/18/2021 
# 

# 1. range()
# 2. reversed()
# 3. List
# 4. continue
# 5. break
# 6. min()

import random

l1 = [1,2,3,4,5]
print('length: ' , len(l1))

# #here we printing the value of i.
# for i in range(len(l1)):
#     print(i)
    

# for i in range(len(l1)):
#     print(l1[i])
    
counter = 0
# here i is the value.
for val in l1:
    counter +=1
    if val == 3:
        print('I found 3')
        continue
        print( counter, '3 is not found')


# range (starting, stopping, stepping)
# for i in range(0,10,2):
#     print(i)
    
# print('Enter some value')
# x = input(print(''))

# try:
#     intval = int(x)
#     for i in range(intval):
#         print(i)
#     # for i in reversed(range(0, intval,1)):
#     #     print(i)
# except:
#     print('you have not entered a numberic value')
    


l2 = [3,78,125,34,-45,-43]

largest_so_far = 0 #float('-inf')

# for val in l2:
#     if val > largest_so_far:
#         largest_so_far = val
    
# print(largest_so_far)

for val in l2:
    if val < largest_so_far:
        largest_so_far = val
print(largest_so_far)

print(sum(l2))
acc = 0
for val in l2:
    acc += val
print(acc)

largest = None

for i in l2: 
    if largest is None:
        largest = i
    elif i > largest:  
        largest = i   
print('The largest number is: ', largest)

for i in range(5):
    print(random.randint(1,10))
    
def generateNumbers(n):
    l3 =[]
    for i in range(n):  
        ranVal = random.randint(100,200)
        l2.add(ranVal)
    return l2
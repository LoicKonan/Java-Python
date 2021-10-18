# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/18/2021 
# 

# 1. range()
# 2. reversed()
# 3. continue
# 4. break


# range (starting, stopping, stepping)
# for i in range(0,10,2):
#     print(i)
    
print('Enter some value')
x = input(print(''))

try:
    intval = int(x)
    for i in range(intval):
        print(i)
    # for i in reversed(range(0, intval,1)):
    #     print(i)
except:
    print('you have not entered a numberic value')
    

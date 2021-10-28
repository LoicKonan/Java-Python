# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/27/2021 
# 

l1 = [1, 3, 4, 7, 8, 5, 2]
target = 13

def sumoftwo(l1,target):         
    d1 = dict()
    
    
    for i in l1:
        remaining = target - i   
        if remaining in d1:
            return [remaining - i]
        else:
            d1[i] = None
            
            
print(sumoftwo(l1,target))
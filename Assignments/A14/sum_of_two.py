# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/27/2021 
# 

# l1 = [1, 3, 4, 7, 8, 5, 2]
# target = 13

# def sumoftwo(l1,target):         
#     d1 = dict()
#     for i in l1:
#         remaining = target - i   
#         d1[i] = remaining
#         if remaining in d1:
#             return [remaining - i]
#         else:
#             d1[i] = None
            
            

# type nums: List[int]
# type target: int
# rtype: List[int]

input_list =  [1, 3, 4, 7, 8, 5, 2]
target = 13

def twoSum(input_list, target):
    empty_dictionary = ()
    for i in range(len(nums)):
        if target - nums[i] in required:
            return [required[target - nums[i]],i]
        else:
            required[nums[i]]=i
            
print(twoSum(input_list, target))
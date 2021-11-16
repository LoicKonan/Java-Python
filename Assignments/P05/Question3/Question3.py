 #****************************************************************************
 # Author:          Loic Konan 
 # Email:           loickonan.lk@gmail.com 
 # Label:           Question 3 
 # Title:           Programing Assignment 05 
 # Course:          CMPS 4143 
 # Semester:        Fall 2021 
 # Date:            11/22/2021
 # 
 # Description:     
 #                  
 #                  
 # 
 # Solution:
 #                  
 #
 #
 # Files:           Question3.py
 # 
 #****************************************************************************/
 
# Time Complexity: O(N).
# Space Complexity: O(N).

class MovingAverage:
    
    def __init__(self, size: int):
        """
        Initialize your data structure here.
        """
        self.numbers = []
        self.size = size
        

    def next(self, val: int) -> float:
        self.numbers.append(val)
        
        if len(self.numbers) > self.size:
            return sum(self.numbers[-(self.size):]) / self.size 
                
        return sum(self.numbers) / len(self.numbers) 
        

# Your MovingAverage object will be instantiated and called as such:
result = []

obj = MovingAverage(3)
param_1 = obj.next(1)
res = param_1
result.append(res)

param_1 = obj.next(10)
res = param_1
result.append(res)

param_1 = obj.next(3)
res = param_1
result.append(res)

param_1 = obj.next(5)
res = param_1
result.append(res)
print(result)



result2 = []
obj = MovingAverage(2)
param_1 = obj.next(1)
res = param_1
result2.append(res)

param_1 = obj.next(10)
res = param_1
result2.append(res)

param_1 = obj.next(3)
res = param_1
result2.append(res)

param_1 = obj.next(5)
res = param_1
result2.append(res)
print(result2, "\n")



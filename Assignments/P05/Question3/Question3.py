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
# Initializing our queue
queue  = []

# Insert the size of the window.
obj = MovingAverage(3)

# Changing the window size then adding elements to the Empty queue.
res = obj.next(1)
queue .append(res)

res = obj.next(10)
queue .append(res)

res = obj.next(3)
queue .append(round(res,2))

res = obj.next(5)
queue .append(res)
print(queue )


# Removing elements from the queue
queue.pop(0)
queue.pop(0)
queue.pop(0)
queue.pop(0)


# Changing the window size then adding elements to the Empty queue.
obj = MovingAverage(2)
res = obj.next(1)
queue .append(res)

res = obj.next(10)
queue .append(res)

res = obj.next(3)
queue .append(round(res,2))

res = obj.next(5)
queue .append(res)
print(queue)


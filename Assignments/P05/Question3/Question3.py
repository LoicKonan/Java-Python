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
        self.numbers = []
        self.size = size
        

    def next(self, val: int) -> float:
        self.numbers.append(val)
        
        if len(self.numbers) > self.size:
            return sum(self.numbers[-(self.size):]) / self.size
                
        return sum(self.numbers) / len(self.numbers) 
        


# Driver code
print('''
 #*******************************************#
 # Author:         Loic Konan                # 
 # Email:          loickonan.lk@gmail.com    # 
 # Label:          Question 3                #
 # Title:          Programing Assignment 05  #
 # Course:         CMPS 4143                 #
 # Semester:       Fall 2021                 #
 # Date:           11/22/2021                #
 #*******************************************#
 ''')

# Your MovingAverage object will be instantiated and called as such:
# Initializing our queue
queue  = []

# Insert the size of the window.

WindowSize = int(input("Enter the window size: "))

obj = MovingAverage(WindowSize)

# Changing the window size then adding elements to the Empty queue.
res = obj.next(1)
queue .append(res)

res = obj.next(10)
queue .append(res)

res = obj.next(3)
queue .append(round(res,2))

res = obj.next(5)
queue .append(res)

print("\n\tWindow size:  ",WindowSize)
print("\tStream       : [1, 10, 3, 5]")
print("\tOutput       : ", queue )


# Removing elements from the queue
queue.pop(0)
queue.pop(0)
queue.pop(0)
queue.pop(0)


# Changing the window size then adding elements to the Empty queue.
WindowSize = int(input("\n\nEnter the window size: "))
obj = MovingAverage(2)
res = obj.next(1)
queue .append(res)

res = obj.next(10)
queue .append(res)

res = obj.next(3)
queue .append(round(res,2))

res = obj.next(5)
queue .append(res)

print("\n\tWindow size: ",WindowSize)
print("\tStream = [1, 10, 3, 5]")
print("\tOutput: ", queue )


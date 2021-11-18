# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/17/2021 

class Queue():     
    min = float('inf')
    
    # Initialized the MinQueue object.
    def __init__(self):
           self.min=float('inf')
           
           # Empty list.
           self.MinQueue = []
        
    # enMinQueue.enqueuees the element value onto the MinQueue.
    def enqueue(self, value):
        
            # if the value that we adding is less than our current
            # min value, then we add the value to the MinQueue
            # then assign the value as the new min value.
            if value <= self.min:
                self.MinQueue.append(self.min)
                self.min = value
                
            # otherwise just add the value to the MinQueue.
            self.MinQueue.append(value)
            
    # Removes the element on the Front of the MinQueue.
    def dequeue(self):
        
            # Assign the last element to of the MinQueue to a 
            # temporary variable then recursively call the dequeue() function itself. 
            t = self.MinQueue[-1]
            self.MinQueue.pop(0)
            
            # if the min value is equal to that temporary variable
            # then set the value to the temporary variable to the min value
            # and call the dequeue() function.
            if self.min == t:
                self.min = self.MinQueue[-1]
                self.MinQueue.pop(0)
                
    # Return the last element on the Queue.   
    def Front(self):
            return self.MinQueue[0]
    
    # Retrieving the minimum element in the MinQueue.    
    def getMin(self):
            return self.min
    
    def rear(self):
        if self.MinQueue:
            return self.MinQueue[-1]
        
 

# Driver code
print('\n---------------- Queue --------------')	

queue = Queue() 
queue.enqueue(-2)
queue.enqueue(0)
queue.enqueue(-3)
print("\nReturning the getMin():        ",       queue.getMin())

queue.dequeue()
print("Returning the Front:            ", queue.Front())
print("Returning the REAR:            ", queue.rear())

print("Return the new getMin():       ", queue.getMin())
print('\n-------------------------------------')	

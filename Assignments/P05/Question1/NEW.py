class MinStack():     
    min = float('inf')
    
    # Initialized the stack object.
    def __init__(self):
           self.min=float('inf')
           
           # Empty list.
           self.stack = []
        
    # Pushes the element value onto the stack.
    def push(self, value):
        
            # if the value that we adding is less than our current
            # min value, then we add the value to the stack
            # then assign the value as the new min value.
            if value <= self.min:
                self.stack.append(self.min)
                self.min = value
                
            # otherwise just add the value to the stack.
            self.stack.append(value)
            
    # Removes the element on the top of the stack.
    def pop(self):
        
            # Assign the last element to of the stack to a 
            # temporary variable then recursively call the pop() function itself. 
            t = self.stack[-1]
            self.stack.pop()
            
            # if the min value is equal to that temporary variable
            # then set the value to the temporary variable to the min value
            # and call the pop() function.
            if self.min == t:
                self.min = self.stack[-1]
                self.stack.pop()
                
    # Return the last element on the Minstack.   
    def top(self):
            return self.stack[-1]
    
    # Retrieving the minimum element in the stack.    
    def getMin(self):
            return self.min
        
 

# Driver code
print('\n---------------- MinStack --------------')	

stack = MinStack() 
stack.push(-2)
stack.push(0)
stack.push(-3)
print("\nReturning the getMin() :         ",       stack.getMin())
stack.pop()
print("Returning the top after the pop : ", stack.top())
print("Return the new getMin() :        ", stack.getMin())
print('\n----------------------------------------')
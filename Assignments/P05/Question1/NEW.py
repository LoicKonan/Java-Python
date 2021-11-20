# 
 
 
 
 
class Node:
	
	# Class to create nodes of linked list
	# constructor initializes node automatically
	def __init__(self, data):
		self.data = data
		self.next = None
	
class MinStack(Node):

        min = float('inf')

        # Initialized the stack object.
        def __init__(self):
                self.min = float('inf')
                self.head = None
                
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
                return self.stack[0]

        # Retrieving the minimum element in the stack.    
        def getMin(self):
                return self.min

        
        # Checks if stack is empty 
        def empty(self):
                if self.head == None:
                        return True
                else:
                        return False


        
# Driver code
MyStack = MinStack()

# Inserting few elements 
MyStack.push(-125)
MyStack.push(65)
MyStack.push(-5)
MyStack.push(82)


# Print top element of stack
print("\nTop element is ",MyStack.top())



print("\nTop element is ",MyStack.top())


print("\nMin element is: ", MyStack.getMin())


# Print top element of stack
print("\nThe new Top element is ", MyStack.top())

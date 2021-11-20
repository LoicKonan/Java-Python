 #****************************************************************************
 # Author:          Loic Konan 
 # Email:           loickonan.lk@gmail.com 
 # Label:           Question 1 
 # Title:           Programing Assignment 05 
 # Course:          CMPS 4143 
 # Semester:        Fall 2021 
 # Date:            11/22/2021
 # 
 # Description:     
 #					You need to implement the stack with Linkedlist data 
 # 					structure in python. Implement the stack means, all of the 
 # 					stack functionalities including the construction of stacks 
 # 					should present on your code.
 #				    
 # 
 # Solution:				
 # 					My stack data structure has following functionalities: 
 #
 # 						- empty()   => Returns whether the stack is empty.
 #						- size() 	=> Returns the size of the stack.
 # 						- top() 	=> Returns a reference to top element.
 # 						- push() 	=> Inserts the element at the top of the stack.
 # 						- pop() 	=> Deletes the topmost element of the stack. 
 #						- getMin() 	=> Retrieving the minimum element in the stack.
 #
 #                  Each of these functions have a Constant complexity O(1) 
 #                  
 #
 # Files:           Question1.py
 # 
 #****************************************************************************/
 
 
class Node:
	
	# Class to create nodes of linked list
	# constructor initializes node automatically
	def __init__(self,data):
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
            return self.stack[-1]
    
    # Retrieving the minimum element in the stack.    
    def getMin(self):
            return self.min


	# Checks if stack is empty 
	def empty(self):
		if self.head == None:
			return True
		else:
			return False

	# Prints out the stack	
	def display(self):
		
		iternode = self.head
		if self.empty():
			print("Stack Underflow")
		
		else:
			
			while(iternode != None):
				
				print(iternode.data,"->", end = " ")
				iternode = iternode.next
    
		
# Driver code
MyStack = MinStack()

# Inserting few elements to the stack: 11, 22, 33, 44
MyStack.push(-125)
MyStack.push(65)
MyStack.push(-5)
MyStack.push(82)

# Display stack elements
print('\nNow displaying the stack below: ')
MyStack.display()

# Print top element of stack
print("\nTop element is ",MyStack.top())

# Delete top elements of stack
print("\nDeletes the topmost element of the stack" )
MyStack.pop()


print("\nTop element is ",MyStack.top())


print("\nMin element is: ")
MyStack.getMin()

# Display stack elements
print('\nNow displaying the new stack: ')
MyStack.display()

# Print top element of stack
print("\nThe new Top element is ", MyStack.top())

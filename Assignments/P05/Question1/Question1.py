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
 # 						- empty()   => Returns whether the stack is empty 
 # 						- top() 	=> Returns a reference to top element 
 # 						- push() 	=> Inserts the element at the top of the stack
 # 						- pop() 	=> Deletes the topmost element of the stack 
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
	
class Stack:
	
	# head is default NULL
	def __init__(self):
		self.head = None
	
	# Checks if stack is empty
	def empty(self):
		if self.head == None:
			return True
		else:
			return False
	
	# Method to add data to the stack
	# adds to the start of the stack
	def push(self,data):
		
		if self.head == None:
			self.head=Node(data)
			
		else:
			newnode = Node(data)
			newnode.next = self.head
			self.head = newnode
	
	# Remove element that is the current head (start of the stack)
	def pop(self):
		
		if self.empty():
			return None
			
		else:
			# Removes the head node and makes
			#the preceding one the new head
			poppednode = self.head
			self.head = self.head.next
			poppednode.next = None
			return poppednode.data
	
	# Returns the head node data
	def top(self):
		
		if self.empty():
			return None
			
		else:
			return self.head.data
	
	# Prints out the stack	
	def display(self):
		
		iternode = self.head
		if self.empty():
			print("Stack Underflow")
		
		else:
			
			while(iternode != None):
				
				print(iternode.data,"->",end = " ")
				iternode = iternode.next
		
# Driver code
MyStack = Stack()

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

# Display stack elements
print('\nNow displaying the new stack: ')
MyStack.display()

# Print top element of stack
print("\nThe new Top element is ", MyStack.top())

# Class to make a Node
class Node:
	# Constructor which assign argument to nade's value
	def __init__(self, value):
		self.value = value
		self.next = None

	# This method returns the string representation of the object.
	def __str__(self):
		return "Node({})".format(self.value)
	
	# __repr__ is same as __str__
	__repr__ = __str__


class Stack:
	# Stack Constructor initialise top of stack and counter.
	def __init__(self):
		self.top = None
		self.count = 0
		self.minimum = None
		
	# This method returns the string representation of the object (stack).
	def __str__(self):
		temp = self.top
		out = []
		while temp:
			out.append(str(temp.value))
			temp = temp.next
		out = '\n'.join(out)
		return ('Top {} \n\nStack :\n{}'.format(self.top,out))
		
	# __repr__ is same as __str__
	__repr__=__str__
	
	# This method is used to get minimum element of stack
	def getMin(self):
		if self.top is None:
			return "Stack is empty"
		else:
			print("Minimum Element in the stack is: {}" .format(self.minimum))



	# Method to check if Stack is Empty or not
	def isEmpty(self):
		# If top equals to None then stack is empty
		if self.top == None:
			return True
		else:
		# If top not equal to None then stack is empty
			return False

	# This method returns length of stack	
	def __len__(self):
		self.count = 0
		tempNode = self.top
		while tempNode:
			tempNode = tempNode.next
			self.count+=1
		return self.count

	# This method returns top of stack	
	def peek(self):
		if self.top is None:
			print ("Stack is empty")
		else:
			if self.top.value < self.minimum:
				print("Top Most Element is: {}" .format(self.minimum))
			else:
				print("Top Most Element is: {}" .format(self.top.value))

	# This method is used to add node to stack
	def push(self,value):
		if self.top is None:
			self.top = Node(value)
			self.minimum = value
		
		elif value < self.minimum:
			temp = (2 * value) - self.minimum
			new_node = Node(temp)
			new_node.next = self.top
			self.top = new_node
			self.minimum = value
		else:
			new_node = Node(value)
			new_node.next = self.top
			self.top = new_node
		print("Number Inserted: {}" .format(value))

	# This method is used to pop top of stack
	def pop(self):
		if self.top is None:
			print( "Stack is empty")
		else:
			removedNode = self.top.value
			self.top = self.top.next
			if removedNode < self.minimum:
				print ("Top Most Element Removed :{} " .format(self.minimum))
				self.minimum = ( ( 2 * self.minimum ) - removedNode )
			else:
				print ("Top Most Element Removed : {}" .format(removedNode))

	# Prints out the stack	
	def display(self):
		
		iternode = self.top
		if self.isEmpty():
			print("Stack Underflow")
		
		else:
			
			while(iternode != None):
				
				print(iternode.value,"->",end = " ")
				iternode = iternode.next			
			
	
# Driver program to test above class
MyStack = Stack()

# Inserting few elements to the stack: 11, 22, 33, 44
MyStack.push(-125)
MyStack.push(65)
MyStack.push(-5)
MyStack.push(82)


# Display stack elements
print('\nNow displaying the stack below: ')
MyStack.display()

MyStack.getMin()

# Delete top elements of stack
print("\nDeletes the topmost element of the stack" )
MyStack.pop()

# Display stack elements
print('\nNow displaying the new stack: ')
MyStack.display()

MyStack.getMin()

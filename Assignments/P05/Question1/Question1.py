 #****************************************************************************
 # Author:         Loic Konan 
 # Email:          loickonan.lk@gmail.com 
 # Label:          Question 1 
 # Title:          Programing Assignment 05 
 # Course:         CMPS 4143 
 # Semester:       Fall 2021 
 # Date:           11/22/2021
 # 
 # Description:     
 #		   You need to implement the stack with Linkedlist data 
 # 	           structure in python. Implement the stack means, 
 #                 all of the stack functionalities including the 
 #                 construction of stacks should present on your code.
 #				    
 # 
 # Solution:				
 # 		   My stack data structure has following functionalities: 
 #
 # 		      - empty()  => Returns whether the stack is empty.
 #		      - size()   => Returns the size of the stack.
 # 		      - top() 	 => Returns a reference to top element.
 # 		      - push() 	 => Inserts the element at the top of the stack.
 # 		      - pop()  	 => Deletes the topmost element of the stack. 
 #		      - getMin() => Retrieving the minimum element in the stack.
 #
 #                 Each of these functions have a Constant complexity O(1) 
 #                  
 #
 # Files:          Question1.py
 # 
 #****************************************************************************/
 
class Node:
        
        def __init__(self, value):
                self.value = value
                self.next = None

class MinStack:
        
        def __init__(self):
                self.head = None
                self.min = float('inf')

        def push(self, value):
                if self.head == None:
                        self.head = Node(value)
                        self.min = value
                else:
                        if value >= self.min:
                                n = Node(value)
                                n.next = self.head
                                self.head = n
                        else:
                                n = Node(value)
                                n.next = self.head
                                self.head = n
                                self.min = value


        def pop(self):
                if self.head:
                        self.head = self.head.next

        def top(self):
                if self.head:
                        if self.head.value < self.min:
                                return self.min
                        else:
                                return self.head.value
                else:
                        return "The Stack is Freaking Empty"

        def getMin(self):
                if self.head:
                        return self.min
                else:
                        return "The Stack is Freaking Empty"
                
        def empty(self):
                if self.head == None:
                        return True
                else:
                        return False
        
        # Prints out the stack	
        def display(self):
                
                iternode = self.head
                if self.empty():
                        print("The Stack is Freaking Empty")
                
                else:
                        
                        while(iternode != None):
                                
                                print("[", iternode.value,"] ->", end = " ")
                                iternode = iternode.next
                                
# Driver code
MyStack = MinStack()

# Inserting few elements to the stack
print('''
################################### 
###### Inserting Elements ######### 
################################### 
      ''')
MyStack.push(-1)
print("\tNumber Inserted [ -1 ]")

MyStack.push(-10)
print("\tNumber Inserted [ -10]")

MyStack.push(15)
print("\tNumber Inserted [ 15 ]")


# Displaying the Stack elements
print('''
################################### 
######  Display the Stack ######### 
################################### 
      ''')
print(MyStack.display())


# Print Top element of stack
print('''
################################### 
########## Top element  ########### 
################################### 
      ''')
print("\t     ", MyStack.top())


# Print Min element of stack
print('''
################################### 
########## Min element  ########### 
################################### 
      ''')
print("\t     ", MyStack.getMin())


# Pop element in the stack
print('''
################################### 
######## Popping element  #########
################################### 
      ''')
print("\t     ", MyStack.top())
MyStack.pop()


# Pop element in the stack
print('''
################################### 
######## Popping element  #########
################################### 
      ''')
print("\t     ", MyStack.top())
MyStack.pop()


# Displaying the Stack elements
print('''
################################### 
######  Display the Stack ######### 
################################### 
      ''')
print(MyStack.display())


# Inserting few elements to the stack
print('''
################################### 
###### Inserting Elements ######### 
################################### 
      ''')
MyStack.push(-20)
print("\tNumber Inserted [ -20]")

MyStack.push(103)
print("\tNumber Inserted [ 103]")


# Displaying the Stack elements
print('''
################################### 
######  Display the Stack ######### 
################################### 
      ''')
print(MyStack.display())


# Pop element of stack
print('''
################################### 
######## Popping element  #########
################################### 
      ''')
print("\t     ", MyStack.top())
MyStack.pop()


# Displaying the Stack elements
print('''
################################### 
######  Display the Stack ######### 
################################### 
      ''')
print(MyStack.display())


# Print Min element of stack
print('''
################################### 
########## Min element  ########### 
################################### 
      ''')
print("\t     ", MyStack.getMin())

# Print Top element of stack
print('''
################################### 
########## Top element  ########### 
################################### 
      ''')
print("\t     ", MyStack.top())
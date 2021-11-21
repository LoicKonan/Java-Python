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
 # 		      - isEmpty() => Returns whether the stack is empty.
 #		      - getSize() => Returns the size of the stack.
 # 		      - top() 	  => Returns a reference to top element.
 # 		      - push() 	  => Inserts the element at the top of the stack.
 # 		      - pop()  	  => Deletes the topmost element of the stack. 
 #		      - getMin()  => Retrieving the minimum element in the stack.
 #
 #                 Each of these functions have a Constant complexity O(1) 
 #                  
 #
 # Files:          Question1.py
 # 
 #****************************************************************************/
 
# Class to create nodes of linked list
# constructor initializes node automatically 
class Node:
        
        def __init__(self, value):
                self.value = value
                self.next = None
# My Stack Class.
class MinStack:
        
        # head is default NULL
        # initializing the min variable to a float
        # initializing the size to Zero
        def __init__(self):
                self.head = None
                self.min = float('inf')
                self.size = 0

        # Method to add data to the stack
        # adds to the start of the stack
        # Also increasing the size of the stack.
        def push(self, value):
                self.size += 1
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

        # Remove element that is the current head (start of the stack)
        # also decrease the size of the stack.
        def pop(self):
                self.size -= 1
                if self.head:
                        self.head = self.head.next
                else:
                        raise Exception('the Stack is Empty')
                
        # Returns a reference to top element.
        # or display empty.
        # if the stack is empty return that it is.
        def top(self):
                if self.head:
                        if self.head.value < self.min:
                                return self.min
                        else:
                                return self.head.value
                else:
                        return "The Stack is Freaking Empty"
          
                
        # Retrieving the minimum element in the stack.
        # if the stack is empty return that it is.
        def getMin(self):
                if self.head:
                        return self.min
                else:
                        return "The Stack is Freaking Empty"
                
        # Checks if stack is empty  
        def isEmpty(self):
                if self.head == None:
                        return True
                else:
                        return False
        
        # Get the current size of the stack
        def getSize(self):
                return self.size


        # Prints out the stack with a little stylying.
        # if the stack is empty return that it is.	
        def display(self):
                
                iternode = self.head
                if self.isEmpty():
                        print("The Stack is Freaking Empty")
                
                else:
                        while(iternode != None):
                                print("\t[", iternode.value,"] ->", end = " ")
                                iternode = iternode.next
                                
# Driver code
MyStack = MinStack()

print('''
 #*******************************************#
 # Author:         Loic Konan                # 
 # Email:          loickonan.lk@gmail.com    # 
 # Label:          Question 1                #
 # Title:          Programing Assignment 05  #
 # Course:         CMPS 4143                 #
 # Semester:       Fall 2021                 #
 # Date:           11/22/2021                #
 #*******************************************#''')
# Inserting few elements to the stack
print('''
        ################################### 
        ###### Inserting Elements ######### 
        ################################### 
      ''')
MyStack.push(-1)
print("\t\tNumber Inserted [ -1 ]")

MyStack.push(-10)
print("\t\tNumber Inserted [ -10]")

MyStack.push(15)
print("\t\tNumber Inserted [ 15 ]")


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
print("\t\t     ", MyStack.top())


# Print Min element of stack
print('''
        ################################### 
        ########## Min element  ########### 
        ################################### 
        ''')
print("\t\t     ", MyStack.getMin())


# Pop element in the stack
print('''
        ################################### 
        ######## Popping element  #########
        ################################### 
        ''')
print("\t\t     ", MyStack.top())
MyStack.pop()


# Pop element in the stack
print('''
        ################################### 
        ######## Popping element  #########
        ################################### 
        ''')
print("\t\t     ", MyStack.top())
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
print("\t\tNumber Inserted [ -20]")

MyStack.push(103)
print("\t\tNumber Inserted [ 103]")


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
print("\t\t     ", MyStack.top())


# Print Min element of stack
print('''
        ################################### 
        ########## Min element  ########### 
        ################################### 
        ''')
print("\t\t     ", MyStack.getMin())

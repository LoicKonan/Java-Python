class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class MinStack:
        def __init__(self):
                self.head = None
                self.min = float('inf')

        # @param x, an integer
        def push(self, x):
                if self.head == None:
                        self.head = Node(x)
                        self.min = x
                else:
                        if x >= self.min:
                                n = Node(x)
                                n.next = self.head
                                self.head = n
                        else:
                                v = 2 * x - self.min
                                n = Node(v)
                                n.next = self.head
                                self.head = n
                                self.min = x

        # @return nothing
        def pop(self):
                if self.head:
                        if self.head.value < self.min:
                                self.min = self.min * 2 - self.head.value
                        self.head = self.head.next

        # @return an integer
        def top(self):
                if self.head:
                        if self.head.value < self.min:
                                self.min = self.min * 2 - self.head.value
                                return self.min
                        else:
                                return self.head.value
                else:
                        return -1

        # @return an integer
        def getMin(self):
                if self.head:
                        return self.min
                else:
                        return -1
                
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
                                
                                print(iternode.value,"->", end = " ")
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


print("\nMin element is: ", MyStack.getMin())

# Display stack elements
print('\nNow displaying the new stack: ')
MyStack.display()


# Delete top elements of stack
print("\nDeletes the topmost element of the stack" )
MyStack.pop()


# Print top element of stack
print("\nThe new Top element is ", MyStack.top())


class StackNode:

    def __init__(self, data):
        
        self.data = data
        self.next = None

class Stack:

    min = float('inf')
    def __init__(self):
        
        self.min = float('inf')
        self.head = None

    # Push and pop operations
    def push(self, data):

        if (self.head == None):
            self.head = StackNode(data)
            return
        
        s = StackNode(data)
        s.next = self.head
        self.head = s

    def pop(self):

        s = self.head
        self.head = self.head.next
        return s

    # Prints contents of stack
    def display(self):

        s = self.head
        
        while (s != None):
            print(s.data, end = ' ')
            s = s.next
            
    def getMin(self):
                if self.head:
                        return self.min
                else:
                        return -1
                
    def empty(self):
                if self.head == None:
                        return True
                else:
                        return False
        

s = Stack()
s.push(1)
s.push(2)
s.push(3)
s.push(4)

s.display()
print()
	
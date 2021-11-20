
class StackNode:

    def __init__(self, data):
        
        self.data = data
        self.next = None

class Stack:

    def __init__(self):
        
        self.top = None

    # Push and pop operations
    def push(self, data):

        if (self.top == None):
            self.top = StackNode(data)
            return
        
        s = StackNode(data)
        s.next = self.top
        self.top = s

    def pop(self):

        s = self.top
        self.top = self.top.next
        return s

    # Prints contents of stack
    def display(self):

        s = self.top
        
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
	
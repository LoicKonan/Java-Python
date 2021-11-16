# November 15,2021

class MinStack(): 
    def __init__(self):
        self.data = [] 
        self.min = None

    def push(self, value): 
        self.data.append(value)
        self.minimum()

    def pop(self): 
        if self.isEmpty():
            print("Stack currently empty")
        else:
            print("popping element successful")
            return self.data.pop()

    def minimum(self): 
        if self.min is None:
            self.min = self.viewtop()
        else:
            if self.viewtop() < self.min:
                self.min = self.viewtop()

    def Min(self): 
        return self.min
    
    def top(self):
        return self.data[-1]

    def size(self): 
        return len(self.data)

    def isEmpty(self): 
        return self.size() == 0


stack = MinStack() 
stack.push(-2)
stack.push(0)
stack.push(-3)
print("Return MinStack: ", stack.Min())
stack.pop()
stack.top()
print("Return MinStack: ", stack.Min())

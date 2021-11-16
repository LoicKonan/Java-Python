# November 15,2021

class MinStack(): 
    def __init__(self):
        self.data = [] 
        self.min = None

    def push(self, item): 
        self.data.append(item)
        self.minimum()

    def pop(self): 
        if self.isEmpty():
            print("The Stack is currently empty")
        else:
            print("Pop element was successful")
            return self.data.pop()

    def minimum(self): 
        if self.min is None:
            self.min = self.viewtop()
        else:
            if self.viewtop() < self.min:
                self.min = self.viewtop()

    def Min(self): 
        return self.min

    def viewtop(self): 
        try:
            return self.data[-1]
        except IndexError as e:
            print(e)

    def size(self): 
        return len(self.data)

    def isEmpty(self): 
        return self.size() == 0
    
    def top(self):
        return self.data[-1]



stack = MinStack() 
stack.push(-2)
stack.push(0)
stack.push(-3)
print("Return MinStack : ", stack.Min())
stack.pop()
print("Return the Top of MinStack : ", stack.top())
print("Return MinStack : ", stack.Min())


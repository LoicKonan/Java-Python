# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/15/2021 

class MinStack(): 
    
    # Initialized the stack object.
    def __init__(self):
        self.data = [] 
        self.min = None

    # Pushes the element value onto the stack.
    def push(self, item): 
        self.data.append(item)
        self.minimum()

    # Removes the element on the top of the stack.
    def pop(self): 
        t = self.data[-1]
        self.data.pop()
        if self.min == t:
            self.min = self.data[-1]
            self.data.pop()

    # using this to see if the stack is empty or not and
    # assign the right value to the min.
    def minimum(self): 
        if self.min is None:
            self.min = self.viewtop()
        else:
            if self.viewtop() < self.min:
                self.min = self.viewtop()

    # Retrieving the minimum element in the stack.
    def getMin(self): 
        return self.min

    # Retrieves the top element of the stack.
    def viewtop(self): 
        try:
            return self.data[-1]
        except IndexError as e:
            print(e)

    # Return the size of the stock.
    def size(self): 
        return len(self.data)

    # Check if the stack is empty.
    def isEmpty(self): 
        return self.size() == 0
    
    #return the top of the Minstack.
    def top(self):
        return self.data[-1]



stack = MinStack() 
stack.push(-2)
stack.push(0)
stack.push(-3)
print("Return MinStack : ", stack.getMin())
stack.pop()
print("Return the Top of MinStack : ", stack.top())
print("Return MinStack : ", stack.getMin())


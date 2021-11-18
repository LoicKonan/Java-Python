# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/17/2021 


class Queue(): 
    def __init__(self):
        self.data = [] 
        self.min = None

    def enqueue(self, item): 
        self.data.append(item)
        self.minimum()

    def dequeue(self): 
        if self.isEmpty():
            print("Queue currently empty")
        else:
            print("popping element successful")
            return self.data.dequeue()

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


queue = Queue() 

queue.enqueue(1)
queue.enqueue(-50)
queue.enqueue(500)
queue.enqueue(12)

print(" THe min value in our queue is : ", queue.Min())
queue.enqueue(-55)

print("The top of our queue is : ",queue.viewtop())

queue.dequeue()
print (" the top of our queue is now : ",queue.viewtop())
queue.enqueue(-43)
queue.dequeue()
queue.dequeue()
queue.dequeue()

print(" THe min value in our queue is : ", queue.Min())
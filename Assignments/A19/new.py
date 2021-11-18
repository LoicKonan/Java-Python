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
            return  self.data.pop(0)

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
            return self.data[0]
        except IndexError as e:
            print(e)

    def size(self): 
        return len(self.data)

    def isEmpty(self): 
        return self.size() == 0


queue = Queue() 
queue.enqueue(-2)
queue.enqueue(0)
queue.enqueue(-3)

print("Get Min : ", queue.Min())

queue.dequeue()

print("Front : ",queue.viewtop())

print("Get Min : ", queue.Min())
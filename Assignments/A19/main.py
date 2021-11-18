# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/17/2021 


class queue:  
   
  def __init__(self):
    self.q = []
  
  def enqueue(self, data):
    self.q.append(data)

  def dequeue(self):
    self.q.pop(0)

  def rear(self):
    if self.q:
      return self.q[-1]
    
  def front(self):
    if self.q:
      return self.q[0]

q1 = queue()
q1.enqueue(2)
q1.enqueue(3)
q1.enqueue(4)
print(q1.q)
q1.dequeue()
print(q1.q)
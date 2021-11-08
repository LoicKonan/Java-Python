class Dummy:
    # instance variables
    print("Hello world!")
    pi = 3.14
    grade = 0
    name = ""
    
    # Constructor
    def __init__(self, a=0, b=""):   
        self.grade = a 
        self.name = b
    
    #instance method
    def close(self):  
        print("Close!")
    
    #instance methods
    def greeting(self, g):         # every method in the class need self.
        print(g, self.name)
        self.close()
    #pass                          # if you not doing anything in the class.


obj1 = Dummy(23, 'saikat')
obj1 = Dummy()
g = "hello world"

obj1.greeting(g)
obj1.close()

print("Hello world!")
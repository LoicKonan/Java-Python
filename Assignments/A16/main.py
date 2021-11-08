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
    
    # mutator and accessor
    def set_grade(self, newGrade):   
        self.grade = newGrade
        
        
    def get_grade(self):  
        return self.grade
        
    #instance method
    def close(self):  
        print("Close!")
    
    #instance methods
    def greeting(self, g):         # every method in the class need self.
        self.set_grade(0)
        
        print("I decrement your grade to zero")
        print(g, self.name)
        self.close()
    #pass                          # if you not doing anything in the class.


obj1 = Dummy(23, 'saikat')
obj1 = Dummy()
g = "hello world"

obj1.greeting(g)
obj1.close()

oldGrade = obj1.get_grade()
obj1.setGrade(oldGrade + 10)
print("your current grade is: ", obj1.grade)


obj2 = Dummy(100, 'LKA')


print(obj1)
print(obj2)


class Student(Dummy): 
    pass 
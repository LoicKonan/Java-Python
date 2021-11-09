# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/08/2021 

class Person:
      # instance variable
  grade = 0
  name = ""

  #constructor
  def __init__(self, a=0, b=""):
    self.grade = a
    self.name = b

  #mutator and accessor
  def set_grade(self, newGrade):
    self.grade = newGrade
  
  def get_grade(self):
    return self.grade


  # instance method
  def close(self):
    print('I am closing')

  # instance method
  def greeting(self, g):
    # print('Your grade was: ', self.get_grade())
    # self.set_grade(0)
    # print('I assigned your garde to: ', self.grade)
    print(g, self.name)
    #self.close()

class Student(Person):
  gradYear = 0
  def __init__(self, grade, name, graduationYear):
    #super.__init__()
    Person.__init__(self, grade, name)
    self.gradYear = graduationYear



stu1 = Student(100, 'Saikat', 2021)
print(stu1.grade, stu1.name)
# stu1.greeting('Hello')



# obj1 = Person(23, 'Saikat')
# obj2 = Person(100, 'Das')
# oldGrade = obj1.get_grade()
# print('Your grade was: ', oldGrade)
# obj1.set_grade(oldGrade+10)
# print('Your current grade is: ', obj1.grade)
# g = "Hello "
# # print(obj1.name, obj1.grade)
# # print(obj2.name, obj2.grade)
# obj1.greeting(g)
# # obj1.close()

#print('Hello World')

# def greet():
#   pass
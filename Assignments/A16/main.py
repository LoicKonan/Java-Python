# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/08/2021 

class Person:
  grade = 0
  name = ""

  def __init__(self, a = 0, b = ""):
    self.grade = a
    self.name = b

  def set_grade(self, newGrade):
    self.grade = newGrade
  
  def get_grade(self):
    return self.grade


  def close(self):
    print('I am closing')

  def greeting(self, g):
    print(g, self.name)

class Student(Person):
  gradYear = 0
  def __init__(self, grade, name, graduationYear):
    Person.__init__(self, grade, name)
    self.gradYear = graduationYear


stu1 = Student(100, 'Saikat', 2021)
print(stu1.grade, stu1.name)
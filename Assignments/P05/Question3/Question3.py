 #****************************************************************************
 # Author:          Loic Konan 
 # Email:           loickonan.lk@gmail.com 
 # Label:           Question 3 
 # Title:           Programing Assignment 05 
 # Course:          CMPS 4143 
 # Semester:        Fall 2021 
 # Date:            11/22/2021
 # 
 # Description:     
 #                  Write a python code to find the average from a stream. 
 #                  The input of this program will receive a stream of numbers
 #                  and a window size to find the moving average of all the 
 #                  numbers in the sliding window. Write your code in OOP 
 #                  style and solve the program with STACK and or stack 
 #                  data structure.
 #                  
 # 
 # Solution:
 #                   Used
 #
 #
 # Files:           Question3.py
 # 
 #****************************************************************************/

class stack:
    
    # Constructor to initialize the size of our stack
    # 
    def __init__(self, size: int):
        self.numbers = []
        self.size = size
        

    def push(self, val: int) -> float:
        self.numbers.append(val)
        
        if len(self.numbers) > self.size:
            return sum(self.numbers[-(self.size):]) / self.size
                
        return sum(self.numbers) / len(self.numbers) 
        

# Driver code
print('''
 #*******************************************#
 # Author:         Loic Konan                # 
 # Email:          loickonan.lk@gmail.com    # 
 # Label:          Question 3                #
 # Title:          Programing Assignment 05  #
 # Course:         CMPS 4143                 #
 # Semester:       Fall 2021                 #
 # Date:           11/22/2021                #
 #*******************************************#''')

# Your stack object will be instantiated and called as such:
# Initializing our STACK
STACK  = []

# set counter for the iteration
i = 0;

# prompt how many times would like to run test cases
Test = int(input("  How many times would you like to test? : "))
while i < Test:

    # Prompt the user to enter the window size
    # then adding elements to the Empty STACK.
    WindowSize = int(input("\n\n\tEnter the window size: "))

    # Pass the window size to the function stack
    obj = stack(WindowSize)
    result = obj.push(1)
    STACK .append(result)

    result = obj.push(10)
    STACK .append(result)

    result = obj.push(3)

    # Adding the number to the STACK then rounded 
    # the resultult to 2 decimal digits.
    STACK .append(round(result,2))

    result = obj.push(5)
    STACK .append(result)

    # Display on the resultult on the screen in style.
    print("####################################################")
    print("\tWindow size  :  ", WindowSize)
    print("\tStream       :  [1, 10, 3, 5]")
    print("\tOutput       : ",STACK )
    print("####################################################")


    # Removing 4 elements from the STACK
    STACK.pop()
    STACK.pop()
    STACK.pop()
    STACK.pop()
    
    # increment the counter until the end of the testing
    i += 1

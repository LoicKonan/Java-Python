 #****************************************************************************
 # Author:          Loic Konan 
 # Email:           loickonan.lk@gmail.com 
 # Label:           Question 2 
 # Title:           Programing Assignment 05 
 # Course:          CMPS 4143 
 # Semester:        Fall 2021 
 # Date:            11/22/2021
 # 
 # Description:     
 #                  
 #                  
 # 
 # Solution:
 #                  
 #
 #
 # Files:           Question2.py
 # 
 #****************************************************************************/

# Function to find duplicate parenthesis
# in a balanced expression
def findDuplicateparenthesis(string):

	# create a stack of characters
	Stack = []

	# Iterate through the given expression
	for ch in string:
	
		# if current character is
		# close parenthesis ')'
		if ch == ')':
		
			# pop character from the stack
			top = Stack.pop()

			# stores the number of characters between
			# a closing and opening parenthesis
			# if this count is less than or equal to 1
			# then the brackets are redundant else not
			elementsInside = 0
			while top != '(':
			
				elementsInside += 1
				top = Stack.pop()
			
			if elementsInside < 1:
				return True

		# push open parenthesis '(', operators
		# and operands to stack
		else:
			Stack.append(ch)
	
	# No duplicates found
	return False

# Driver Code
if __name__ == "__main__":
  
    # input balanced expression
	string = "((x+y))+z"

	if findDuplicateparenthesis(string) == True:
		print("True")
	else:
		print("False")
  
    # input balanced expression
	string1 = "(x+y)"

	if findDuplicateparenthesis(string1) == True:
		print("True")
	else:
		print("False")


    # input balanced expression
	string2 = "((x+y)+((z)))"

	if findDuplicateparenthesis(string2) == True:
		print("True")
	else:
		print("False")

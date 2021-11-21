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
 #				    Given the expression as string str, find the duplicate 
 # 					parenthesis from the expression. Your program will 
 # 					output whether or not finding the duplicates, 
 # 					that is true of false.
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

# Driver code

print('''
 #*******************************************#
 # Author:         Loic Konan                # 
 # Email:          loickonan.lk@gmail.com    # 
 # Label:          Question 2                #
 # Title:          Programing Assignment 05  #
 # Course:         CMPS 4143                 #
 # Semester:       Fall 2021                 #
 # Date:           11/22/2021                #
 #*******************************************#''')

string = "\t((x+y))+z"
print("\tInput:          ((x+y))+z")
if findDuplicateparenthesis(string) == True:
	print("\tOutput:         True\n")
else:
	print("\tOutput:         False\n")

string = "\t(x+y)"
print("\tInput:          (x+y)")
if findDuplicateparenthesis(string) == True:
	print("\tOutput:         True\n")
else:
	print("\tOutput:         False\n")


string = "\t((x+y)+((z)))"
print("\tInput:          ((x+y)+((z)))")
if findDuplicateparenthesis(string) == True:
	print("\tOutput:          True\n")
else:
	print("\tOutput:          False\n")

while(True):
	try:
		phrase = str(input("\n Enter your equation"))
		equations = phrase.replace(" ", "") 
		print("\tInput:          ", equations)
		if findDuplicateparenthesis(equations) == True:
			print("\tOutput: True\n")
		else:
			print("\tOutput: False\n")
	except:
		raise ValueError('\t\tEnter a valid equation: ')


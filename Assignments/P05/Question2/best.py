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
 #				    Given the stringression as string str, find the duplicate 
 # 					parenthesis from the stringression. Your program will 
 # 					output whether or not finding the duplicates, 
 # 					that is true of false.
 #                  
 # Solution:	
 #				    
 #                  
 #
 #
 # Files:           Question2.py
 # 
 #****************************************************************************/
 
 
# Function to find duplicate parenthesis in an stringression
def isduplicate(string):

	if not string or len(string) <= 3:
		return False

	# take an empty stack of characters
	stack = []

	# traverse the input stringression
	for c in string:
		# if the current char in the stringression is not a closing parenthesis
		if c != ')':
			stack.append(c)
		# if the current char in the stringression is a closing parenthesis
		else:
			# if the stack's top element is an opening parenthesis,
			# the substringression of the form ((string)) is found
			if stack[-1] == '(':
				return True

			# pop till '(' is found for current ')'
			while stack[-1] != '(':
				stack.pop()

			# pop '('
			stack.pop()

	# if we reach here, then the stringression does not have any
	# duplicate parenthesis
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
if isduplicate(string) == True:
	print("\tOutput:         True\n")
else:
	print("\tOutput:         False\n")

string = "\t(x+y)"
print("\tInput:          (x+y)")
if isduplicate(string) == True:
	print("\tOutput:         True\n")
else:
	print("\tOutput:         False\n")


string = "\t((x+y)+((z)))"
print("\tInput:          ((x+y)+((z)))")
if isduplicate(string) == True:
	print("\tOutput:         True\n")
else:
	print("\tOutput:         False\n")

while(True):
	try:
		phrase = str(input("\n\tEquation:       "))
		equations = phrase.replace(" ", "") 
		print("\tInput:         ", equations)
		if isduplicate(equations) == True:
			print("\tOutput:          True\n")
		else:
			print("\tOutput:          False\n")
	except:
		raise ValueError('\t\tEnter a valid equation: ')


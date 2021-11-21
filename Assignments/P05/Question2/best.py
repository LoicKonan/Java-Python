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
 
 
# Function to find duplicate parenthesis
def isduplicate(string):

    # if the input enter is not a string or if the length of the input
    # is less than 3 then return false
	if not string or len(string) <= 3:
		return False

	# Create an empty list that will take a stack of characters
	stack = []

	# Iterate through the given expression
	for character in string:
     
		# if the current character in the string is not a closing parenthesis
        # add add the character to our list.
		if character != ')':
			stack.append(character)
   
		# else if the current character in the string is a closing parenthesis
		else:
			# if the stack's top element is an opening parenthesis,
			# the substring of the form ((string)) is found
			if stack[-1] == '(':
				return True

			# pop till '(' is found for current ')'
			while stack[-1] != '(':
				stack.pop()

			# pop '('
			stack.pop()

	# Returning False simply mean that string doesn't have duplicate parenthesis
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


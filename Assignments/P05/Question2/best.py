def isValid(str1):
  stack = []
  for ch in str1:
    if ch == ')':
      if stack and stack[-1] == '(':
        stack.pop()
      else:
        return False

    elif ch == '}':
      if stack and stack[-1] == '{':
        stack.pop()
      else:
        return False
    elif ch == ']':
      if stack and stack[-1] == '[':
        stack.pop()
      else:
        return False
    else:
      stack.append(ch)

  if len(stack)!=0:
    return False
  else:
    return True


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
if isValid(string) == True:
	print("\tOutput:         True\n")
else:
	print("\tOutput:         False\n")

string = "\t(x+y)"
print("\tInput:          (x+y)")
if isValid(string) == True:
	print("\tOutput:         True\n")
else:
	print("\tOutput:         False\n")


string = "\t((x+y)+((z)))"
print("\tInput:          ((x+y)+((z)))")
if isValid(string) == True:
	print("\tOutput:         True\n")
else:
	print("\tOutput:         False\n")

while(True):
	try:
		phrase = str(input("\n\tEquation:       "))
		equations = phrase.replace(" ", "") 
		print("\tInput:         ", equations)
		if isValid(equations) == True:
			print("\tOutput:          True\n")
		else:
			print("\tOutput:          False\n")
	except:
		raise ValueError('\t\tEnter a valid equation: ')


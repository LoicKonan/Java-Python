# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/15/2021 


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

t4 = ')]}'

t1 = '[{()}]'
t2 = '[{()]'
t3 = '[[{}()]'
print(isValid(t4))
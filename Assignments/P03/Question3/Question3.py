 #****************************************************************************
 # Author:          Loic Konan 
 # Email:           loickonan.lk@gmail.com 
 # Label:           Question 3 
 # Title:           Programing Assignment 03 
 # Course:          CMPS 4143 
 # Semester:        Fall 2021 
 # Date:            10/20/2021
 # 
 # Description:     
 #                  
 # 
 # Solution:
 #
 # Files:           Question3.py
 # 
 #****************************************************************************/

import sys
 
def myAtoi(Str):
 
    sign, base, i = 1, 0, 0
     
    # If whitespaces then ignore.
    while (Str[i] == ' '):
        i += 1
     
    # Sign of number
    if (Str[i] == '-' or Str[i] == '+'):
        sign = 1 - 2 * (Str[i] == '-')
        i += 1
 
    # Checking for valid input
    while (i < len(Str) and
          Str[i] >= '0' and Str[i] <= '9'):
               
        # Handling overflow test case
        if (base > (sys.maxsize // 10) or
           (base == (sys.maxsize // 10) and
           (Str[i] - '0') > 7)):
            if (sign == 1):
                return sys.maxsize
            else:
                return -(sys.maxsize)
         
        base = 10 * base + (ord(Str[i]) - ord('0'))
        i += 1
     
    return base * sign
 
# Driver Code
Str = list("-91283472332")
 
# Functional Code
val = myAtoi(Str)
 
print(val)
 
# This code is contributed by divyeshrabadiya07
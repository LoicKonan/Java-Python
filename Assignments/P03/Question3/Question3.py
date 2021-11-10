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
 #                  Implement the myAtoi(string s) function, which converts 
 #                  a string to a 32-bit signed integer (similar to C/C++'s 
 #                  atoi function).
 #                  
 # 
 # Solution:
 #                  I started by building a function myAtoi(), then,
 #                  Pass in a string s to this function myAtoi().
 #                  Then using some logic to validate the input string.
 #                  Then Display the result to the console.
 #                  Used few build in function such as:
 #
 #                  - len()     =>  to calculate the length.
 #                  - min()     =>  returns the smallest item.
 #                  - max()     =>  returns the item with the highest value.
 #                  - lstrip()  =>  removes leading spaces. 
 #
 #
 # Files:           Question3.py
 # 
 #****************************************************************************/
                                                    
# def myAtoi(s):                                                                # Passing in a string s to the function myAtoi()

#     Input_String = ""                                                         # Using this variable to store our input string.
    
#     pos_Num = True                                                            # Using this boolean variable to test if it a is positive number. 
    
#     if len(s) == 0:                                                           # return 0 if the length of our input string is equal to zero.                                        
#         return 0
  
#     i = 0                                                                     # Initialized our while loop variable to zero.
#     while i < len(s):
        
#         if s[i].isdigit():                                                    # if our input is a digit add it to our input string variable.
#             Input_String += s[i]
        
#         # The 2 elif statements below will only 
#         # be apply for element 0 of the input string,
#         # to check for the sign of our number.
#         elif s[i] == "-":
#             pos_Num = False                                                   # if element 0 is the negative sign then set our boolean pos_Num to false.
        
#         elif s[i] == "+":                                                     # if element 0 is the positive sign then do nothing, just pass.
#             pass
                                                                                
#         else:                                                                 # Break out the loop if we get something weird.
#             break                                                             
       
#         i += 1                                                                # Here we increment the i variable by 1.
    
    
#     if len(Input_String) == 0:                                                # if the length of the resulting string is empty, return 0
#         return 0
    
#     else:
#         if pos_Num:    
#             return min(int(Input_String),2**31-1)                             # return the minimum of int(Input_String) and 2**31-1
        
#         return max(-1*int(Input_String), -2**31)                              # return max of -1*int(Input_String) and -2**31-1
 
 
# try:
#     s = str(input("\nEnter some input: "))                                    # Prompt the user to enter some input.
#     myAtoi(s)                                                                 # Pass the input string to the function myAtoi()

# except:
#     print("Error, invalid data unable to process")                            # Display the error message if the input is invalid.


# print('Input:    "',s,'"',"\t\t",'OutPut:    ',myAtoi(s.lstrip()),'\n')       # Display the final output to the screen.


def myAtoi(str):
        posRange = (2**31)-1
        negRange = 2**31
        negFlag = 0
        val = 0
        
        #1. remove white spaces
        str = str.strip()
        #if no string return 0
        
        if len(str)==0:     # ""
            return 0
        
        #2. check for +/- sign
        if str[0]=='-':     #-422
            negFlag = 1
            str = str[1:]
        elif str[0]=='+':   # +764
            str = str[1:]
        
        if len(str)==0:     #+
            return 0
        
        #3. now, only numeric value is permitted, no space, no non-neumeric ch
        if not str[0].isnumeric():
            return 0    #word with 42
        else:
            for i in range(len(str)):
                if not str[i].isnumeric():
                    break   # 422 with words
                else:
                    if not negFlag:     #checking positive max range
                        if (val > posRange//10) or (val == posRange//10 and int(str[i])> 7):
                            return posRange
                        else:
                            val = val*10 + int(str[i])
                    else:               #checking negative max range but with value only; not sign
                        if (val > negRange//10) or (val == negRange//10 and int(str[i])> 8):
                            return negRange*(-1)
                        else:
                            val = val*10 + int(str[i])
			
        return val*(-1) if negFlag else val		#returning the negative value if negFlag is on, otherwise return the extact value
		
str1= '-42'
print(myAtoi(str1))
# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/25/2021 
# 

# s1 = 'I am good'

# for idx in range(len(s1)):
#     print(s1[idx])
    
    
# for ch in s1:
#     print(ch)

# s2 = 'abc'
# s3 = 'bbc'

# if(s2 == s3):
#     print('Equal')
# elif(s2 > s3):
#     print('s2 Greater than s3')
# elif (s2 < s3):
#     print('s2 Less than s3')
    
# print(dir(s1))                  # print the directory name.

# print(s1.upper())
# print(s2.lower())

# if(s2.islower()):
#     print('s2 is lower case')
    
# print(s1.find('am'))            # return the index

# if 'am' in s1:                  # will look if the word is there.
#     print('I found it')
    
# s1.replace('good', 'bad')       # string is immutable
# s4 = s1
# print(s4)

# l1 = [10,20,30,40,50]           # this is mutable because it is not a string.

# l1[2] = 50 
# print(l1)

# s5 = '10'
# print(s5.isnumeric())           # check if it is numeric

# s6 = '10 with words'
# for ch in s6:
#     print(s6.isnumeric())       # check if it is numeric
    
# print(s6.startswith('10'))      # check if it is numericstart with ?
# print(s6.endswith('words'))     # end with?


# A LIST is a collection of something. 

# friends = ['Loic', 'John', 'Ethan']
# print(len(friends))

L1 = [10, 20, 30, 40, 50]       # REMEMBER A LIST IS HETEROGEONEOUS
print(L1 == 40)

for idx in range(len(L1)):      # 3 ways to access a list
    print(L1(idx))
    
l3 = [10, 20, 30, 'das', 'You']
for val in l3:  
    print(val)                  # print a multiple dimensial list.
    
for idx, val in enumerate(l3): 
    print(val,idx)
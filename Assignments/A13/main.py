# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/25/2021 
# 

s1 = 'I am good'

for idx in range(len(s1)):
    print(s1[idx])
    
    
for ch in s1:
    print(ch)

s2 = 'abc'
s3 = 'bbc'

if(s2 == s3):
    print('Equal')
elif(s2 > s3):
    print('s2 Greater than s3')
elif (s2 < s3):
    print('s2 Less than s3')
    
print(dir(s1))          # print the directory name.

print(s1.upper())
print(s2.lower())

if(s2.islower()):
    print('s2 is lower case')
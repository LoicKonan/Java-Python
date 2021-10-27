# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/27/2021 
# 

# abc = '3410 taft blvd, wichita Falls, tx, 76340'

# abc = abc.split(',')

# zipcode = abc[-1]

# state = abc[-2]

# addcheck = abc[-3:]

# city = abc[0].strip()
# city = abc[1].strip()
# city = abc[2].strip()

# print(addcheck)

# email = 'saikat.das@msutexas.edu'
# addy = email.split('@')

# domain = email[1].split('.')
# print(domain)

d1 = dict()
'''
    'python' : 'snake'
    'c++'    : 'programing language'
'''

d1['python'] = 'snake'
d1['c++'] = 'programing language'


d1['anaconda'] = 'big snake'
d1['c'] = 'basic' 

# can't do enumerate in dictionary.
for i in d1:   
    print(i,d1[i])
    
if  'python' in d1:
    val = d1['python']
    print('found it', val)
else:
    print('not found it')

val = d1.get('anaconda', 0)     # if key not found, it will return 0 or whatever number.
print(val)
'''
    .items()
    .keys()
    .values()
    
'''

# to sort a dictionary use a tuple.     

# lst = ['glenn', 'loic', 'ethan']
# lst[1] = 'saikat'

# for i in lst:
#     print(i)

# print(lst)     

text = 'glenn sally joseph having fun with different people'

words = text.split()
tp_words = tuple(words)

print(type(tp_words))

print(tp_words.count('to'))

print(words)

count = 0
for word in words:  
    if word == 'with':
        count +=1 
    
print('with', count)


d = {'age': 1, 'classroll': 3, 'grade': 100, 'gpa': 4}

for key, val in d.items(): 
    print(key, val)

counts = {}

for word in words:
    counts[word] = counts.get(word, 0) + 1

d = {'abc': 10, 'def': 30, 'qwe': 100, 'wed': 45, 'th': 67}
print(d)
lst = []
for key, val in d.items(): 
    lst.append((val, key))
print(lst)
newlst = sorted(lst, reverse = True)

# fast version of the above line.
print(sorted([(v,k) for k, v in counts.items()]))

grade, student = newlst[0]

for grade, student in newlst[:3]: 
    print(student, ': ', grade)
    

print(newlst)
print(student)


tp = ('saikat', 'asst', 78)

name, aff, age = tp

print(name, aff, age)

print(ord('A'))  # GET THE ASCII VALUES  

print(chr(65))

ls = [00100000010001000000100100]  # a list of 26 elements

word = 'close'
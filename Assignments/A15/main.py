'''
    .items()
    .keys()
    .values()
    
'''

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

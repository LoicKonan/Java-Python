import re

slist = 'here I am frfddd I am frsafse am'

print(slist.startswith('here1'))


for s in slist:    
    # print(re.seach('^here', s))
    print(s, '\n')


l1 = [11,11,11,11,11,11,11,11,11,11,11]
print(set(l1))        
                        # for unique thing use set. key values use dictionary. List => stack and queue.
                        # tuple => strings. for anagram program use the tuples and dictionary. 
                        # a list of 26 characters  long inialized with 0 
                        # if you find it add 1 if there is 2 add 2.
                        #

''' 
    anagram
    
    0 0 2 0 1 0 0 0 0 1 1 0 1 0

    closce
    lcocse

'''

a = set()
a.add(l1)
print(set(a))


# try:  
#     hand = open('sample.txt')   
#     for line in hand:    
#         if re.search('^From:', line): 
#             # print(line)
#     hand.close()
# except:   
#     print('File not found')

with open('sample.txt', 'r') as f:  
    f.write()

import re

slist = 'here I am frfddd I am frsafse am'

print(slist.startswith('here1'))


for s in slist:    
    print(re.seach('^here', s))
    print(s, '\n')

hand = open('sample.txt')   
for line in hand:    
    if re.search('^From:', line): 
        print(line)
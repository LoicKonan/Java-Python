import re

str1 = 'here I am frfddd I am frsafse am'

print(str1.startswith('here1'))

subStr = 'I am'

pos = re.search(subStr, str1)

 #****************************************************************************
 # Author:          Loic Konan 
 # Email:           loickonan.lk@gmail.com 
 # Label:           Question 2 
 # Title:           Programing Assignment 04 
 # Course:          CMPS 4143 
 # Semester:        Fall 2021 
 # Date:            11/10/2021
 # 
 # Description:     
 #                  Given an array of strings strs, group the anagrams together. 
 #                  You can return the answer in any order.
 #  
 #                    - Input type: A list with words 
 #                    - Output type: A list of lists with grouping the anagrams together
 #                  
 # Solution:        
 #                  Used
 #                  
 #
 #
 # Files:           Question2.py
 # 
 #****************************************************************************/
 
 # Any solution that works only for the letters a-z is a bad solution
 # because it is not sufficiently generic at all. 
 # There are many other characters that exist besides a-z
 
def alphabet_map(word):
        alpha_count_dict = dict(zip('abcdefghijklmnopqrstuvwxyz',[0]*26))
        for alpha in word:
            if alpha in alpha_count_dict.keys():
                alpha_count_dict[alpha] += 1
            else:
                alpha_count_dict.update(dict(alpha = 0))
        return tuple(alpha_count_dict.values())

def anagram_counter(words):
    Dictionary = {}
    for word in words:
        key = alphabet_map(word)
        if key not in Dictionary:
            Dictionary[key] = []
        Dictionary[key].append(word)
    return [words for key,words in Dictionary.items()]

words = ['eat','tea','tan','ate','nat','bat']

print('Input: strs = ')
print('Output: ')
print (anagram_counter(words))

# reading the second sample string
StringList = ['']
# go to function definition to determine the output

print('Input: strs = ')
print('Output: ')
print(anagram_counter(StringList))

# reading the thir string 
StringList = ['a']
print('Input: strs = ')
print('Output: ')
print(anagram_counter(StringList))

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
 #                    - Input:  A list with words 
 #                    - Output: list of lists with grouping the anagrams together
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
 
 #
 # In this fucntion, we first pass in our string then we 
 # use a dictionary to list of 26 characters and inialized each one 
 # with a counter of 0, then increment if the same
 # alphabet or character is found, while using some basic
 # for loop and if and else statement.
 # 
def alphabet_map(word):
        alpha_count_dict = dict(zip('abcdefghijklmnopqrstuvwxyz',[0]*26))
        for alpha in word:
            # if the we find this alphabet in the string add one.
            if alpha in alpha_count_dict.keys():
                alpha_count_dict[alpha] += 1
            
            # else we don't find it let equal to zero.
            else:
                alpha_count_dict.update(dict(alpha = 0))
                
        # return our alphabet map as a Tuple.
        return tuple(alpha_count_dict.values())

 #
 # In this fucntion, we pass in our string then
 # check to see the different anagram and group them
 # together in a list of lists.
 # 
def anagram_counter(words):
    Dictionary = {}
    for word in words:
        key = alphabet_map(word)
        
        # if the Dictionary is empty return it []
        if key not in Dictionary:
            Dictionary[key] = []
        
        # else add the word to the list.
        Dictionary[key].append(word)
    
    # Then return a list of lits with grouping the anagrams together.
    return [words for key,words in Dictionary.items()]


 # Now we Display the first sample result to the screen.
words = ['eat','tea','tan','ate','nat','bat']

print("\n#***************************************************************")
print("#    Input: strs = ['eat','tea','tan','ate','nat','bat']")
print('#    Output: ', anagram_counter(words))

# Now we Display the Second sample result to the screen.
words = ['']
print("#\n#    Input: strs = ['']")
print('#    Output: ', anagram_counter(words))

# Now we Display the Third sample result to the screen.
words = ['a']
print("#\n#    Input: strs = ['a']")
print('#    Output: ', anagram_counter(words))
print("\r#***************************************************************")

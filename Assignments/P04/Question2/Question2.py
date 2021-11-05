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
 #                  
 #                  
 # 
 # Solution:
 #                  
 #
 #
 # Files:           Question2.py
 # 
 #****************************************************************************/
 
 
# define the function definition and it processes
# will be calle whenever the function is being mention inside of the main
# portion of our program
def anagrams(Values):
    Dictionary = {}
    #Loop through all items in the list
    for i in Values:
        #Sort the word
        key = ''.join(sorted(i))
        #We must check to make sure the word doesnt exist already
        if key not in Dictionary:
            Dictionary[key] = []
        #add the word to the group
        Dictionary[key].append(i)
    #convert the dictionary values to a list and return them
    return [val for k,val in Dictionary.items()]

def stringToList(string):
    listRes = list(string.split(" "))
    return listRes

#------- main portion of our program-----------------

    # read in the first string
StringList = ['eat','tea','tan','ate','nat','bat']
print(anagrams(StringList))
# reading the second sample string
StringList = ['']
# go to function definition to determine the output
print(anagrams(StringList))

# reading the thir string 
StringList = ['a']
print(anagrams(StringList))
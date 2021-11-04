# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 10/27/2021 


Split_Phrase = []                                   # Creating a empty list.
words  = dict()                                     # Creating a empty dictionary
Phrase = str(input('Enter the Paragraph: '))        # Prompt the user to enter a paragraph or phrase.
Split_Phrase = Phrase.split(' ')                    # Split the string and store it in our empty list
most_frequent = str()                               # This variable will hold our most frequent word.

# Using this for loop to count the frequency of words.
for i in Split_Phrase:                              
    if i in words:
        words[i] += 1                               # if the word already had an occurrence add one every time.
    else:
        words[i] = 1                                # if the word has it first occurrence add one.
        
counter = list(words.values())[0]

# Using this for loop to compare the key values.
for key, value in words.items():
    if value > counter:                             # Comparing how often each words has occured.
        counter = value
        most_frequent = key                         # Assigning the highest occurence to this variable.


print("\nThe original Phrase is : " + str(Phrase))  # Display the original sentence.

print(f'\nFrequent word => "{most_frequent}" Frequency => "{counter}".') # Display the result.




'''
Finding 10 frequent words

'''

text = 'Writing programs is a very creative and rewarding activity You can write programs for many reasons ranging from making your living to solving a difficult data analysis problem to having fun to helping someone else solve a problem This book assumes that everyone needs to know how to program and that once you know how to program you will figure out what you want to do with your newfound skills'

words = text.split()
counts = {}

for word in words:
    counts[word] = counts.get(word, 0) + 1

lst = []
for key, val in counts.items():
     lst.append((val, key))
#print(lst)

nList = sorted(lst, reverse=True)
#Pythonic style
#print(sorted([ (v, k) for k, v in counts.items ()]))

for val, key in nList[:10]:
    print(key, val)
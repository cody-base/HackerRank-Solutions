# Given two strings, s1 and s2, this challenge is to find how many characters in both 
# strings need to be deleted so that they match each other.

def makingAnagrams(s1, s2):
    # Variable to track number of deletions needed
    # Make an array of size 26 to represent each letter
    count = 0
    freq = [0]*26

    # Then increment the element corresponding to the character we're looking at in the string
    # ord gets the ASCII value of the character. 'a' is 97, so a-a is 0, and z-a is 25
    i = 0
    while (i < len(s1)):
        freq[ord(s1[i]) - 97] += 1
        i += 1
        
    # String b must have the same letters as a to be an anagram
    # Decrement the element corresponding to its characters
    # An element of 0 means neither string had it or both had it in equal frequencies
    # An element of 1 means String a had the letter but not b
    # An element of -1 means String b had the letter but not a
    i = 0
    while (i < len(s2)):
        freq[ord(s2[i]) - 97] -= 1
        i += 1

    # Loop through the array and count the absolute value of all elements
    for j in freq:
        count += abs(j)
        
    # Return how many deletions were needed
    return count

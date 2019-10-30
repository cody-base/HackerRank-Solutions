# Given a string of characters named s, containing only the characters A and B, this challenge
# is to manipulate the string via deletion so there are no repeating characters

def alternatingCharacters(s):
    # Variables to count how many matching consecutive characters exist, to iterate loop
    count = 0
    i = 0

    # If the character after the one we're looking at is the same, increase count
    while (i < len(s)-1):
        if (s[i] == s[i+1]):
            count += 1
        i += 1

    # Return how many matching consecutive characters exist
    return count

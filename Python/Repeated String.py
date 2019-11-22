# Given an infinitely repeated string s, this challenge is to find how many
# times the character 'a' is repeated in the first n characters.

def repeatedString(s, n):
    # Variables to count a's, how many times s can be fully repeated until n, 
    # letters left over that couldn't be fully repeated
    count = 0
    sum = 0
    rem = 0

    # If there are no a's, return 0
    if 'a' not in s:
        return 0

    # Find number of a's in the string s
    for c in s:
        if c == 'a':
            count += 1

    # If the string is all a's, return n
    if count == len(s):
        return n

    # Find how many times the string can be fully repeated without going over n characters,
    # how many a's would be in that, and how many letters in the string couldn't be fully repeated
    sum = n // len(s)
    count = sum * count
    rem = (n % len(s))

    # Find how many a's are in the string that couldn't be fully repeated
    for i in range(rem):
        if s[i] == 'a':
            count += 1

    # Return how many a's were found
    return count

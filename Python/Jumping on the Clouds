# Given an array containing only values of 0 and 1, this challenge is to count how many 'jumps'
# it takes to get from the start of the array to the end. A safe cloud value of 0 can be 'landed on' 
# while a storm cloud value of 1 must be 'jumped over'. A jump can only skip one value at the most.

def jumpingOnClouds(c):
    # Variable to track number of jumps
    jumps = 0

    # Loop through the cloud list
    i = 0
    while i < len(c)-1:
        # If 2 ahead is outside the list, jump one ahead and return jumps
        if i+2 > len(c)-1:
            jumps += 1
            return jumps
        
        # If 2 ahead is not a 1 (storm), jump 2 ahead
        if c[i+2] != 1:
            i += 2
            jumps += 1
        # Otherwise, jump one ahead
        else:
            i += 1
            jumps += 1
    # Return jumps made
    return jumps

# Given an array of colored socks, ar, and the length of the array, n, this
# challenge is to find how many pairs of colored socks exist.

def sockMerchant(n, ar):

    # Dictionary for colors and their frequencies, variable to count pairs found
    colors = {}
    pairs = 0

    # Loop through colors array
    # If element is in colors already, increment its frequency. Otherwise add it to colors
    for x in ar:
        if x in colors:
            colors[x] += 1
        else:
            colors[x] = 1

    # Check each colors value for pairs, a pair exists each time one can be evenly divided by 2
    for x in colors:
        pairs += (colors[x] // 2)
    
    # Return how many pairs were found
    return pairs

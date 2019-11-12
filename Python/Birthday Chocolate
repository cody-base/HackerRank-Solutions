# Given a List representing a chocolate bar, s, each square of which has an integer on it,
# a number that consecutive squares need to sum to, d, and how many consecutive squares
# need to be added to reach that sum, m, this challenge is to find how many subsets of size
# m exist in the List that sum to d.

def birthday(s, d, m):
    # Variables for the sum of consecutive chocolate squares
    # and how many piece combos exist that sum to d
    matches = 0
    sum = 0
    i = 0

    # Loop through the chocolate bar List
    while (i < len(s)):
        # Save our spot in the list and sum this
        # element with the next m-1 elements
        j = i

        if (i + (m-1) < len(s)):
            # Reset sum for each chunk of the bar tested 
            # Find the sum for this chunk
            sum = 0
            while (i < j+m):
                sum += s[i]
                i += 1

            # If the sum is equal to d, we have a match
            if (sum == d):
                matches += 1

        # Return to our spot in the List for the next loop
        i = j
        i += 1

    # Return how many matches exist
    return matches

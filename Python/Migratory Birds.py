# Given a list of bird IDs, this challenge is to determine the most common
# bird. If multiple birds are spotted the most, the smallest ID should be chosen.

def migratoryBirds(arr):
    # List to track how many of each bird there is
    # Variables to track how many birds of a type is the most
    # and the most common, for if multiple birds are equally on top
    freq = [0]*5
    most = 0
    common = 0

    # Count how many of each bird is spotted
    for i in arr:
        freq[i-1] += 1
    
    # Iterate backwards through the list, checking if the frequency of
    # the current bird is the highest so far. If it is, mark it as such
    # and also mark it the most common. This way the bird with the smallest
    # id is chosen in the end.
    i = len(freq)-1
    for j in reversed(freq):
        if (j >= most):
            most = j
            common = i+1
        i -= 1

    return common

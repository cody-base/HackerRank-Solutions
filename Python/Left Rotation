# Given an array, a, and a number of rotations to perform, d, this challenge is
# to move the values in the array to the left d times, looping them from start
# to end so that after 2 rotations,
# 0 1 2 3 4 5
# turns into
# 2 3 4 5 0 1

def rotLeft(a, d):
    # Add the first element to the end of the list d times, then return the list
    for x in range(d):
        a.append(a.pop(0))
    return a

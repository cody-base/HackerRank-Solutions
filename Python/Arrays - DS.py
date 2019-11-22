# Given a list named a, this challenge is to print the values of the list in 
# reverse order, with a space inbetween each value. The HR boilerplate also
# requires a list be returned.

def reverseArray(a):
    # Must return a list, initialize to the same size as method argument list
    result = [0]*len(a)
    j = 0

    # Loop through a backwards, setting elements in result
    # equal to a in reverse order
    for i in reversed(a):
        result[j] = i
        j += 1

    # Print each item in result with a space inbetween
    for i in result:
        print(i)

    # Return the result list
    return result

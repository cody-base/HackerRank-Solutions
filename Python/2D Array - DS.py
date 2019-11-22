# Given a 6 x 6 2D array named arr, this challenge is to find the largest hourglass sum in the array.
# An hourglass sum is defined as the sum of array values that form an hourglass shape.
# An hourglass shape is 3 values across the top and bottom with 1 value in the center connecting them:
# 1 2 3
#   4
# 5 6 7

def hourglassSum(arr):
    # List to hold hourglass values
    hourglass = []

    # Variables for iteration
    i = -1
    j = -1
    
    # Nested for loop to access rows first, then columns
    for a in range(len(arr[0])):
        # Iterate i, reset j when it kicks back to i
        i += 1
        j = -1
        for b in range(len(arr)):
            # Iterate j
            j+= 1
            # If hourglass requirements are met, sum the elements constituting the hourglass. 
            # The current element, two elements in a row to the right, the element one row down and 
            # one column to the right, the element 2 rows down, and the two in a row to its right.
            # Then add that sum to the hourglass list.
            if (not j+3 > len(arr) and (not i+3 > len(arr[0]))):
                hourglass.append(arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2])
    # Return the highest hourglass value
    return max(hourglass)

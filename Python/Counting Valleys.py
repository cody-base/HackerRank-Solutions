# Given a string named s, containing only the characters U and D, this challenge is 
# to count how many valleys a hiker enters based on 'U' being an uphill step and 'D'
# being a downhill step, starting from sea level. A valley is defined as having gone
# below sea level.

def countingValleys(n, s):

    # Variables for current height and valleys entered
    height = 0
    valleys = 0

    # Loop over steps string
    for c in s:
        # If going uphill, increment height
        if c == 'U':
            height += 1
        # If going downhill, decrement height
        else:
            height -= 1

        # If we're one below sea level after having gone downhill, we entered a valley        
        if height == -1 and c == 'D':
            valleys += 1
        
    # Return number of valleys entered
    return valleys

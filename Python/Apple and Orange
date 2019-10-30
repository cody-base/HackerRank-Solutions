# Given a start point named s, an endpoint named t, an apple tree at position a,
# an orange tree at position b, an array of where apples fell named apples, 
# and an array of where oranges fell named oranges, this challenge is to print
# how many apples and oranges landed on a house roof, defined as the space between
# the start and end points s and t. The positions of each point and the fallen
# fruit are indicated by integers.

def countApplesAndOranges(s, t, a, b, apples, oranges):
    # Track number of apples and oranges that hit Sam's roof
    app = 0
    ora = 0

    # a is the apple tree, s is the left side of the house, t is the right side
    # Check all apple locations, if one is between s and t inclusive, it hit the roof
    i = 0
    while (i < len(apples)):
        if (a + apples[i] >= s and a + apples[i] <= t):
            app += 1
        i += 1
         
    # b is the orange tree, check how many oranges hit the roof
    i = 0
    while (i < len(oranges)):
        if (b + oranges[i] >= s and b + oranges[i] <= t):
            ora += 1
        i += 1
    
    # Print how many apples and oranges hit Sam's roof
    print(app)
    print(ora)

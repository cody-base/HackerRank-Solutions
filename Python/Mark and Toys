# Given a list of toy prices and a budget k, this challenge is to find out how many
# items can be bought without going over the budget.

def maximumToys(prices, k):
    # Track total price and number of items that can be bought with the given budget
    total = 0
    num = 0
    i = 0
     
    # Sort array in ascending order
    prices.sort()
     
    # Loop through prices array
    while (i < len(prices)):
        #If the current price can be added to the running total without going over the budget
        # Do so and increment how many items can be bought
        if (total + prices[i] <= k):
            total += prices[i]
            num += 1
        
        # Otherwise, we don't need to check any further and can stop looping
        else:
            break
        i += 1
    
    # Return how many items can be bought with the given budget
    return num

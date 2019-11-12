# Given an array of cake candle heights, this challenge is to determine how
# many candles will be blown out when only the tallest ones can be.

def birthdayCakeCandles(ar):
    # Dictionary to track how many candles there are of each height
    # Track the tallest candle
    dict = {}
    tallest = 0

    # Loop through the list, adding each candle height to the dictionary
    # If a candle is taller than the current tallest, it is now the tallest
    for i in ar:
        dict[i] = dict.get(i, 0) + 1

        if (i > tallest):
            tallest = i
    
    # Return how many candles there are of the tallest height
    return dict.get(tallest)

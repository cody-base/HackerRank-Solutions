/*
Given an array of cake candle heights, this challenge is to determine how
many candles will be blown out when only the tallest ones can be.
*/

static int birthdayCakeCandles(int[] ar) 
{
    // Map to track how many candles there are of each height
    // Track the tallest candle
    Map<Integer, Integer> candles = new HashMap<Integer, Integer>();
    int tallest = 0;

    // Loop through the array, adding each candle height to the map
    // If a candle is taller than the current tallest, it is now the tallest
    for (int i : ar) 
    {
        if (candles.containsKey(i)) 
            candles.put(i, candles.get(i)+1);
        else
            candles.put(i, 1);

        if (i > tallest) 
            tallest = i;
    }

    // Return how many candles there are of the tallest height
    return candles.get(tallest);
}

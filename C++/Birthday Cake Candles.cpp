/*
Given an array of cake candle heights, this challenge is to determine how
many candles will be blown out when only the tallest ones can be.
*/

int birthdayCakeCandles(vector<int> ar)
{
    // Map to track how many candles there are of each height
    // Track the tallest candle
    map<int, int> candles; 
    int tallest = 0;

    // Loop through the array, adding each candle height to the map
    // If a candle is taller than the current tallest, it is now the tallest
    for (int i : ar) 
    {
        if (candles.count(i) > 0)
            candles[i] = candles[i] + 1;
        else
            candles.insert({i, 1}); 

        if (i > tallest) 
            tallest = i;
    }
    
    // Return how many candles there are of the tallest height
    return candles[tallest];
}

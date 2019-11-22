/*
Given an array of cake candle heights, this challenge is to determine how
many candles will be blown out when only the tallest ones can be.
*/

func birthdayCakeCandles(ar []int32) int32 {
    // Map to track how many candles there are of each height
    // Track the tallest candle
    mappy := make(map[int32]int32)
    var tallest int32

    // Loop through the array, adding each candle height to the map
    // If a candle is taller than the current tallest, it is now the tallest
    for _, v := range ar {
        mappy[v]++
        if v > tallest {
            tallest = v
        }
    }
    // Return how many candles there are of the tallest height
    return mappy[tallest]
}

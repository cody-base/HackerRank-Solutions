/*
Given an array of cupcake calories Marc has eaten, this challenge is to find out the
minimum number of miles he will have to walk to stay fit according to the formula
of (2^0 * x) + (2^1 * y) + ... where x and y are calories.
*/

func marcsCakewalk(calorie []int32) int64 {
    // Track the answer and exponent for calculation
    var miles int64
    var exp int64

    // Sort the slice in descending order
    sort.Slice(calorie, func(i, j int) bool { return calorie[i] > calorie[j] })

    // Loop through the slice and add to the answer each value times 2 to the tracked exponent
    // Increment the exponent each time
    for _, v := range calorie {
        miles += int64(math.Pow(2, float64(exp))) * int64(v)
        exp++
    }
    // Return how many miles need to be walked
    return miles
}

/*
Given an array, this challenge is to find the smallest and
largest sums between any four values.
*/

func miniMaxSum(arr []int32) {
    // Track the minimum and maximum sums
    // int64 because sums were too big for int32
    var min, max int64

    // Sort in ascending order
    sort.Slice(arr, func(i, j int) bool { return arr[i] < arr[j] })

    // To sum both in a single loop, sum the first 4 numbers for min
    // and the 4 numbers after the first for max as there are always 5
    for i := 0; i < 4; i++ {
        min += int64(arr[i])
        max += int64(arr[i+1])
    }
    
    // Print the minimum and maximum sums
    fmt.Println(min,max)
}

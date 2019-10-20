/*
Given an array, this challenge is to find the minimum absolute difference
between its values.
*/

func minimumAbsoluteDifference(arr []int32) int32 {
    // Sort the array, track the minimum absolute difference, and track each difference
    sort.Slice(arr, func(i, j int) bool { return arr[i] < arr[j] })
    var min int32 = arr[0]-arr[1]
    if min < 0 { min = -min}
    var temp int32

    // Find the absolute difference for each pair
    // If we find a difference smaller than what we already had, it is the new smallest
    for i := 0; i < len(arr)-1; i++ {
        temp = arr[i] - arr[i+1]
        if temp < 0 { temp = -temp }
        if temp < min { min = temp }
    }
    // Return the minimum absolute difference
    return min
}

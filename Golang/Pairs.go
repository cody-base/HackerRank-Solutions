/*
Given an array of integers and a target k, this challenge is to 
find how many pairs of array elements have a difference equal to
the target number.
*/

func pairs(k int32, arr []int32) int32 {
    // Track number of pairs, sort slice in ascending order
    var pairs int32
    sort.Slice(arr, func(i, j int) bool { return arr[i] < arr[j] })

    // Check each value against all values after it
    // If the second value minus the first is more than k, break and move the first up as we won't find a pair
    // If the second value minus the first is equal to k, we have a pair
    for i := 0; i < len(arr)-1; i++ {
        for j := i+1; j < len(arr); j++ {
            if arr[j] - arr[i] > k {
                break
            }
            if arr[j] - arr[i] == k {
                pairs++
            }
        }
    }
    // Return how many pairs were found
    return pairs
}

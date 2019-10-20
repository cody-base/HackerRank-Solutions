/*
Given an array of integers, this challenge is to find how many positive,
negative, and zero numbers are present, and the percentage of each group
within the array.
*/

func plusMinus(arr []int32) {
    // Track how many positive, negative, and zero numbers are in the array
    var positive, p, negative, n, zero, z float32

    // Find how many positive, negative, and zero numbers are in the array
    for _, v := range arr {
        if (v > 0) {
            positive++
        } else if (v < 0) {
            negative++
        } else {
            zero++
        }
    }

    // Find the percentage of each by dividing by the array length, then print
    p =  positive / float32(len(arr))
    n = negative / float32(len(arr))
    z = zero / float32(len(arr))
    fmt.Println(p)
    fmt.Println(n)
    fmt.Println(z)
}

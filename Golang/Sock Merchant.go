/*
Given an array of colored socks, ar, and the length of the array, n, this
challenge is to find how many pairs of colored socks exist.
*/

func sockMerchant(n int32, ar []int32) int32 {
    // Variable to store number of pairs
    // Map to count colors
    var pairs int32
    mappy := make(map[int32] int)

    // Increment a color's frequency each time it's found
    // If after adding to a frequency it is divisible by 2, we have a pair
    for i, _ := range ar {
        mappy[ar[i]]++
        if (mappy[ar[i]] % 2 == 0) {
            pairs++
        }
    }

    // Return how many pairs were found
    return pairs
}

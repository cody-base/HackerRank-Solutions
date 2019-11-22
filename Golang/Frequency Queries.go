/*
Given a 2D array of queries, this challenge is to execute those queries
in order. The queries start with 1, 2, or 3 followed by a single number.
1 x: Insert the number x
2 y: Delete one occurence of y if possible
3 z: Check for an integer of frequency z, print 1 if found and 0 if not
*/

func freqQuery(queries [][]int32) []int32 {
    // Maps to track numbers/frequencies and frequencies/count of numbers with those frequencies
    // Slice to track results of "3 z" queries
    mappy := make(map[int32]int32)
    freq := make(map[int32]int32)
    var result []int32

    // Loop through queries
    for i, _ := range queries {
        // a is 1,2,3 while b is x,y,z
        a := queries[i][0]
        b := queries[i][1]
        
        // If a is 1, add/increment b to the first map
        // Increase the count of how many numbers have that new frequency
        // Decrease the count of how many numbers have the frequency under that
        if (a == 1) {
            mappy[b]++
            freq[mappy[b]]++
            freq[mappy[b]-1]--
        } else if (a == 2) {
            // If a is 2, decrement b from the first map to a minimum of 0
            // Decrease how many numbers have the frequency of what b was
            // Increase how many numbers have the frequency of what be now is
            if v, ok := mappy[b]; ok && v > 0 {
            mappy[b]--
            freq[mappy[b]+1]--
            freq[mappy[b]]++
            }
        } else if (a == 3) {
            // If a is 3, check for a key with frequency b in the frequency map
            // If such a key exists, add a 1 to the result slice, otherwise add 0
            if v, ok := freq[b]; ok && v > 0 {
                result = append(result, 1)
            } else {
                result = append(result, 0)
            }
        }
    }
    // Return the result slice
    return result
}

/*
Given an array length, n, and a 2D array of operations to perform named queries,
this challenge is to manipulate a zero-index array based on those operations and
return the highest value at the end. The operations array looks like this:
a b k
1 5 3
4 8 7
6 9 1

With a new 2D array with row length n, we add the number under k to every value
between indexes a and b. So it would look like this if n is 10:
[0,0,0, 0, 0,0,0,0,0, 0]
[3,3,3, 3, 3,0,0,0,0, 0]
[3,3,3,10,10,7,7,7,0, 0]
[3,3,3,10,10,8,8,8,1, 0]
and the highest number that we return would be 10.
*/

func arrayManipulation(n int32, queries [][]int32) int64 {
    // Slice of size n+1, variables for running sum and highest number
    f := make([]int32, n+1)
    var max, sum int64

    // Loop through array
    for i, _ := range queries {
        a := queries[i][0]-1
        b := queries[i][1]
        c := queries[i][2]
        
        //Add c to the start of each interval a-b
        //Subtract c from the end of each interval a-b
        f[a] += c
        f[b] -= c
    }

    // For test case 0 which is:
    // 1 2 100
    // 2 5 100
    // 3 4 100
    // The above would result in 100 0 100 -100 -100
    // Now loop through and keep a running sum as the "highest" value
    for _, v := range f {
        sum += int64(v)
        if sum > max {
            max = sum;
        }
    }
    
    // Return highest value in array
    return max
}

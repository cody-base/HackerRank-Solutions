/*
Given an array, a, and a number of rotations to perform, d, this challenge is
to move the values in the array to the left d times, looping them from start
to end so that after 2 rotations,
0 1 2 3 4 5
turns into
2 3 4 5 0 1
*/

func rotLeft(a []int32, d int32) []int32 {
    // Variable to hold the first array value
    var temp int32

    // Left rotate d times
    for d > 0 {
        // Set temp equal to the first array value
        temp = a[0]
        
        // Every element is moved one left by overwriting the one before it
        for i := 1; i < len(a); i++ {
            a[i - 1] = a[i]
        }
        
        // At the end of a rotation, the last value is replaced with the original first
        a[len(a) - 1] = temp
        
        // Lower d by one
        d--
    }
    // Return left-rotated array
    return a
}

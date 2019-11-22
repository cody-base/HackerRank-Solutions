/*
Given an array containing only values of 0 and 1, this challenge is to count how many 'jumps'
it takes to get from the start of the array to the end. A safe cloud value of 0 can be 'landed on' 
while a storm cloud value of 1 must be 'jumped over'. A jump can only skip one value at the most.
*/

func jumpingOnClouds(c []int32) int32 {
    // Variable to track number of jumps
    var jumps int32

    // Loop through the cloud array
    for i := 0; i < len(c)-1; i++ {
        // If two clouds ahead is outside the array, jump one forward and return jumps
        if (i+2 > len(c)-1) {
            jumps++
            return jumps
        }
        // If 2 clouds ahead is not a storm, jump two forward by increasing i
        // Otherwise (2 clouds ahead is a storm), jump one forward
        if (c[i + 2] != 1) {
            i++
            jumps++
        } else {
            jumps++
        }
    }
    // Return number of jumps made
    return jumps
}

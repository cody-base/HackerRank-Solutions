/*
Given an array of toy weights, this challenge is to find the smallest
number of containers that can be used to ship them with. Each container
can only hold 4 items, all of which must be within 4 weight units of the
lightest item.
*/

func toys(w []int32) int32 {
    // Sort the slice in ascending order
    sort.Slice(w, func(i, j int) bool { return w[i] < w[j] })

    // Number to track the start of each container
    // Track how many containers needed (minimum 1)
    var cont int32 = w[0]
    var answer int32 = 1

    // Loop through the sorted slice. If a value is 5 or more than what we're tracking,
    // starting with the first value, then we need need another container. Change the 
    // start of the current container to the new value
    for _, v := range w {
        if (v - cont > 4) {
            answer++
            cont = v
        }
    }
    // Return how many containers are needed
    return answer
}

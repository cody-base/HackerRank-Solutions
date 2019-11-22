/*
Given an array, machines, of how many days it takes each machine to produce an item
and a goal number of items to produce, this challenge is to find the minimum number
of days required to meet the goal assuming all machines work simultaneously.
*/

func lowTime(machines []int64, goal int64) int64 {

    // Smallest machine is 1, find largest machine
    var low int64 = 1
    var high int64

    // Check all machines, if the current is more than our highest, set it as our highest
    for _, v := range machines {
        if v > high {
            high = v
        }
    }
    
    // The most amount of days is if only the largest machine matches
    // Lowest is if the smallest machine only needs to match once, so still 1
    high = high * goal

    // Binary search to roughly halve the problem set each iteration
    for (low < high) { 
        // Using binary search so we need a middle value
        mid := (low + high) / 2

        // Find how much can be produced by all machines in mid days
        var avg int64
        for i := range machines {
            avg += mid / machines[i]
        }
  
        // If we produced too few, up the low end to the current middle plus 1
        // This guarantees that next time we produce more than our current high end
        if (avg < goal) {
            low = mid + 1
        } else {
            // If we produced too much, set the high end to the current middle
            // This guarantees that next time we produce at most our current low end
            high = mid
        }
    }
    // Once found, return the minimum number of days it takes to produce our goal
    return high
}

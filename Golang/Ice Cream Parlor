/*
Given an array of ice cream costs and a budget, this challenge is to find 
the two flavors that combined will cost the entire budget.
*/

func whatFlavors(cost []int32, money int32) {
    // Map to store flavor costs
    var costs = make(map[int32]int)

    // Loop through flavor costs
    // Check if the number we need to add with the current one has already been seen
    // This number is stored in the "first" variable
    for i, v := range cost {
        first := money-cost[i]
        // If that number has been seen, print its index plus 1 for 1-indexing
        // Follow that with the 1-index of the current number
        // Break the loop if found, no need to continue at that point
        if _, ok := costs[first]; ok {
            fmt.Println(costs[first]+1, i+1)
            break
        }
        // Add the current number to the map along with its index while the two numbers haven't yet been found
        costs[v] = i
    }
}

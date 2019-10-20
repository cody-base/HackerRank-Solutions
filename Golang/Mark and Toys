/*
Given an array of toy prices and a budget k, this challenge is to find out how many
items can be bought without going over the budget.
*/

func maximumToys(prices []int32, k int32) int32 {
    // Track total price and number of items
    var total, num int32

    // Sort prices in ascending order
    sort.Slice(prices, func(i, j int) bool { return prices[i] < prices[j] })

    // Loop through prices slice
    for i, _ := range prices {
        // If the current price can be added to the running total, do so and increment how many items can be bought
        if (total + prices[i] <= k) {
            total += prices[i]
            num++
        } else {
            break
        }
    }

    // Return how many items can be bought with the given budget
    return num
}

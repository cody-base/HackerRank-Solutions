/*
Given a number of friends k and an array of flower costs c, this challenge is
to find the minimum cost to purchase all the flowers based on a florist's
formula for increasing how much each costs based on how many people bought it.
*/

func getMinimumCost(k int32, c []int32) int32 {
    // Track total price and the number to multiple by (1 + exp)
    // Copy how many people there are to see if everyone has purchased a flower
    var price, exp int32
    j := k

    // Not all test cases are in ascending order, sort so they are
    sort.Slice(c, func(i, j int) bool { return c[i] < c[j] })

    // Starting with the most expensive, have everyone purchase a flower
    // When j is 0, all have purchased one. Reset j and increase exp as per problem description.
    for i := len(c)-1; i >= 0; i-- {
        if (j == 0) {
            j = k
            exp++
        }
        // Calculate the total price by adding this flower purchase, decrement j
        price += (exp + 1) * c[i]
        j--
    }
    // Return the total price
    return price
}

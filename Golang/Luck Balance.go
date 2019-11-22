/*
Given how many important contests Lena has to win, k, and a 2D array
representing her contests, how much luck it costs to win them, and whether
a contest is important, this challenge is to find the maximum amount of luck
Lena can have left depending on which contests she wins or loses.
*/

func luckBalance(k int32, contests [][]int32) int32 {
    // Track total luck, how many contests can be won, important contest luck
    var luck, wins int32
    var important []int32

    // Check the contests
    for i, _ := range contests {
        // Sum the total luck gained by losing all contests
        luck += contests[i][0]
        // If a contest is important, add its luck to the important slice and increment wins
        if contests[i][1] == 1 {
            important = append(important, contests[i][0])
            wins++
        }
    }
    // Sort the luck gained by losing important contests in ascending order
    sort.Slice(important, func(i, j int) bool { return important[i] < important[j] })

    // How many to win is the number of important costests minus max amount of losses
    // Losing more contests gives more luck so we want to lose as many as we can
    wins = wins - k

    // Subtract the luck lost by winning from total luck
    for i := 0; int32(i) < wins; i++ {
        luck -= important[i] * 2
    }
    // Return the most amount of luck Lena can have
    return luck
}

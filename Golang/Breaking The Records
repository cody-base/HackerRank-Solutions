/*
Given an array of scores, this challenge is to determine how many
times the high and low scores were broken.
*/

func breakingRecords(scores []int32) []int32 {
    // Track highest and lowest scores, and how many times each were beaten
    var min, max, minUp, maxUp int32 = scores[0], scores[0], 0, 0

    // Return slice
    var s []int32

    // If a score is higher than the current max, set max to that score and increase highest score breaks
    // If a score is lower than the current min, set min to that score and increase lowest score breaks
    for _, v := range scores {
        if (v > max) {
            maxUp++
            max = v
        }
        if (v < min) {
            minUp++
            min = v
        }
    }

    // Append highest and lowest score breaks to s and print
    s = append(s, maxUp)
    s = append(s, minUp)
    return s
}

/*
Given a square 2D array, this challenge is to determine the absolute
difference between the sums of its diagonals
*/

func diagonalDifference(arr [][]int32) int32 {

    // Track the forward and reverse diagonals
    // Track the reverse diagonal rows
    var forward int32
    var reverse int32
    var rev2 int32 = 0

    // Sum the forward diagonal
    // Straight line left and down so [i][i] works
    for i, _ := range arr {
        forward += arr[i][i]
    }

    // Sum the reverse diagonal
    // Rev2 because we start at the last column (len(arr)-1) but first row (0)
    // Rev2 will increase, going down the rows while i decreases going left for columns
    for i := len(arr)-1; i >= 0; i-- {
        reverse += arr[rev2][i]
        rev2++
    }

    // Return the absolute value of the difference of the diagonals
    return int32(math.Abs(float64(forward-reverse)))
}

/*
Given a string named s, containing only the characters U and D, this challenge is 
to count how many valleys a hiker enters based on 'U' being an uphill step and 'D'
being a downhill step, starting from sea level. A valley is defined as having gone
below sea level.
*/

func countingValleys(n int32, s string) int32 {
    // Variables to store height and number of valleys
    var height int
    var valleys int32

    // Loop through steps string and increment height if going uphill, otherwise decrement
    for _, v := range s {
        if (v == 'U') {
            height++
        } else {
            height--
        }

        // If we're one below sea level after having gone downhill, we entered a valley
        if (height == -1 && v == 'D') {
            valleys++
        }
    }

    // Return number of valleys entered
    return valleys
}

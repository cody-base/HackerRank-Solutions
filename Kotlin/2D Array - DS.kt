/* 
Given a 6 x 6 2D array, this challenge is to find the largest hourglass sum in the array.
An hourglass sum is defined as the sum of array values that form an hourglass shape.
An hourglass shape is 3 values across the top and bottom with 1 value in the center connecting them.
*/

fun hourglassSum(arr: Array<Array<Int>>): Int {
    // ArrayList to track hourglass sums
    var hourglass = ArrayList<Int>()
    
    // Nested for loop to access both rows and columns
    for (i in 0..arr.size) {
        for (j in 0..arr.size) {
            // Check if this row has 2 values after the current one and if a row exists 2 rows down
            if (!(j+3 > arr.size) && !(i+3 > arr.size)) {
                // If hourglass requirements are met, sum this hourglass and add it to the ArrayList
                hourglass.add(arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] +
                              arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2])
            }
        }
    }
    // Return the highest hourglass sum
    return hourglass.max() ?: 0
}

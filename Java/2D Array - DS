/* 
Given a 6 x 6 2D array, this challenge is to find the largest hourglass sum in the array.
An hourglass sum is defined as the sum of array values that form an hourglass shape.
An hourglass shape is 3 values across the top and bottom with 1 value in the center connecting them.
*/

static int hourglassSum(int[][] arr) 
{
    // ArrayList to track hourglass sums
    ArrayList<Integer> hourglass = new ArrayList<Integer>();
        
    // Nested for loop to access both rows and columns
    for (int i = 0; i < arr.length; i++)
    {
        for (int j = 0; j < arr.length; j++)
        {
            // Check if this row has 2 values after the current one and if a row exists 2 rows down
            if (!(j+3 > arr.length) && !(i+3 > arr.length))
            {
                // If hourglass requirements are met, sum this hourglass and add it to the ArrayList.
                hourglass.add(arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] +
                              arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
            }
        }
    }
    // Return the highest hourglass sum
    return Collections.max(hourglass);
}

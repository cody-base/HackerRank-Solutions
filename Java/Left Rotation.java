/*
Given an array, a, and a number of rotations to perform, d, this challenge is
to move the values in the array to the left d times, looping them from start
to end so that after 2 rotations,
0 1 2 3 4 5
turns into
2 3 4 5 0 1
*/

static int[] rotLeft(int[] a, int d) 
{
    // Variable to hold the first array value
    int temp = 0;

    // Left rotate d times
    while (d > 0)
    {
        // Set temp equal to the first array value
        temp = a[0];

        // Every element is moved one left by overwriting the one before it
        for (int i = 1; i < a.length; i++) 
        {
            a[i - 1] = a[i];
        }

        // At the end of a rotation, the last value is replaced with the original first
        a[a.length - 1] = temp;

        // Lower d by one
        d--;
    }

    // Return left-rotated array
    return a;
}

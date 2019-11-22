/*
Given an array length, n, and a 2D array of operations to perform named queries,
this challenge is to manipulate a zero-index array based on those operations and
return the highest value at the end. The operations array looks like this:
a b k
1 5 3
4 8 7
6 9 1

With a new 2D array with row length n, we add the number under k to every value
between indexes a and b. So it would look like this if n is 10:
[0,0,0, 0, 0,0,0,0,0, 0]
[3,3,3, 3, 3,0,0,0,0, 0]
[3,3,3,10,10,7,7,7,0, 0]
[3,3,3,10,10,8,8,8,1, 0]
and the highest number that we return would be 10.
*/

// Faster method gleaned from challenge discussions
// Original, more accurate but slower method at bottom
static long arrayManipulation(int n, int[][] queries) 
{

    // Array of size n+1, variables for running sum and highest number
    long[] f = new long[n+1];
    long max = 0;
    long sum = 0;

    // Loop through array
    for (int i = 0; i < queries.length; i++) 
    {
        int a = queries[i][0]-1;
        int b = queries[i][1];
        int c = queries[i][2];

        // Add c to the start of each interval a-b
        // Subtract c from the end of each interval a-b
        f[a] += c;
        f[b] -= c;
    }

    // For test case 0 which is:
    // 1 2 100
    // 2 5 100
    // 3 4 100
    // The above would result in 100 0 100 -100 -100
    // Now loop through and keep a running sum as the "highest" value
    for (long j : f)
    {
        sum += j;
        if (sum > max)
        {
            max = sum;
        }
    }
    // Return highest value in array
    return max;
}

// First Attempt
// Here we add to every array element in the interval.
// I think this looks nicer, it actually fulfills the stated problem, and 
// is how I tried to start with, but it timed out on 7/16 test cases.
static long arrayManipulation(int n, int[][] queries) 
{
    long[] f = new long[n];
    long max = 0;

    for (int i = 0; i < queries.length; i++)
    {
        int a = queries[i][0]-1;
        int b = queries[i][1]-1;
        int c = queries[i][2];

        for (int k = a; k <= b; k++)
        {
            f[k] += c;
            if (f[k] > max)
                max = f[k];
        }
    }
    return max; 
}

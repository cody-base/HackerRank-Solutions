/*
Given an array of integers and a target k, this challenge is to 
find how many pairs of array elements have a difference equal to
the target number.
*/

static int pairs(int k, int[] arr)
{
    // Track number of pairs, sort slice in ascending order
    int pairs = 0;
    Arrays.sort(arr);

    // Check each value against all values after it
    // If the second value minus the first is more than k, break and move the first up as we won't find a pair
    // If the second value minus the first is equal to k, we have a pair
    for (int i = 0; i < arr.length-1; i++)
    {
        for (int j = i+1; j < arr.length; j++)
        {
            if (arr[j] - arr[i] > k)
                break;
            if (arr[j] - arr[i] == k)
                pairs++;
        }
    }

    // Return how many pairs were found
    return pairs;
}

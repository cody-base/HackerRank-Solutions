/*
Given an array, this challenge is to find the minimum absolute difference
between its values.
*/

static int minimumAbsoluteDifference(int[] arr)
{
    // Sort the array, track the minimum absolute difference, and track each difference
    Arrays.sort(arr);
    int min = arr[0] - arr[1];
    if (min < 0)
        min = -min;

    int temp = 0;

    // Find the absolute difference for each pair
    // If we find a difference smaller than what we already had, it is the new smallest
    for (int i = 0; i < arr.length-1; i++)
    {
        temp = arr[i] - arr[i+1];
        if (temp < 0)
            temp = -temp;
        if (temp < min)
            min = temp;
    }

    // Return the minimum absolute difference
    return min;
}

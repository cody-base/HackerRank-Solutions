/*
Given an unordered array of integers, this challenge is to find the minimum
number of swaps needed to sort the array in ascending order.
*/

static int minimumSwaps(int[] arr) 
{
    // Variables for swapping and counting swaps
    int temp = 0;
    int count = 0;

    // Loop through array for swaps
    for (int i = 0; i < arr.length; i++)
    {
        // If the ith element is already in order, skip it
        // ex: 0th element is 1, 1st element is 2, due to zero indexing
        if (arr[i] == (i+1))
        {
            continue;
        }
        // If the ith element is not in order
        else
        {
            // Loop to find the correct element
            for (int j = i+1; j < arr.length; j++)
            {
                // Once found, assign temp to the right element
                // Then assign the right element to the current element in the outer loop
                if (arr[j] == i+1)
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    break;
                }
            }
            // Assign the current element to temp, completing the swap
            // Increase number of swaps made
            arr[i] = temp;
            count++;
        }
    }
    // Return number of swaps made
    return count;
}

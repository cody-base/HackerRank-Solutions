/*
Given an array named a, this challenge is to implement a bubble sort, afterwards 
printing the first and last elements along with how many swaps it took to order the array.
*/

static void countSwaps(int[] a) 
{
    // Variables to track number of swaps and initiate a swap
    int swaps = 0;
    int temp = 0;

    for (int i = 0; i < a.length; i++) 
    {
        for (int j = 0; j < a.length - 1; j++) 
        {
            // Swap adjacent elements if they are in decreasing order, increment swaps
            if (a[j] > a[j + 1]) 
            {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                swaps++;
            }
        }
    }

    // Display number of swaps along with first and last elements in array
    System.out.println("Array is sorted in " + swaps + " swaps.");
    System.out.println("First Element: " + a[0]);
    System.out.println("Last Element: " + a[a.length-1]);
}

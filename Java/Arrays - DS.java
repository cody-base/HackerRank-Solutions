/*
Given an array named a, this challenge is to print the values of the array in 
reverse order, with a space inbetween each value. The HR boilerplate also
requires an array be returned.
*/

static int[] reverseArray(int[] a) 
{
    // Must return an array, initialize to the same size as method argument array
    int[] result = new int[a.length];

    // Loop through array a backwards starting at its last index,
    // setting elements in result equal to a in reverse order
    for (int i = a.length-1; i >= 0; i--)
    {
        result[(a.length-1)-i] = a[i];
    }

    // Print each element in result with a space between them
    for (int j : result)
    {
        System.out.println(j + " ");
    }

    // Return the array result
    return result;
}

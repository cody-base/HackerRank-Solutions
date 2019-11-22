/*
Given an array of integers, this challenge is to find how many positive,
negative, and zero numbers are present, and the percentage of each group
within the array.
*/

static void plusMinus(int[] arr) 
{
    // Track how many positive, negative, and zero numbers are in the array
    double positive = 0;
    double p = 0;
    double negative = 0;
    double n = 0;
    double zero = 0;
    double z = 0;

    // Find how many positive, negative, and zero numbers are in the array
    for (int i : arr)
    {
        if (i > 0) 
            positive++;
        else if (i < 0)
            negative++;
        else 
            zero++;
    }

    // Find the percentage of each by dividing by the array length, then print
    p = positive / arr.length;
    n = negative / arr.length;
    z = zero / arr.length;

    System.out.println(p);
    System.out.println(n);
    System.out.println(z);
}

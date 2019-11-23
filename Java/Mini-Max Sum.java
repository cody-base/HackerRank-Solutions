/*
Given an array, this challenge is to find the smallest and
largest sums between any four values.
*/

static void miniMaxSum(int[] arr) 
{
  // Track the minimum and maximum sums
  // long because sums were too big for int
  long min = 0;
  long max = 0;

  // Sort in ascending order
  Arrays.sort(arr);

  // To sum both in a single loop, sum the first 4 numbers for min
  // and the 4 numbers after the first for max as there are always 5
  for (int i = 0; i < 4; i++)
  {
      min += (long)(arr[i]);
      max += (long)(arr[i+1]);
  }

  // Print the minimum and maximum sums
  System.out.println(min + " " + max);
}

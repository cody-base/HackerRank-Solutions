/*
Given a number of integers n, this challenge is to create an array a
and fill it with each of the n integers, then print them out.
*/

public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];

    // Insert each integer into the array
    for (int j = 0; j < n; j++)
    {
        a[j] = scan.nextInt();
    }
    scan.close();

    // Prints each sequential element in array a
    for (int i = 0; i < a.length; i++) 
    {
        System.out.println(a[i]);
    }
}

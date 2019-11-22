/*
Given a number, this challenge is to print 'Weird' if it is odd
or even and inclusive between 5 and 20, and 'Not Weird' if it is 
even and inclusive between 2 and 5, or even and over 20.
*/

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    // If N is odd, print Weird
    // If N is even and inclusive between 5 and 20, print Weird
    if (N % 2 != 0 || (N % 2 == 0 && (N > 5 && N < 21)))
    {
        System.out.println("Weird");
    }
    // If N is even and inclusive between 2 and 5, or over 20, print Not Wierd
    else if (N % 2 == 0 && (N > 1 && N < 6) || N > 20)
    {
        System.out.println("Not Weird");
    }

    scanner.close();
}

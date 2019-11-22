/*
Given a set of numbers, this challenge is to determine which datatype
can support each number.
*/

public static void main(String []argh)
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for(int i = 0; i < t; i++)
    {
        try
        {
            long x=sc.nextLong();
            System.out.println(x + " can be fitted in:");

            // A byte is 8-bit, so negative 2^7 to 2^7 - 1
            // A short is 16-bit, so negative 2^15 to 2^15 - 1
            // An int is 32-bit, so negative 2^31 to 2^31 - 1
            // A long is 64-bit, so negative 2^63 to 2^63 - 1
            if (x >= -Math.pow(2, 7) && x <= Math.pow(2, 7) - 1)
                System.out.println("* byte");
            if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                System.out.println("* short");
            if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                System.out.println("* int");
            if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                System.out.println("* long");
        }
        catch(Exception e)
        {
            System.out.println(sc.next() + " can't be fitted anywhere.");
        }
    }
}

/*
Given an infinitely repeated string s, this challenge is to find how many
times the character 'a' is repeated in the first n characters.
*/

static long repeatedString(String s, long n) 
{
    // Variables to count a's, how many times s can be fully repeated until n, 
    // and letters left over that couldn't be fully repeated
    long count = 0, sum = 0, rem = 0;

    // If the string has no a's, return zero
    if (!s.contains("a")) 
        return 0;

    // Find number of a's in string
    for (int i = 0; i < s.length(); i++)
    {
        if (s.charAt(i) == 'a') 
            count++;
    }
    // If the string is nothing but a's, return n as
    // all characters up to n will be a's
    if (count == s.length())
        return n;

    // Check how many times the string can be repeated without
    // going over n characters, and how many a's that makes
    sum = n / s.length();
    count = sum * count;

    // Check how many letters in the string are leftover that can
    // be added until the "infinite" string reaches n characters
    rem = n % s.length();

    // Check how many a's are in the leftover characters
    for (int i = 0; i < rem; i++) 
    {
        if (s.charAt(i) == 'a') 
            count++;
    }
    // Return how many a's were found
    return count;
}

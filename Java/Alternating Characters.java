/*
Given a string of characters named s, containing only the characters A and B, this challenge
is to manipulate the string via deletion so there are no repeating characters. Actually
deleting characters timed out the challenge, so I'm just counting how many are needed.
*/

static int alternatingCharacters(String s) 
{
    // Variable to count how many matching consecutive characters exist
    int count = 0;

    // If the character after the one we're looking at is the same, increase count
    for (int i = 0; i < s.length()-1; i++)
    {
      if (s.charAt(i) == s.charAt(i+1))
          count++;
    }
    // Return how many matching consecutive characters exist
    return count;
}

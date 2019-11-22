/*
Given a string s, this challenge is to find how many substrings of the string
are anagrams of each other.
*/

static int sherlockAndAnagrams(String s) 
{
    // Map to hold all possible substrings, string to hold each substring
    // Char array so we can sort each substring to easier compare, and a count for matches 
    Map<String, Integer> mappy = new HashMap<String, Integer>();
    String sub = "";
    char[] subA;
    int count = 0;

    // Get every substring from the string
    for (int i = 0; i < s.length(); i++)
    {
        for (int j = i+1; j <= s.length(); j++)
        {
            // Get every substring from 1 character to s.length() characters long
            // Sort each substring by converting it into an array
            // Convert back to string for use in map checking
            sub = s.substring(i, j);
            subA = sub.toCharArray();
            Arrays.sort(subA);
            sub = String.valueOf(subA);

            // If the substring has already been found
            // Since anagram pairs scale weird (aa is 1, aaa is 4), we increment weird 
            // Increment substring's value
            if (mappy.containsKey(sub))
            {
                count += mappy.get(sub);
                mappy.put(sub, mappy.get(sub)+1);
            }
            // If this substring hasn't been found yet, add it to the map
            else
            {
                mappy.put(sub, 1);
            }
        }
    }
    // Return how many substring anagrams were found
    return count;
}

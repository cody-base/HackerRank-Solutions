/*
Given two strings, s1 and s2, this challenge is to determine if they
share a common substring as small as a single character.
*/

static String twoStrings(String s1, String s2) 
{
    // Map to track characters
    Map<Character, Integer> mappy = new HashMap<Character, Integer>();

    // Put each character in the first string s1 into the map
    // We don't care about frequencies so skip if character already there
    for (char c : s1.toCharArray())  
    {
        if (!mappy.containsKey(c))
            mappy.put(c, 1);
    }

    // If the map contains any character from string s2, s1 and s2 share a substring
    for (char d : s2.toCharArray())
    {
        if (mappy.containsKey(d))
            return "YES";
    }
    // If the map has no characters from s2, the strings share no characters
    return "NO";
}

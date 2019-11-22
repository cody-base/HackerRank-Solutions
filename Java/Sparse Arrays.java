/*
Given arrays of string and queries, this challenge is to count how
many times each query is found in the string array.
*/

static int[] matchingStrings(String[] strings, String[] queries) 
{
    // Array to store how many times a query string is matched
    int[] hits = new int[queries.length];

    // Nested for to check each word in queries against each word in strings before moving on. 
    // If a match is found, the element in hits corresponding to the word found is increased.
    for (String a : strings)
    {
        for (int i = 0; i < queries.length; i++)
        {
            if (a.equals(queries[i]))
            {
                hits[i]++;
            }
        }
    }
    // Return array of how many times each query was found in strings
    return hits;
}

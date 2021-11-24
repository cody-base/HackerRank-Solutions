/*
Given two strings, s1 and s2, this challenge is to determine if they
share a common substring as small as a single character.
*/

fun twoStrings(s1: String, s2: String): String {
    // Map to track characters
    var stringMap = HashMap<Char, Int>()

    // Put each character in the first string s1 into the map
    // We don't care about frequencies so skip if character already there
    for (c in s1.toCharArray()) {
        if (!stringMap.containsKey(c))
            stringMap.put(c, 1)
    }

    // If the map contains any character from string s2, s1 and s2 share a substring
    for (d in s2.toCharArray()) {
        if (stringMap.containsKey(d))
            return "YES"
    }
    // If the map has no characters from s2, the strings share no characters
    return "NO"
}

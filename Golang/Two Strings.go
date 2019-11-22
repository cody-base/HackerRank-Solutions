/*
Given two strings, s1 and s2, this challenge is to determine if they
share a common substring as small as a single character.
*/

func twoStrings(s1 string, s2 string) string {
    // Map to track characters
    mappy := make(map[rune]int32)

    // Put each character in the first string s1 into the map
    // We don't care about frequencies so skip if character already there
    for _, v := range s1 {
        if _, ok := mappy[v]; !(ok) {
            mappy[v] = 1
        } 
    }

    // If the map contains any character from string s2, s1 and s2 share a substring
    for _, v := range s2 {
        if _, ok := mappy[v]; ok {
            return "YES"
        }
    }
 
    // If the map has no characters from s2, the strings share no characters
    return "NO"
}

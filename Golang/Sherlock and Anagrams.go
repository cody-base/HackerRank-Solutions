/*
Given a string s, this challenge is to find how many substrings of the string
are anagrams of each other.
*/

func sherlockAndAnagrams(s string) int32 {
    // Map to hold all possible substrings, string to hold each substring,
    // string slice so we can sort each substring, and a count for matches
    mappy := make(map[string]int32)
    var sub string
    var subA []string
    var count int32

    // Get every substring from the string
    for i := 0; i < len(s); i++ {
        for j := i+1; j <= len(s); j++ {
            // Make slice of given string, grab substring from it
            // Sort each substring and convert back to string for map checking
            var sSlice []string = strings.Split(s, "")
            subA = sSlice[i:j]
            sort.Strings(subA)
            sub = strings.Join(subA, "")
            
            // If the substring has already been found
            // Since anagram pairs scale weird (aa is 1, aaa is 4), we increment weird 
            // Increment substring's value
            if _, ok := mappy[sub]; ok {
                count += mappy[sub]
                mappy[sub]++
            } else {
                // Otherwise, add the substring to the map
                mappy[sub] = 1
            }
        }
    }
    // Return how many substring anagrams were found
    return count
}

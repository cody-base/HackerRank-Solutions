/*
Given arrays of the whole words in a magazine and a ransom note, this challenge
is to see if it is possible for the ransom note to be constructed using words
cut out of the magazine.
*/

func checkMagazine(magazine []string, note []string) {
    // Map to track words and their frequencies
    words:= make(map[string]int32)

    // Add all words from magazine, increasing frequency if found more than once
    for _, v := range magazine {
        if _, ok := words[v]; ok {
            words[v]++
        } else {
            words[v] = 1
        }
    }

    // Add all words from note, with -1 as initial frequency
    // Subtract 1 from frequency for all words already in words
    for _, v := range note {
        if _, ok := words[v]; ok {
            words[v]--
        } else {
            words[v] = -1
        }
    }

    // If the value of a word is less than 0, magazine doesn't have enough of it
    for _, v := range words {
        if v < 0 {
            fmt.Println("No")
            return
        }
    }

    // If all values are zero or greater, a ransom note can be formed
    fmt.Println("Yes")
}

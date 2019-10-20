/*
Given a string of characters named s, containing only the characters A and B, this challenge
is to manipulate the string via deletion so there are no repeating characters
*/

func alternatingCharacters(s string) int32 {
    // Variable to count how many matching consecutive characters exist
    var count int32

    // If the character after the one we're looking at the is the same, increase count
    runes := []rune(s)
    for i := 0; i < len(runes)-1; i++ {
        if runes[i] == runes[i+1] {
            count++
        }
    }

    // Return how many matching consecutive characters exist
    return count;
}

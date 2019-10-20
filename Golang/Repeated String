/*
Given an infinitely repeated string s, this challenge is to find how many
times the character 'a' is repeated in the first n characters.
*/

func repeatedString(s string, n int64) int64 {
    // Variables to count a's, how many times s can be fully repeated until n, 
    // letters left over that couldn't be fully repeated, and an int64 of string length
    var count, sum, rem int64
    var length int64 = int64(len(s))

    // If the string has no a's, return zero
    if !strings.Contains(s, "a") {
        return 0
    }

    // Find number of a's in string
    for _, v := range s {
        if v == 'a' {
            count++
        }
    } 
        
    // If the string is nothing but a's, return n as
    // all characters up to n will be a's
    if count == length {
        return n
    }

    // Check how many times the string can be repeated without
    // going over n characters, and how many a's that makes
    sum = n / length
    count = sum * count

    // Check how many letters in the string are leftover that can
    // be added until the "infinite" string reaches n characters
    rem = n % length;

    // Check how many a's are in the leftover characters
    // Use rune array since looping based on the int64 rem, instead of a range over the string s
    runes := []rune(s)
    var i int64
    for i = 0; i < rem; i++ {
        if runes[i] == 'a' {
            count++
        }
    }

    // Return how many a's were found
    return count
}

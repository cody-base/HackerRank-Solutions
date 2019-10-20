/*
Given two strings, a and b, this challenge is to find how many characters in both 
strings need to be deleted so that they match each other.
*/

func makeAnagram(a string, b string) int32 {
    // Variable to track number of deletions needed
    // We make an array of size 26 to represent each letter.
    var count int32
    var freq [26]int32

    // Then increment the element corresponding to the character we're looking at in the string
    // 'a' is 97, so a-a is 0, while z-a is 25
    for i, _ := range a {
        freq[a[i] - 'a']++
    }

    // String b must have the same letters as a to be an anagram
    // Decrement the element corresponding to its characters
    // An element of 0 means neither string had it or both had it in equal frequencies
    // An element of 1 means a had the letter but not b
    // An element of -1 means b had the letter but not a
    for i, _ := range b {
        freq[b[i] - 'a']--
    }

    // Loop through the array and count the absolute value of all elements
    for _, i := range freq {
        count += Abs(i)
    }

    // Return how many deletions were needed
    return count
}

// Custom Abs method so as to not abuse the built-in float one
func Abs(x int32) int32 {
    if x < 0 {
        return -x
    }
    return x
}

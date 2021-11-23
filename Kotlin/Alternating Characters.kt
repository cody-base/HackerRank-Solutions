/*
Given a string of characters named s, containing only the characters A and B, this challenge
is to manipulate the string via deletion so there are no repeating characters. Actually
deleting characters timed out the challenge, so I'm just counting how many are needed.
*/

fun alternatingCharacters(s: String): Int {
    // Make a new StringBuilder and track how many characters are deleted
    var sb = StringBuilder(s)
    var count = 0
    var i = 0
    
    // Delete this character if the next is the same
    // Only move forward through the string if the next character is different
    while (i < sb.length-1) {
        if (sb.get(i) == sb.get(i+1)) {
            sb.deleteCharAt(i)
            count++
        } else {
            i++
        }
    }

    // Return how many matching consecutive characters exist
    return count
}

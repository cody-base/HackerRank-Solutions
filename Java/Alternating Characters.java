/*
Given a string of characters named s, containing only the characters A and B, this challenge
is to manipulate the string via deletion so there are no repeating characters.
*/

    public static int alternatingCharacters(String s) {
        // Make a new StringBuilder and track how many characters are deleted
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        int i = 0;

        // Delete this character if the next is the same
        // Only move forward through the string if the next character is different
        while (i < sb.length()-1) {
            if (sb.charAt(i) == sb.charAt(i+1)) {
                sb.deleteCharAt(i);
                count++;
            } else {
                i++;
            }
        }
        
        // Return how many matching consecutive characters exist
        return count;
    }

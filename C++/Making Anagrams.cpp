/*
Given two strings, s1 and s2, this challenge is to find how many characters in both 
strings need to be deleted so that they match each other.
*/

int makingAnagrams(string s1, string s2) 
{
    // Variable to track number of deletions needed
    // Make an array of size 26 to represent each letter
    int count = 0;
    int freq [26] = {0}; 

    // Then increment the element corresponding to the character we're looking at in the string
    // 'a' is 97, so a-a is 0, while z-a is 25
    for (int i = 0; i < s1.length(); i++)
    {
        freq[s1.at(i) - 'a']++;
    }

    // String s2 must have the same letters as s1 to be an anagram
    // Decrement the element corresponding to its characters
    // An element of 0 means neither string had it or both had it in equal frequencies
    // An element of 1 means String s1 had the letter but not s2
    // An element of -1 means String s2 had the letter but not s1
    for (int i = 0; i < s2.length(); i++) 
    {
        freq[s2.at(i) - 'a']--;
    }

    // Loop through the array and count the absolute value of all elements
    for (int value : freq)
    {
        count += abs(value);
    }
    
    // Return how many deletions were needed
    return count;
}

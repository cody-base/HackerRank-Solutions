/*
Given a string of characters named s, containing only the characters A and B, this challenge
is to manipulate the string via deletion so there are no repeating characters
*/

int alternatingCharacters(string s) 
{
    // Variable to count how many matching consecutive characters exist
    int count = 0;

    for (int i = 0; i < s.size()-1; i++)
    {
        // If the current character and the next are the same, delete this character
        // and increase count. Stop comparing if it would go outside the string range
        while (s.at(i) == s.at(i+1))
        {
            s.erase(s.begin()+i);
            count++;

            if (i+1 > s.size()-1)
                break;
        }
    }
    return count;
}

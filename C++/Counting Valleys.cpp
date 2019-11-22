/*
Given a string containing only the characters U and D, this challenge is 
to count how many valleys a hiker enters based on 'U' being an uphill step and 'D'
being a downhill step, starting from sea level. A valley is defined as having gone
below sea level.
*/

int countingValleys(int n, string s) 
{
    // Variables to store height, number of valleys, and character array
    int height = 0;
    int valleys = 0;
    char char_array[n + 1]; 
  
    // Turn string into a character array
    strcpy(char_array, s.c_str()); 
    
    // Loop through steps string and increment height if going uphill, otherwise decrement
    for (char c : char_array)
    {
        if (c == 'U')
            height++;
        else
            height--;
            
        // If we're one below sea level after having gone downhill, we entered a valley
        if (height == -1 && c == 'D')
            valleys++;
    }
    // Return number of valleys entered
    return valleys;
}

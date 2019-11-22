/*
Given a string named s, containing only the characters U and D, this challenge is 
to count how many valleys a hiker enters based on 'U' being an uphill step and 'D'
being a downhill step, starting from sea level. A valley is defined as having gone
below sea level.
*/
    
static int countingValleys(int n, String s) 
{
    // Variables to store height and number of valleys
    int height = 0;
    int valleys = 0;

    // Loop through steps string and increment height if going uphill, otherwise decrement
    for (char c : s.toCharArray())
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

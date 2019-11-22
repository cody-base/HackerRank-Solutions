/*
Given a vector containing only values of 0 and 1, this challenge is to count how many 'jumps'
it takes to get from the start of the vector to the end. A safe cloud value of 0 can be 'landed on' 
while a storm cloud value of 1 must be 'jumped over'. A jump can only skip one value at the most.
*/

int jumpingOnClouds(vector<int> c) 
{
    // Variable to track number of jumps
    int jumps = 0;

    // Loop through the cloud vector
    for (int i = 0; i < c.size() - 1; i++) 
    {
        // If two clouds ahead is outside the vector, jump one forward and return jumps
        if (i+2 > c.size()-1)
        {
            jumps++;
            return jumps;
        }
        
        // If 2 clouds ahead is not a storm, jump two forward by increasing i
        if (c[i + 2] != 1)
        {
            i++;
            jumps++;
        }
        
        // Otherwise, jump one forward
        else 
        {
            jumps++;
        }
    }
    // Return number of jumps made
    return jumps;
}

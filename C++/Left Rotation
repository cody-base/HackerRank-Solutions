/*
Given a vector, a, and a number of rotations to perform, d, this challenge is
to move the values in the vector to the left d times, looping them from start
to end so that after 2 rotations,
0 1 2 3 4 5
turns into
2 3 4 5 0 1
*/

vector<int> rotLeft(vector<int> a, int d) 
{
    // Variable to hold the first vector value
    int temp = 0;

    // Left rotate d times
    while (d > 0)
    {
        // Set temp equal to the first vector value
        temp = a[0];
        
        // Every element is moved one left by overwriting the one before it
        for (int i = 1; i < a.size(); i++) 
        {
            a[i - 1] = a[i];
        }
        
        // At the end of a rotation, the last value is replaced with the original first
        a[a.size() - 1] = temp;
        
        // Lower d by one
        d--;
    }
    
    // Return left-rotated vector
    return a;
}

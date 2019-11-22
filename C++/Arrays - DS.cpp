/*
Given a vector named a, this challenge is to print the values of
the vector in reverse order, with a space inbetween each value.
*/

vector<int> reverseArray(vector<int> a) 
{
    // Must return a vector
    vector<int> result;
 
    // Loop through vector a backwards starting at its last index,
    // adding elements to result equal to a in reverse order
    for (int i = a.size()-1; i >= 0; i--)
    {
        result.push_back(a[i]);
    }
    
    // Print each element in result with a space between them
    for (int j : result)
    {
        cout << j << " ";
    }
    
    // Return the array result
    return result;
}

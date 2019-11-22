/*
Given an array of toy weights, this challenge is to find the smallest
number of containers that can be used to ship them with. Each container
can only hold 4 items, all of which must be within 4 weight units of the
lightest item.
*/

static int toys(int[] w) 
{
    // Sort the array in ascending order
    Arrays.sort(w);

    // Number to track the start of each container
    // Track how many containers needed (minimum 1)
    int cont = w[0];
    int answer = 1;

    // Loop through the array. If a value is 5 or more than what we're tracking,
    // starting with the first value, we need need another container. Change the 
    // start of the current container to the new value.
    for (int i : w) 
    {
        if (i - cont > 4) 
        {
            answer++;
            cont = i;
        }
    }
    // Return how many containers are needed
    return answer;
}

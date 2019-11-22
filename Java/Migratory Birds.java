/*
Given an array of bird IDs, this challenge is to determine the most common
bird. If multiple birds are spotted the most, the smallest ID should be chosen.
*/

static int migratoryBirds(List<Integer> arr) 
{
    // Array to track how many of each bird there is
    // Variables to track how many birds of a type is the most
    // and the most common, for if multiple birds are equally on top
    int freq[] = new int[5];
    int most = 0, common = 0;

    // Count how many of each bird is spotted
    for (int i : arr)
    {
        freq[i-1]++;
    }

    // Iterate backwards through the array, checking if the frequency of
    // the current bird is the highest so far. If it is, mark it as such
    // and also mark it the most common. This way the bird with the smallest
    // id is chosen in the end.
    for (int i = freq.length-1; i >= 0; i--)
    {
        if (freq[i] >= most)
        {
            most = freq[i];
            common = i+1;
        }
    }
    return common;
}

/*
Given n people, this challenge is to find out how many handshakes happen
when each 2 people can only shake hands once.
*/

func handshake(n int32) int32 {
    //1 person, no shakes
    //2 people, shakes between 12
    //3 people, shakes between 12, 13, and 23
    //4 people, between 12, 13, 14, 23, 24, and 34
    // The pattern is the sum of all numbers to n-1
    // A formula for which is:
    return ((n*(n+1))/2)-n
}

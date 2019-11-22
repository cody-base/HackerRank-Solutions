/*
Given a start point named s, an endpoint named t, an apple tree at position a,
an orange tree at position b, an array of where apples fell named apples, 
and an array of where oranges fell named oranges, this challenge is to print
how many apples and oranges landed on a house roof, defined as the space between
the start and end points s and t. The positions of each point and the fallen
fruit are indicated by integers.
*/

func countApplesAndOranges(s int32, t int32, a int32, b int32, apples []int32, oranges []int32) {
    // Track number of apples and oranges that hit Sam's roof
    var app, ora int32
    
    // a is the apple tree, s is left side of the house, t is right side
    // Check all apple locations, if one is between s and t inclusive, it hit the roof
    for _, v := range apples {
        if (a + v) >= s && (a + v) <= t {
            app++
        }
    }

    // b is the orange tree, check how many oranges hit the roof
    for _, v := range oranges {
        if (b + v) >= s && (b + v) <= t {
            ora++
        }
    }
    // Print how many apples and oranges hit Sam's roof
    fmt.Println(app)
    fmt.Println(ora)
}

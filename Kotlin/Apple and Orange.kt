/*
Given a start point named s, an endpoint named t, an apple tree at position a,
an orange tree at position b, an array of where apples fell named apples, 
and an array of where oranges fell named oranges, this challenge is to print
how many apples and oranges landed on a house roof, defined as the space between
the start and end points s and t. The positions of each point and the fallen
fruit are indicated by integers.
*/

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    // Track number of apples and oranges that hit Sam's roof
    var app = 0
    var ora = 0

    // a is the apple tree, s is the left side of the house, t is the right side
    // Check all apple locations. If one is between s and t inclusive, it hit the roof
    for (i in 0..apples.size-1) {
        if (a + apples[i] >= s && a + apples[i] <= t) {
            app++
        }
    }

    // b is the orange tree. Check how many oranges hit the roof
    for (i in 0..oranges.size-1) {
        if (b + oranges[i] >= s && b + oranges[i] <= t) {
            ora++
        }
    }

    // Print how many apples and oranges hit Sam's roof
    println(app)
    println(ora)
}

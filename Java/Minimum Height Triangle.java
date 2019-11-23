/*
Given the base and area of a triangle, this challenge
is to find the height of the triangle.
*/

static int lowestTriangle(int base, int area)
{
    // The height of a triangle is (2a)/b, rounded up
    // Doubles used for correct division
    double height = Math.ceil((2*area) / (double)base);

    // Print the height
    return (int)height;
}

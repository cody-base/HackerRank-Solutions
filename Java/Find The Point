/*
Given two points p and q, each of which have x and y integers, this challenge
is to find the point reflection of point p across point q, and return it as 
the x and y coordinates of the reflection point r.
*/

static int[] findPoint(int px, int py, int qx, int qy) 
{
    // Array to return
    int[] arr = new int[2];

    // Formula to find the midpoint is qx = (px + rx) / 2
    // So formula for endpoint would be rx = 2qx - px
    int rx = (2 * qx) - px;
    int ry = (2 * qy) - py;

    // Add the x and y coordinates of the end point and return
    arr[0] = rx;
    arr[1] = ry;
    return arr;
}

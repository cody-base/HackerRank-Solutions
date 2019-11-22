/*
Given two points p and q, each of which have x and y integers, this challenge
is to find the point reflection of point p across point q, and return it as 
the x and y coordinates of the reflection point r.
*/

func findPoint(px int32, py int32, qx int32, qy int32) []int32 {
    // Slice to return
    var s []int32

    // Formula to find the midpoint is qx = (px + rx) / 2
    // So formula for endpoint would be rx = 2qx - px
    rx := (2 * qx) - px
    ry := (2 * qy) - py

    // Add the x and y coordinates of the end point and return
    s = append(s, rx)
    s = append(s, ry)
    return s
}

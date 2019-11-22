/*
Given an array of grades, this challenge is to round up grades if they are
within 2 points of the multiple of 5 above them and over 40.
*/

func gradingStudents(grades []int32) []int32 {
    // Track adjusted grades
    var s []int32

    // If a grade is within 2 points of the multiple of 5 above it and will be 40 or higher, round up
    // Modulo checks the multiple before (67 checks 65) so we want to be more than 2 away
    for _, v := range grades {
        if ((v % 5) > 2 && v > 37) {
            v = (v + 5) - (v % 5)
            s = append(s, v)
        } else {
            // Add the grade as-is if it's not eligible to be rounded up
            s = append(s, v)
        }
    }
    // Return the adjusted grades
    return s
}

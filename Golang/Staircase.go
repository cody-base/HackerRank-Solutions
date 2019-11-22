/*
Given a staircase base and height n, this challenge is to create
a staircase with pound signs.
*/

func staircase(n int32) {
    // Print leading spaces starting with n-1 and ending with 0
    // Followed by pound signs until a line is n characters long
    for i := 1 ; i <= int(n); i++ {
        fmt.Println(strings.Repeat(" ", int(n)-i) + strings.Repeat("#", i))
    }
}

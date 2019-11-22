/*
Given an AM/PM time string, this challenge is to
convert it to a 24-hour military time string.
*/

func timeConversion(s string) string {
    // Grab the AM/PM and hour
    apm := s[len(s)-2:]
    i, _ := strconv.Atoi(s[:2])

    // Special cases
    // If 12am, change to 00, but if pm and not 12, add 12
    if (apm == "AM" && i == 12) {
        i = 0
    } else if (apm == "PM" && i != 12) {
        i += 12
    }

    //Return 24-hour formatted time
    return fmt.Sprintf("%02d", i) + s[2:len(s)-2]
}

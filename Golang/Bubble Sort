/*
Given an array named a, this challenge is to implement a bubble sort, afterwards 
printing the first and last elements along with how many swaps it took to order the array.
*/

func countSwaps(a []int32) {

    // Variables to track number of swaps and initiate a swap
    var swaps, temp int32
    
    // Translated xample bubble sort
    for i := 0; i < len(a); i++ {
        for j := 0; j < len(a) - 1; j++ {
            // Swap adjacent elements if they are in decreasing order, increment swaps
            if (a[j] > a[j + 1]) {
                temp = a[j]
                a[j] = a[j+1]
                a[j+1] = temp
                swaps++
            }
        }
    }
    // Display number of swaps along with first and last elements in array
    fmt.Println("Array is sorted in", swaps, "swaps.")
    fmt.Println("First Element:", a[0])
    fmt.Println("Last Element:", a[len(a)-1])
}

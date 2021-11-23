/*
Given arrays of the whole words in a magazine and a ransom note, this challenge
is to see if it is possible for the ransom note to be constructed using words
cut out of the magazine. The function should print 'Yes' if so, and 'No' if not.
*/

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    var wordMap = mutableMapOf<String, Int>()
    
    // Add all the words from the magazine, incrementing frequencies if found more than once
    for (word in magazine) {
        if (wordMap.containsKey(word)) {
            wordMap.put(word, wordMap.getValue(word)+1)
        } else {
            wordMap.put(word, 1)
        }
    }
    
    // Add all the words from the ransom note, decrementing the frequencies of all the words found
    for (word in note) {
        if (wordMap.containsKey(word)) {
            wordMap.put(word, wordMap.getValue(word)-1)
        } else {
            wordMap.put(word, -1)
        }
    }
    
    // If the value of a word is less than 0, the magazine doesn't have enough of it to make the ransom note
    for (freq in wordMap.values) {
        if (freq < 0) {
            println("No")
            return
        }
    }
    println("Yes")
}

package com.example.basicfunctions.List

class CopyArrayElements {

    intArrayOf(1, 2, 3, 4).copyInto(intArrayOf(40, 50, 60, 70, 80, 90)).contentToString()
    //Output: [1, 2, 3, 4, 80, 90].

    intArrayOf(1, 2, 3, 4).copyOfRange(1,3).contentToString()
    //Output: [2, 3]

    intArrayOf(1, 2, 3, 4).copyOf(6).contentToString()
    //Output: [1, 2, 3, 4, 0, 0]
}

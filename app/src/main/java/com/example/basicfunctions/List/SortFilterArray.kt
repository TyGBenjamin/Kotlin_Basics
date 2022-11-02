package com.example.basicfunctions.List

class SortFilterArray {

    mutableListOf("Blue", "Purple", "Red").sortedByDescending { it.length }
    //Output: [Purple, Blue, Red]
    //Similar methods: sorted(), sortedBy{}, sortedWith(), sortedArray(), sortedArrayDescending(), sortedArrayWith(),
    //sortBy(), sortByDescending(), sortDescending(), sortWith(),

    mutableListOf("Blue", "Purple", "Red").shuffled()
    //Output: [Blue, Red, Purple]

    mutableListOf(4, 5, 4, 2).sorted().reversed()
    //Output: [4, 5, 4, 2]

    mutableListOf(0, 9, 8, 3).filterIndexed { index, it -> index == it }
    //Output:[0, 3]
    //Similar methods: filter{}, filterNot{}, filterNotNull(), filterNot(), filterNotTo()
}

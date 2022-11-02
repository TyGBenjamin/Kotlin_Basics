package com.example.basicfunctions.List

listOf(1, 2, 3, 4, 5).zip(listOf(6, 7, 8, 9))
//Output: [(1, 6), (2, 7), (3, 8), (4, 9)]

listOf(1, 2, 3, 4, 5).zipWithNext()
//Output: [(1, 2), (2, 3), (3, 4), (4, 5)]

listOf(1 to 2, 3 to 4, 5 to 6).unzip()
//Output: ([1, 3, 5], [2, 4, 6])

listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).chunked(4)
//Output: [[1, 2, 3, 4], [5, 6, 7, 8], [9]]

listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).windowed(4, 2, true)
//Output: [[1, 2, 3, 4], [3, 4, 5, 6], [5, 6, 7, 8], [7, 8, 9], [9]]

listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).partition { it % 2 == 0 }
//Output: ([2, 4, 6, 8], [1, 3, 5, 7, 9])

data class Person(val name: String, val age: Int)
listOf(Person("Joey", 33), Person("Ross", 40),Person("Monica",33)).groupBy { it.age }
//Output: {33=[Person(name=Joey, age=33), Person(name=Monica, age=33)], 40=[Person(name=Ross, age=40)]}

package com.example.basicfunctions.List

data class Person(val name: String, val age: Int)
val characters = listOf(Person("Joey", 33), Person("Ross", 40), Person("Monica",33), Person("Ema",12))
characters.joinToString(separator = ", ", prefix = "Including ", postfix = " 2 more are invited.", limit = 2, truncated = "etc") { it.name }
//Output: Including Joey, Ross, etc 2 more are invited.
//Similar method: joinTo()

(1..6).toMutableList().plusAssign(9)
//Output: [1, 2, 3, 4, 5, 6, 9]
//Similar methods: plus(), plusElement(), add(), addAll(), put(), putAll()

(1..6).toMutableList().minusAssign(2)
//Output: [1, 3, 4, 5, 6]
//Similar methods: minus(), minusElement()

(1..6).toMutableList().dropWhile {  it <= 2}
//Output: [3, 4, 5, 6]
//Similar methods: drop(), dropLast(), dropLastWhile{}

(1..6).toMutableList().removeAll((1..3).toList())
//Output: [4, 5, 6]
//Similar methods: remove(), removeIf{}, removeAt(), removeFirstOrNull(), removeFirst(), removeLastOrNull(), removeLast()

mutableListOf('a','A','b','C','C').distinctBy { it.toUpperCase() }
//Output: [a, b, C]
//Similar methods: distinct()

arrayOf(arrayOf(3, 7, 9, 4), arrayOf("a", "b"), intArrayOf(2, 4, 8)).contentDeepToString()
//Output: [[3, 7, 9, 4], [a, b], [2, 4, 8]]
//Similar method: contentToString()

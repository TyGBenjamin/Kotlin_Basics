package com.example.basicfunctions.List

class GetElementFromList {


    data class Person(val id: Int, val name: String)
    listOf(Person(null, 33), Person(null, 40),Person("Monica",33)).firstNotNullOfOrNull {it.name}
    //Output: Monica

    listOf(1, 2, 3, 4).getOrElse(10){100}
    //Output: 100,
    //Similar methods: getOrNull(), get()

    mutableMapOf(1 to 'a', 2 to 'b').getOrPut(3){'c'}
    //Output: c

    listOf(1, 2, 3, 4, 100).component5()
    //Output: 100
    //Similar methods: component1(), component2(), component3(), component4(), component5()

    listOf(1, 2).singleOrNull()
    //Output: null
    //Similar methods: single()

    listOf(1, 2, 3, 4, 5).first()
    //Output: 1

    listOf(1, 2, 3, 4, 5).last()
    //Output: 5

    listOf(1, 2, 3, 4, 5).findLast { it%2 == 0 }
    //Output: 4
    //Similar methods: find{}

    listOf(1, 2, 3, 4, 5).elementAtOrElse(9) { "Doesn't Exist" }
    //Output: Doesn't Exist
    //Similar methods: elementAt(), elementAtOrNull()

    listOf(10, 20, 30, 40, 50).binarySearch(50))
    //Output: 4
    // Similar method: binarySearchBy()

    (1..6).toMutableList().takeLastWhile { it >= 4 }
    //Output: [4, 5, 6]
    //Similar methods: take(), takeLast(), takeWhile{}, takeIf{}, takeUnless{}

    (1..6).toMutableList().slice(2..4)
    //Output: [3, 4, 5]
    //Similar method: sliceArray()
}

package com.example.basicfunctions

class Destructuring {

    // Destructuring declaration is the easiest way to create variables &
    // initialize all of them in a single line of code:

    val(id, name, age) = Person(101, "Harry Potter", 15)
    //Output: id = 101, name = Harry Potter, age = 15

    val (x, y, z) = arrayOf(1.3, 2.4, 3.8)
    //Output: x= 1.3, y= 2.4, z= 3.8

    val map = mutableMapOf(1 to "Harry", 2 to "Hermione", 3 to "Ron")
    for((key, value) in map) print("Id: $key, Name: $value ,")
    //Output: Id: 1, Name: Harry, Id: 2, Name: Hermione, Id: 3, Name: Ron
}

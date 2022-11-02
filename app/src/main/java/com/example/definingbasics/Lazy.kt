package com.example.definingbasics

fun lazyBoy(){
    //       Accessing properties is very familiar in programming languages
    // that support object-oriented paradigms. Kotlin also provides a
    // number of such approaches, and lazy initialization with by lazy
    // is a good example of them.
    // Lazy is similar to lateinit declaration whereas it allows us to define
    // a variable or value that won't be initiated until that variable is used.
    //Therefore we avoid taking up space and initiating an instance of something that
    // is not needed until necessary

    //Lazy Initialization
    // 1. -> Lazy can be used only with non-NULLable variables.
    // 2. -> Variable can only be val. "var" is not allowed .
    // 3. -> Object will be initialized only once. Thereafter, you receive the value from the cache memory.
    // 4. -> The object will not be initialized until it has been used in the application.
val lazy = Student()

}

class StudentHeavy{
    init{
        // when using by lazy block this value can only be accessed if we access lazy.heavy in
        //function above
        println("this has been initialized")
    }
}

class Student {
    // this causes the above block to print
    // val heavy = StudentHeavy()

    // this block will only be initiated when the value is accessed

    val heavy by lazy { StudentHeavy()}
}

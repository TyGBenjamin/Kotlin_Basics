package com.example.definingbasics

fun nullSafety(){
    //Kotlin null safety is a procedure to eliminate the risk of null reference
    // from the code. Kotlin compiler throws NullPointerException immediately if it
    // found any null argument is passed without executing any other statements.
    // In other words, kotlin has built in functionality to be able to handle nulls in
    // an efficient manner that does not reduces the chances of creating errors for null values .

    var name: String? = "tyler" // can be set to null
    name = null // ok
    println(name)

    //The question mark here allows for the name variable to accept a nullable value, otherwise setting name to null
    //without it being defined in the variable type would cause an error
}

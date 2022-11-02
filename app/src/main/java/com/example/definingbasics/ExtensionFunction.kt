package com.example.definingbasics

class Chef{
    fun hasCooked(rating:Int): Boolean{
        // same as if(rating > 50) return true
    rating > 50
        return true
    }


}

// this function isGreatCjef is not apart of the original Class Build for chef
// however it can now be accessed as if it were without changing or extending
// the original functionality for the Class itself.
fun Chef.isGreatChef(rating:Int): Boolean{
    rating > 90
    return true
}

fun askChef(){
    val Kris = Chef()
    println("${Kris.hasCooked(55)}")
    println("${Kris.isGreatChef(99)}")
}


fun extendString(){
    val str1:String ="Hey"
    val str2:String = "What"

    var str3: String ="Up"

    // if we want to println with each value we could
    // val combined = str3 + str2 + str1
    // this can be more efficient via extended function

2
        // creating the extension function here
//    fun String.add(s1: String, s2: String){
//        return this + s1 + s2)
//
//    }
}



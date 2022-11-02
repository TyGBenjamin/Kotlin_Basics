package com.example.definingbasics

sealed class Result{
    //Sealed classes are used for representing restricted class hierarchies,
    // when a value can have one of the types from a limited set,
    // but cannot have any other type. Sealed classes are similar to enum classes
    // but they provide more flexibility when defining the limited set of values.
    //Also, enums have a restriction that each enum constant can have only a single instance
    // whereas a subclass of a sealed class can have multiple instances that can contain state
    // for better handling.


    data class Success(val data : DataModel) : Result()
    data class Failure(val exception : Exception) : Result()





    //Like abstract classes the sealed classes allow us to represent hierarchies. Child-classes can
    // be any type of class like data class, object class, any regular class, or even another sealed class.
    //But unlike abstract classes, we need to define these hierarchies in the same file or as
    // nested classes. We cannot extend the sealed class outside the file it’s defined as it gives
    // a compilation error.


}

data class DataModel (
    val data: String? = "information"
        )



sealed class Month {
    class January(var numberOfDays: Int) : Month()
    data class February(var displayName: String) : Month()
    object March : Month() {
        var numberOfDays: Int = 0
        var displayName: String = "March..."
    }
}

fun sampleAccess(month: Month) = when (month) {
    is Month.January -> println("Number of days in January${month.numberOfDays}")
    is Month.February -> println("Display name of February ${month.displayName}")
    is Month.March -> println("Number of days & Display name of March ${month.numberOfDays} && ${month.displayName}")
}

fun sample() {
    val jan = Month.January(31)
    val feb = Month.February("Feb")

    //eval(jan)
    //eval(feb)
}

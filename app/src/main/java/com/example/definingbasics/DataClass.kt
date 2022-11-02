package com.example.definingbasics

data class Person(
    //To model a class that holds just data, you should use a data class.
    // The compiler simplifies your work by auto generating toString(),
    // equals() and hashCode() for you and providing destructuring and
    // copy functionality out of the box letting you focus on the data
    // you need to represent.
    var hasHair: Boolean,
    var height: String,
    var weight: Int,
    var gender: String,

    // This data class allows us to create abstract structures for us to shape
    // objects that will use this structure at a later time

)

fun makePerson(): Person {

    return Person(true, "6'1", 155, "male")
}


data class Puppy(
    val name: String,
    val breed: String,
    var cuteness: Int = 11
)

fun makePuppy(){
// create new instances
val tofuPuppy = Puppy(name = "Tofu", breed = "Corgi", cuteness = Int.MAX_VALUE)
// destructuring
val (name, breed, cuteness) = tofuPuppy
println(name) // prints: "Tofu"
val tacoPuppy = Puppy(name = "Taco", breed = "Cockapoo")

// access and modify properties
val breedn = tofuPuppy.breed
tofuPuppy.cuteness++



// copy: create a puppy with the same breed and cuteness as tofuPuppy but with a different name
val taconPuppy = tofuPuppy.copy(name = "Taco")


}

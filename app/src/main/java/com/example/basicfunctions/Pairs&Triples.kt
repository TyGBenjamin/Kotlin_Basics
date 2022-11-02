package com.example.basicfunctions


fun getElement() {
    fun getThreeElements(): Triple<String, Double, String> {
        return Triple("Learn Kotlin", 200.00, "Educational")
    }

    val data = getThreeElements()
    print(data.first)  //Output: Learn Kotlin
    print(data.second) //Output: 200.00
    print(data.third)  //Output: Educational

    fun getTwoElements(): Pair<String, Double> {
        return Pair("Learn Java", 300.00)
    }

    val twoElements = getTwoElements()
    print(twoElements.first)  //Output: Learn Java
    print(twoElements.second) //Output: 300.00
}

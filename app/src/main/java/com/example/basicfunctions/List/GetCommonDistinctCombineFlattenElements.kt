package com.example.basicfunctions.List

class getCommonDistinctCombineFlattenElements {

    //A traditional way of dealing with collections used to be iterating over collections,
    // and this looping requires a lot of boilerplate. Java Stream APIs provide the flexibility
    // to filter the collection elements with less code, but Android has limitations. Below
    // Android 24,
    // we need to be dependent on third-party libraries or desugaring support.
    //The collections in Kotlin have surprised us with a vast set of functions. Kotlin has both
    // mutable & immutable types of collections. Mutable collections can be modified, whereas immutable
    // collections are read-only. In the below code snippet, I have grouped and listed some useful
    // methods offered in the Kotlin language.


    //---------------- Get common, distinct, combine or flatten elements of the list:----------


    mutableListOf(1, 2, 3).union(mutableListOf(2, 3, 4, 5))
    //Output: [1, 2, 3, 4, 5]

    mutableListOf(1, 2, 3).intersect(mutableListOf(2, 3, 4, 5))
    //Output: [2, 3]

    mutableListOf(1, 2, 3).subtract(mutableListOf(2, 3, 4, 5))
    //Output: [1]

    mutableListOf(1, 2, 3).retainAll(mutableListOf(2, 3, 4, 5))
    //Output: true, [2, 3]

    mutableListOf(listOf(1, 2), listOf(2, 4), listOf(5, 6)).flatten()
    //Output: [1, 2, 2, 4, 5, 6]
    //Similar method: flatMap()



}

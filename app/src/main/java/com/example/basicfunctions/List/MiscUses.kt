package com.example.basicfunctions.List

class MiscUses {

    val result = listOf(5, 2, 10, 4).reduce { sum, element -> sum + element * 2 } // (5)+(2*2)+(10*2)+(4*2)
    print(result) //Output: 37
    //Similar methods: reduceOrNull(), reduceIndexed(), reduceIndexedOrNull(), reduceRight(), reduceRightIndexed(), reduceRightIndexedOrNull(), reduceRightOrNull()

    val result = listOf(5, 2, 10, 4).fold(2) { sum, element -> sum + element * 2 } // (2)+(5*2)+(2*2)+(10*2)+(4*2)
    print(result) // 44
    //Similar methods: foldIndexed(), foldRight(), foldRightIndexed()

    listOf("a", "b", "c", "d").runningFold("z") { acc, string -> acc + string }
    //Output: [z, za, zab, zabc, zabcd]
    //Similar method: runningFoldIndexed()

    listOf("a", "b", "c", "d").scan("z") { acc, string -> acc + string }
    //Output: [z, za, zab, zabc, zabcd]
    //Similar method: scanIndexed()
}

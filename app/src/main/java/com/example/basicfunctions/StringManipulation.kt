package com.example.basicfunctions

class StringManipulation {

    "Ja49va1K7otl54in7".partition { "123456789".contains(it)}
    //Output: (4917547, JavaKotlin)

    "L7ea3rn 1Kotl8in 12".filter { it.isDigit() }
    //Output: 731812

    "L7ea3rn 1Kotl8in 12F".findLast { it.isDigit() }
    //Output:2
    //Similar methods: findAnyOf(), findLastAnyOf()

    "Learn Kotlin".all { it.isLowerCase() }
    //Output: false

    "Learn Kotlin".any { it.isLowerCase() }
    //Output: true

    "Learn Kotlin".dropLastWhile{it.isLowerCase()}
    //Output; Learn K
    //Similar methods: dropWhile{}, drop(), dropLast()

    "Learn Kotlin".associateWith { it.toUpperCase() }
    //Output: {L=L, e=E, a=A, r=R, n=N,  = , K=K, o=O, t=T, l=L, i=I}
    //Similar methods: associate{}, associateBy{}, associateByTo(), associateWithTo()

    "Line One\n Line Two \n Line Three".lines()
    //Output: [Line One,  Line Two ,  Line Three]

    "Learn Kotlin".replaceAfter(' ', "Java")
    //Output: Learn Java
    //Similar methods: replace(), replaceAfterLast(), replaceBefore(), replaceBeforeLast(), replaceFirst(), replaceIndentByMargin(), replaceRange(), replaceFirst()

    "Learn Kotlin".substringAfter("a")
    //Output: rn Kotlin
    //Similar methods: substring(), substringAfterLast(), substringBefore(), substringBeforeLast()

    "Android_App_Java".commonPrefixWith("Android_App_Kotlin")
    //Output: Android_App_
    //Similar methods: commonSuffixWith()

    "Learn Kotlin".removeSurrounding("L", "lin")
    //Output: earn Kot
    //Similar methods: removePrefix(), removeSuffix(), removeRange()

    "\t".isBlank()
    //Output: true
    //Similar methods: ifBlank{}, isNotBlank(), isNotBlank(), isNullOrBlank()

    "\t".isEmpty()
    //Output: false
    //Similar methods: ifEmpty{}, isNotEmpty(), isNullOrEmpty(), orEmpty()

    "Learning\tKotlin".trim('L','B', 'n')
    //Output: earning	Kotli
    //Similar methods: trimIndent(), trimMargin(), trimStart(), trimEnd(), trimStart('L'), trimEnd('n')

    "Learning Kotlin".padStart(20, '.')
    //Output: .....Learning Kotlin
    //Similar method: padEnd()

    "learning kotlin".capitalize()
    //Output: Learning kotlin
    //Similar method: decapitalize()
}

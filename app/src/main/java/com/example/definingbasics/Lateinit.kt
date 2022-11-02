package com.example.definingbasics

fun lateInit(){
        // lateinit means late initialization. If you do not want to initialize a
    // variable in the constructor instead you want to initialize it later on and if
    // you can guarantee the initialization before using it, then declare that variable
    // with lateinit keyword. It will not allocate memory until initialized.

    lateinit var hello:String

    hello="howdy"


    //for example
    // -> private lateinit var myViewModel: MyViewModel
    //Then initialize somewhere in your MyViewModel class
    // -> myViewModel = MyViewModel()
 println(hello)


}


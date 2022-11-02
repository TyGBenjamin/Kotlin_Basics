package com.example.definingbasics

fun scopeFunction(){


    //Scope functions are functions that execute a block of code within the context of an object.
    //Scope functions provides a way to give temporary scope to the object, where specific
    // operations can be applied to the object within the block of code.
    //Scope functions make your code more concise and readable.
    //There are five scoped functions in Kotlin: LET, RUN,APPLY, WITH, & ALSO

    // LET & ALSO -> gives access to IT variable in lambda which can be renamed
    // RUN,WITH & APPLY -> give way to THIS


// ------- LET ----------------
    //When should we use let function? Well, there are several scenarios.
    // Most common scenario is null check. How did we usually write null checks?



    //if(employee!=null) {
    // print(employee.name);
    //}

    // -|
    // -V
    // -V


    //With let it looks simpler :
    //employee?.let{
    // print(it.name)
    //}


// ---------- RUN ----------
    //run is useful when we initialise an object and perform some operation
    // on that object. All this is done within a single run block. re-scopes the
    // variable it’s used on to. The last expression returns a result.

    //  val lengthOfName = Employee("Amanda", 29).run {
    //    println("Age is $age")
    //    println("Name is $name")
    //    name.length
    //}
    //print(lengthOfName)


//------------- APPlY ----------
    // Common use case of apply is object configuration

    // this ->
    //val dialog = CustomDialogFragment(this)
    //dialog.setCanceledOnTouchOutside(false)
    //dialog.setMessage("Do you want to cancel this transaction?")
    //dialog.setPositiveButton("Yes")
    //dialog.setNegativeButton("No")


    //------ if we use APPLY for configuration of dialog object :


    // converts to that <-
    //val dialog = CustomDialogFragment(this)
    //dialog.apply {
    //    setCanceledOnTouchOutside(false)
    //    setMessage("Do you want to cancel this transaction?")
    //    setPositiveButton("Yes" )
    //    setNegativeButton("No" )
    //}

// ------------------ ALSO -------------
    //Common use of also is for side effects without modifying the object.
    // We can use it for doing some operation on intermediate result. also does not
    // transform the object. It returns same object.

    // this ->

    //val employees = mutableListOf(
    //        Employee("Amanda", 29),
    //        Employee("Tom", 31),
    //        Employee("Brent", 34)
    //)
    //val mappingResult = employees.map { it.name }
    //println(mappingResult)
    //val filteredResult = mappingResult.filter { it.length > 5 }
    //println(filteredResult)

    // converts to that <-

    //val employees = mutableListOf(
    //        Employee("Amanda", 29),
    //        Employee("Tom", 31),
    //        Employee("Brent", 34)
    //)
    //val filteredResult = employees
    //    .map { it.name }
    //    .also { println(it) }
    //    .filter { it.length > 5 }
    //println(filteredResult)


// --------------------- WITH  --------------
    //Similar to apply function, with is also used to change properties of an instance
    // i.e. object configuration. In other words, with can be used to immediately change or alter
    // the properties of an object.
    // Only difference is with is not an extension function.
    // The last expression of with function returns a result. Simply as per docs
    //In the code, with can be read as “with this object, do the following.”

    // data class Employee(val name: String, val age: Int, var job: String, var address: String)
    //fun printFunction() {
    //    val employee = Employee("Kevin", 40, "Business Manager", "Belgium")
    //    with(employee) {
    //        job = "Sr. Business Manager"
    //        address = "Netherlands"
    //    }
    //    println(employee)
    //}

}

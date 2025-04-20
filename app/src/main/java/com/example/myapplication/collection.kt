package com.example.myapplication

fun main(){
    //list
    val numbers: List<String> = listOf("one", "two", "three", "four")

    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\": ${numbers.indexOf("two")}")

    // Immutable List
    val lst = listOf("one", "two", "three")
    println("Mutable list")
    for (i in lst.indices){
        println(lst[i])
    }
    println()
// Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("Four")
    println("Immutable list")
    for (i in mutableLst.indices){
        println(mutableLst[i])
    }
    //set
    val number = setOf(1, 2, 3, 4)
    for(elements in number){
        println(elements)
        }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${number == numbersBackwards}")

    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )

    println("All keys : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")
    println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")

    // mutable map

    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )
    println("Enter student name: ")
    val input: String = readln().lowercase()
    println(studentMarks[input])

    //immutable
    val Marks = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )

    Marks["ram"] = 60
    Marks.put("sabin", 80)

    println("Enter student name: ")
    val inpu: String = readln().lowercase()
    println(studentMarks[inpu])


}
package com.example.myapplication

fun main() {
    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add( element = 20, index = 1)
    age1.add(5)
    println(age1)

    var name = arrayListOf<String>("ram","sita")
    name.add("ninam")
    name.add(element = "anisha" , index = 3)
    name.remove("ram") //remove by content
    name.removeAt(0)// remove by index
    println(name)

    var mixed = arrayListOf<Any>("anisha",3,3.4)
    println(mixed[0])
    println(mixed[1])
    println(mixed[2])





}
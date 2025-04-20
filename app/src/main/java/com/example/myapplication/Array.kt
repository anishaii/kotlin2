package com.example.myapplication

fun main(){
    val arr = arrayOf(1,2)
    println(arr.contentToString())
    println("the age is "+arr[0])
    println("the age is "+arr[1])
    println("*******************")

    var array= arrayOf("anisha","ninam","hello")
    array[2]="hi"
    println("the name is "+array[0])
    println("the name is "+array[1])
    println("the name is "+array[2])

    println(arr.size)
}
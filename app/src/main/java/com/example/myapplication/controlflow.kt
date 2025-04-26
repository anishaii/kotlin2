package com.example.myapplication

fun main(){
    // if else
    print("Please enter a number : ")
    var number:Any = readln()!!.toInt()
    if(number.toString().toInt() % 2 == 0){
        println("$number is even")
    }else{
        println("$number is odd")
    }
    //If-Else - if ladder statement

    println("please enter your age:")
    var age:Int= readln()!!.toInt()
    if(age<13){
        println("you are a chile")
    }else if (age<19){
        println("you are a teenager")
    }else{
        if (age<50){
            println("you are adult")
        }else{
            println("you are senior citizen")
        }
    }

    //nested loop

    println("Please enter 3 numbers : ")
    var number1: Int = readln()!!.toInt()
    var number2: Int = readln()!!.toInt()
    var number3: Int = readln()!!.toInt()
    var largestNumber: Int
    if (number1 >= number2) {
        if (number1 >= number3) {
            largestNumber = number1
        } else {
            largestNumber = number3
        }
    } else {
        if (number2 >= number3) {
            largestNumber = number2
        } else {
            largestNumber = number3
        }
    }
    println("The largest number is $largestNumber")
    // when statement

    println("enter a number of week")
    var daynumber: Int= readln()!!.toInt()
    var day:String
    when(daynumber){
       1-> day= "sunday"
        2-> day = "monday"
       3-> day="Tuesday"
       4-> day="wednesday"
       5-> day="thursday"
       6-> day = "friday"
       7-> day = "saturday"
        else-> day="invalid day choice"
    }
    println(day)
    //for loop

}
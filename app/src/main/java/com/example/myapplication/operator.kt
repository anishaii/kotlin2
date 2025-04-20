package com.example.myapplication

fun main(){
    // arithmetic operation
    var a:Double= 8.0
    var b:Double= 2.0
    var result: Double= 0.0
    result= a+b
    println("the result is $result")
    result= a-b
    println("the result is $result")
    result= a*b
    println("the result is $result")
    result= a/b
    println("the result is $result")
    result= a%b
    println("the result is $result")
    println("*********************************")

    //assignment operator
    var i:Int= 8
    var j:Int= 2
    var k: Int= 0
    k= i+j
    println("the result is $k")
    k += i
    println("the result is $k")
    k -= j
    println("the result is $k")
    k /= i
    println("the result is $k")
    k %= i
    println("the result is $k")
    println("*********************************")

    //unary operator
    var number:Double = 7.6
    var isCheck:Boolean = true;
    println("+number = ${+number}" )
    println("-number = ${-number}" )
    println("++number = ${++number}" )
    println("--number = ${--number}" )
    println("!isCheck = ${!isCheck}" )
    println("-----------------------------------")
    var rel:Double = 4.7
    println("result :$rel")
//when the result++ is executed, the original value is evaluated first
//and value of result is increased only after that
    println("result++ : ${rel++}")
    println("-----------------------------------")

    var m:Int = 5
    var n:Int = 5

    println("m == n : " + (m == n))
    println("m != n : " + (m != n))
    println("m < n : " + (m < n))
    println("m > n : " + (m > n))
    println("m >= n : " + (m >= n))
    println("m <= n : " + (m <= n))

    var number1:Int = 5
    var number2:Int = 8
    var number3:Int = 12
    var rlt:Boolean = false;
//conditional operator (&&)
    rlt = (number1 > number2) && (number3 > number2)
    println(rlt)
//conditional operator (||)
    rlt = (number1 > number2) || (number3 > number2)
    println(rlt)

    var re:Int = 5+2*4
    println("Result = "+re)
    re = (5+2) * 4
    println("Result = "+re)
    var x:Int = 8;
    var y:Int = 4;
    var z:Int = 2;
    var sum:Int = 0;
    sum = x + --y + --z
    println("x+ --y + --z ::: $sum")

    var myCharRange = 'a'.rangeTo( 'j')
    var testCharRange = 'a'..'j'

    var check = 'Z' in testCharRange
    println("myCharRange has Z : $check")
    println(myCharRange)
    println(testCharRange)

    print("Enter name:: ")
    var name:String? = readln();
// The data user inputs is always a String so,
// type conversion for data type other than String
    print("Enter age:: ")
    var age:Int = readln()!!.toInt();

}
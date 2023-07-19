package com.example.kotlin

fun main(){
//    println("Hello Kotlin")
    val result = test(5,c=20)
    println(result);

    val result2 = singles(3,6);

    println(result2);
}

fun test(a:Int, b:Int=15, c:Int = 10): Int{
    println("test Function");
    return a+b+c
}

fun singles (a:Int,b:Int,) = a*b;
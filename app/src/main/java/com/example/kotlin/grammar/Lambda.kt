package com.example.kotlin.grammar

fun main(){
    // 람다식 ::: 익명함수
    // 변수처럼 사용되서, 함수의 arg , return이 될 수 있음
    // 한번 사용되고 재사용 X

    val a = fun(){println("hello world")}
    val b : (Int) -> Int = { it * 10 }

    a()
    println(b(2))

    val d = { a :Int, j: Int -> a*j}

    println(d(50,50))

    // 미사용 로컬 변수는 _ 언더바로 작성 가능
    val e : (Int, String, Boolean) -> String = {_,b,_ -> b}

    println(e(1,"s",false))

    hello(10,b)
}


fun hello(a:Int,b: (Int)-> Int): (Int)->Int{
    println(a)
    println(b(20))

    return b
}
package com.example.kotlin.grammar

fun main(){
    // 확장함수 Extension Function
    // 기존 정의되어 있는 클래스에 함수를 추가하는 기능
    val test = Test()
    Test().hello();
    test.hi()
}

fun Test.hi() = println("Hi")

class Test(){
    fun hello() = println("안녕")
    fun bye() = println("잘가")

}
package com.example.kotlin.grammar

// lateinit 은 var 만 가능 && Type지정
lateinit var text : String

// primitive 타입은 사용 불가능
// lateinit var age : Int === X
// lateinit var age : Integer

val test : Int by lazy{
    println("초기화 중")
    100
}
fun main(){
    text = "Yul-moo"
    println(text)

    println("메인 함수 실행")
    println("$test 초기화 한 값")
    println("$test 두번째 초기화?")

}
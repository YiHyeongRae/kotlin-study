package com.example.kotlin.grammar

fun main(){
    var name : String = "이름"
//     name = null ::: 에러

    var number : Int = 10
//    number = null ::: 에러

    var nickname :String? = "율무"
    var secondNumber :Int? = null

//    ? ::: Nullable , Null 가능
    val result = if(nickname == null){
        "값이 없음"
    }else{
        nickname
    }
    nickname = null

//    엘비스 오퍼레이터
    val result2 = nickname?: "값이 없음"
    println(result)
    println(result2)

//    옵셔널체이닝 느낌
    val size = nickname?.length
    println(size)
}
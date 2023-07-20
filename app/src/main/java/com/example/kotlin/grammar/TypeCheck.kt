package com.example.kotlin.grammar

fun main(){


    println(checkType("글씨"))
    println(checkType(1))
    println(checkType(true))

    cast("안녕")
    cast(1)

    println(smartCast("안녕"))
    println(smartCast(10))
    println(smartCast(true))
}


fun checkType(a:Any):String{
    return when (a) {
        is String -> {
            "문자열"
        }

        is Int -> {
            "숫자"
        }

        else -> {
            "Dont Know"
        }
    }
}

fun cast(a:Any){
    // ? Nuallable 로 String이 아니라면 return null
    val result = (a as? String) ?: "a is not String"
    println(result)
}

fun smartCast(a:Any):Int{
    return if(a is String){
        a.length
    }else if (a is Int){
        a.dec()
    }else {
        -1
    }
}
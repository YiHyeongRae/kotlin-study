package com.example.kotlin

fun main(){
    max(10,5)

    isHoliday("일")
}

fun max(a:Int, b:Int) {
    val result = if(a>b) a else b
    println(result)
}

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek:Any){

//    switch(dayOfWeek){
//        case: "월"
//    }
//    when(dayOfWeek){
//        "월" ->false
//        "화" ->false
//        "수" ->false
//        "목" ->false
//        "금" ->false
//        "토" ->true
//        "일" ->true
//    }

    val result = when(dayOfWeek){
        "월",
        "화",
        "수",
        "목",
        "금" ->false
        "토",
        "일" ->true
        else-> "표현식은 else가 필요해"
    }
    println(result)
//     when(dayOfWeek){
//        "토",
//        "일" -> if (dayOfWeek === "토") "좋아" else "너무 좋아"
//        in 2..4 -> {}
//        in listOf("월","화")->{}
//        else -> "안좋아"
//    }

}

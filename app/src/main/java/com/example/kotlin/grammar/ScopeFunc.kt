package com.example.kotlin.grammar

fun main(){
    // let, run, apply, also, with
    // 1.let

    val a = 3
    a.let{ }
    val user : Users? = Users("율무",3,true)

    // 수신객체.let { user ->
    //
    // 마지막줄 // return
    // }
    val ages = user?.let{
        user.age
    }

    println(ages)

    // 2.run
    // 수신객체.run{ this ->
    //
    // 마지막 줄
    // }

    val kid = Users("아이",5,false)

    val kidAge = kid.run{
        age
    }
    println(kidAge)

    // 3.apply
    // 수신객체.apply{this ->
    //
    //
    // }
    // 자기자신을 return 함

    val kidName = kid.apply{
        name
    }
    // 객체가 찍힘
    println(kidName)

    val female = Users("사랑",4,true,true)
    val femaleValue = female.apply{
        hasGlasses = false
    }
    println(femaleValue.hasGlasses)

    // 4. also
    // 수신객체.also { it -> // local variable
    //
    //
    // }
    // 자기자신을 return 함

    val male = Users("콩콩",1,false,true)

    val maleName = male.also{user->
        user.name
        user.hasGlasses = false
    }

    println(maleName.name)

    // 5. with
    // with(수신객체){
    // ...
    // 마지막줄 return
    // }

    val result = with(male){
        hasGlasses = false
        true
    }
    println(result)
}

class Users(
    val name : String,
    val age : Int,
    val gender : Boolean, // true : female, false : male
    var hasGlasses: Boolean = true,
)
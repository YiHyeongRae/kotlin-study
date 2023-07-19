package com.example.kotlin

fun main(){

    val user = User("이형래")
    Kid(name = "이형곤",age=25,gender="male")


    println("내 이름은 ${user.name}")
    println("내 나이는 ${user.age}")

//    println("kid ${kid.name},${kid.age},${kid.gender}")

}

open class User(open val name:String, open var age:Int = 32)

class Kid (override val name: String,override var age: Int, ) : User(name,age){
    var gender :String = "female"

    init{
        println("초기화 중 입니다.")
    }
    constructor(name:String, age:Int, gender:String) : this(name,age){
    this.gender = gender
        println("부 생성자 호출")
    }
}
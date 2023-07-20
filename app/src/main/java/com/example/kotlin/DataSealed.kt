package com.example.kotlin

fun main(){
    val person = Person("사람",20)
    val dog = Dog("율무",3)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 5).toString())

    val cat : Cat = WhiteCat()

    val result = when(cat){
        is BlueCat -> "blue"
        is RedCat -> "red"
        is GreenCat -> "green"
        is WhiteCat -> "white"
    }

    println(result)
}

class Person(
    val name : String,
    val age: Int,
)

data class Dog(
    val name : String,
    val age: Int,
)


sealed class Cat
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()
class WhiteCat : Cat()
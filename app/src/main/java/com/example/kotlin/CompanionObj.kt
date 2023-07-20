package com.example.kotlin

import com.example.kotlin.Book.Novel.NAME

fun main(){

    Counter
    println(Counter.count)
    Counter.countUp()
    println(Counter.count)

    Counter.hello()

    Book.create()

    NAME
}

object Counter : Hello(){
    init{
        println("카운터 초기화")
    }
    var count = 0
    fun countUp(){
        count++
    }
}

open class Hello(){
    fun hello() = println("hello")
}

class Book{
    companion object Novel{
        const val NAME = "Book Name"
        fun create() = Book()
    }
}
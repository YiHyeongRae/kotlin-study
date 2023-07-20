package com.example.kotlin.grammar

fun main(){
//  뮤터블
    val list = mutableListOf(1,2,3,4,5)
    list.add(6)
    list.addAll(listOf(7,8,9))

//  listOf === 이뮤터블
    val list1 = listOf(1,2,3,4)
//    list.get(0)
    list1[0]

    println(list1.map{it * 10}.joinToString ("," ))
    val diverseList = listOf(1,"안녕",1.78,true)
    println(list.joinToString(","))

    val map =  mapOf((1 to "안녕"),(2 to "Hello"))
//    map.put , 이뮤터블이라 put 불가능
    val map1 = mutableMapOf((1 to "안녕"),(2 to "Hello"))
//    map1.put(3,"응")
    map1[3] = "응"
    map1[100] = "좋아"
    println(map1)
}

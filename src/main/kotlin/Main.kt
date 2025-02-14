package com.ll

fun main() {
    val name: String? = "aaa"

    val age = name?.let {
        println("Length: ${it.length}")

        10
    }

    println(age) //let은 가장 마지막 값이 리턴됨
}
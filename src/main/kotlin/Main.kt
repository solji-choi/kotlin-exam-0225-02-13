package com.ll

fun main() {
    val names = listOf("Alice", "Bob", "Charlie") // 불변 리스트
    val names2 = mutableListOf("dlf", "dl", "tka") //추가 가능한 리스트

    for (name in names) {
        println(name)
    }
}
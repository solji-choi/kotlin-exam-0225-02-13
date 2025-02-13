package com.ll

fun String.greet(): String {
    return "Hello, $this!"
}

fun String.fr(): String {
    return this[0].toString()
}

fun main() {
    println("Alice".greet()) // 확장 함수 사용
    println("Alice".fr())
}
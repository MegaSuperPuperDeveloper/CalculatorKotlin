package com.example



fun main() {

    print("Enter first number: ")
    val a = readln().toDouble()
    print("Enter second number: ")
    val b = readln().toDouble()
    print("Write operation: (-, +, /, *): ")
    val c = readln()

    when (c) {
        "+" -> println("${a} ${c} ${b} = ${a + b}")
        "-" -> println("${a} ${c} ${b} = ${a - b}")
        "/" -> println("${a} ${c} ${b} = ${a / b}")
        "*" -> println("${a} ${c} ${b} = ${a * b}")
    }

}
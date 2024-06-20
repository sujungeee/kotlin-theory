package chap02.section4

fun main(){
    var num1 = 10
    var num2 = 10
    val result1 = ++num1 // result1: 11, num1: 11
    val result2 = num2++ // result2: 10, num2: 11

    println("result1: $result1")
    println("result2: $result2")
    println("num1: $num1")
    println("num2: $num2")
}
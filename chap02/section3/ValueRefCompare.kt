package chap02.section3

fun main(){
    val a: Int = 128
    val b = a
    println("a === b: ${a === b}")

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    val f: Int? = d

    println(c == d)
    println(c === d)
    println(a === c)
    println(c === e)
    println(d === f)
}
package chap03.section5
fun main() {
    val a= 3
    val b= 10
    println(a.getMultiply(b))
}

fun Int.getMultiply(x: Int): Int {
    return this * x
}

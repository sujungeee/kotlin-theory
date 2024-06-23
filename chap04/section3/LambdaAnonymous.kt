package chap04.section3

fun main() {
    // 람다식 방법
    var num = 10
    var getMessage = lambda@ { num: Int ->
        if (num !in 1..100) {
            return@lambda "Error"
        }
        "Success"
    }
    val message = getMessage(num)
    println("getMessage 10: $message")

    // 익명 함수 방법
    getMessage= fun(num: Int): String{
        if (num !in 1..100){
            return "Error"
        }
        return "Success"
    }
    print("getMessage 1000: ")
    println(getMessage(1000))
}
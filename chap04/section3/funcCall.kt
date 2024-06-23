package chap04.section3

fun main(){
    // 람다식으로 함수를 정의
    fun greet1()= { println("Hello1") }
    greet1()()

    // 익명 함수로 함수를 정의
    fun greet2()= fun () { println("Hello2") }
    greet2()()
}
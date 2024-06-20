package chap02.section3

fun main(){
    var test: Number = 12.2 // 12.2 에 의해 test는 Float 형으로 스마트 캐스트

    println("test: $test")

    test = 12
    println("test: $test")

    test = 120L
    println("test: $test")

    test += 12.0f
    println("test: $test")
}
package chap02.section3

fun main(){
    var str1: String? = "Hello Kotlin"
    str1 = null
    // 조건문을 활용해 null 을 허용한 변수 검사하기
//    var len = if(str1 != null) str1.length else -1
//    println("str1: $str1 / length: ${len}")

    // 세이프 콜과 엘비스 연산자를 활용해 null 을 허용한 변수 더 안전하게 사용하기
    println("str1: $str1 / length: ${str1?.length ?: -1}")
}
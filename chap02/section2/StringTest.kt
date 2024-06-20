package chap02.section2

fun main(){
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}") // str1과 str3의 참조 주소는 같다
}
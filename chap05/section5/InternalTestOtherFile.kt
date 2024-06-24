package chap05.section5.internal

// internal 은 모듈만 다르면 됨
// 패키지 이름이 다르면 import 구문을 사용해 필요한 클래스를 import 해야함.

fun main(){
    val otheric = InternalClass()
    println(otheric.i)
    otheric.icFunc()
}
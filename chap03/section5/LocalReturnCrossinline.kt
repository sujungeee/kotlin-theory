package chap03.section5.crossinline

// crossinline 으로 비지역반환 금지
// 람다식함수를 매개변수로 하는 중첩함수를 추가하며, return은 사용이 금지된다.
fun main(){
    shortFunc(3){
        println("First call: $it")
    }
}

inline fun shortFunc(a:Int, crossinline out:(Int)->Unit){
    println("Before calling out()")
    nestedFunc({out(a)})
    println("After calling out()")

}

fun nestedFunc(body:()->Unit){
    body()
}
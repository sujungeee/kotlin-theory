package chap05.section4.prisecon

// 주 생성자와 부 생성자 함께 사용하기(p.226)

class Person(firstName: String, out: Unit = println("[Primary Constructor] Parameter")){
    val fName = println("[Property] Person fName: $firstName")
    init{
        println("[init] Person init block")
    }
    constructor(firstName: String, age: Int, out: Unit = println("[Secondary Constructor] Parameter")) : this(firstName)
    {
        println("[Secondary Constructor] Body: $firstName, $age")
    }
}

fun main(){
    val p1 = Person("Kildong", 30)
    println()
    val p2 = Person("Dooly")
}
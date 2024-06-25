package chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main(){
    var isPersonInstantiated: Boolean = false // 초기화 확인 용도

    // by lazy - 객체의 위임, lazy - 변수에 위임(value)

    val person : Person by lazy{
        isPersonInstantiated = true
        Person("Kim", 23)
    }
    val personDelegate = lazy{ Person("Hong", 40) }

    println("person init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

}
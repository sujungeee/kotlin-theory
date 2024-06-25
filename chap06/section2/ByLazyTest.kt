package chap06.section2

// lazy를 사용해 프로퍼티 지연 초기화하기

class LazyTest{
    init{
        println("init block")
    }

    val subject by lazy{
        println("lazy initialized")
        "Kotlin Programming"
    }

    fun flow(){
        println("not initialized")
        println("subject one: $subject")
        println("subject two: $subject")
    }
}

fun main(){
    val test = LazyTest()
    test.flow()
}
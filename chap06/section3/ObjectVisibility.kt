package chap06.section3

class ObjectVisibility {
}

fun main(){
    val c= C()
    c.bar()
}

class C{
    private fun foo()= object{
        val x: String="x"
    }
    fun publicFoo() = object{
        val x: String="x"
    }
    fun bar(){
        val x1= foo().x
        println("x1: $x1, ${x1.javaClass}")
    }
}
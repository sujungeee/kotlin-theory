package chap03.section3

fun main(){
//    oneParam( { a -> "Hello World! $a" })
    oneParam { "Hello World! $it" }
}

fun oneParam(out: (String) -> String){
    println(out("One Param"))
}
package chap04.section3

fun main(){
    retFunc1()
}

fun inlineLambda1(a:Int, b:Int, out:(Int, Int)-> Unit){
    out(a,b)
}

fun retFunc1(){
    println("start of retFunc")
    inlineLambda1(13, 3, fun (a, b){
        val result= a+b
        if (result>10) return
        println("result: $result")
    })
    println("end of retFunc")
}
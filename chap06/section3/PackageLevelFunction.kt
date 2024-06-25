@file:JvmName("PKLevel")
package chap06.section3

fun packageLevelFunc(){ // fun main() 밑에서 선언하여도 됨.
    println("Package-Level Function")
}

fun main(){
    packageLevelFunc()
}
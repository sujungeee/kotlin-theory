package chap06.section2

// observable() 함수

import kotlin.properties.Delegates

class User{
    var name: String by Delegates.observable("NONAME"){
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main(){
    val user = User()
    user.name = "Kildong"
    user.name = "Dooly"
}
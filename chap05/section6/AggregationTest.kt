package chap05.section6

// 집합 관계: 특정 객체를 소유, 클래스의 생명주기를 유지함

class Pond(_name: String, _members: MutableList<Duck>){
    val name: String = _name
    val members: MutableList<Duck> = _members
    constructor(_name: String): this(_name, mutableListOf<Duck>())
}

class Duck(val name: String)

fun main(){
    val pond = Pond("myFavorite")
    val duck1 = Duck("Duck1")
    val duck2 = Duck("Duck2")

    pond.members.add(duck1)
    pond.members.add(duck2)

    for(duck in pond.members){
        println(duck.name)
    }
}
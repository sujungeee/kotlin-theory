package chap03.section4

import java.util.concurrent.locks.ReentrantLock

var sharable=1

fun main(){
    val reLock=ReentrantLock()

    lock(reLock, { criticalFunc() }) // 2
    lock(reLock) { criticalFunc() } //3
    lock(reLock, ::criticalFunc) // 4

    println(sharable)
}

fun criticalFunc(){
    sharable +=1
}

fun <T> lock(reLock: ReentrantLock, body:()->T):T{
    reLock.lock() // 잠금
    try{
        return body()
    } finally{
        reLock.unlock()
    }
}
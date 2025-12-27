/* 논리연산자
    &&   ||   !
    Java와 완전히 동일하다.
    Java처럼 Lazy 연산을 수행한다.
 */

package com.lec04

fun main() {
    if (fun1() || fun2()) {
        println("main1")
    }

    if (fun2() && fun1() ) {
        println("main2")
    }
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}
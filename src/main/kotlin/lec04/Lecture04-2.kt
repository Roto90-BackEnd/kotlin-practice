/*
비교 연산자와 동등성, 동일성
ㄴ동등성(Equality): 두 객체의 값이 같은가?
ㄴ동일성(Identity): 완전히 동일한 객체인가?! 즉 주소가 같은가?!
Java에서는 동일성에 ==를 사용, 동등성에 equals를 직접 호출
Kotlin에서는 동일성에 ===를 사용, 동등성에 ==를 호출
==를 사용하면 간접적으로 equals를 호출해준다.
*/

package com.lec04

import lec04.JavaMoney

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 === money2)          //true
    println(money1 === money3)          //false
    println(money1 == money3)           //true
}


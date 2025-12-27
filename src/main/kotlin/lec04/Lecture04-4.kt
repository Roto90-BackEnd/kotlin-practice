/* 논리 연산자와 코틀린에 있는 특이한 연산자
    - in / !in
    컬렉션이나 범위에 포함되어 있다. 포함되어 있지 않다.
    - a..b
    a부터 b까지 범위 객체를 생성한다.
    - a[i]
    a에서 특정 index i로 값을 가져온다.
    - a[i] = b
    a의 특정 index i에 b를 넣는다.

    연산자 오버로딩
    Kotlin에서는 개체마다 연산자를 직접 정의할 수 있다.
 */
package com.lec04

fun main() {
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)
    println(money1.plus(money2))
    println(money1 + money2)
}
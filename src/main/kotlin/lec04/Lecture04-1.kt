/*(
 코틀린에서 연산자를 다루는 방법
 단항 연산자 / 산술 연산자


 논리 연산자, 코틀린에 있는 특이한 연산자

 */
package com.lec04

import lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }
}
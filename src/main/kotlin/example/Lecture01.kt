package com.example

class Person(val name: String, val age: Int) {}

fun main() {

    // 모든 변수는 var / val 을 붙여야 한다.
    var number1 = 10L
    // number1 = 5L      // 수정 가능

    val number2 = 10L
    // number2 = 5L      // 수정 불가능[Read-Only]

    // 자바에서는 long(primitive)과 Long(reference)을 구분하지만 코틀린에서는 구분하지 않음
    // 코틀린에서는 Long 하나로 쓰지만 내부적으로 추론을 함
    var number3: Long = 1000L
    var number4: Long = 2000L

    // nullable 변수 설정 = 변수에 null이 들어가면 타입에 [?] 을 추가해야함
    var number5: Long? = 1_000L
//    number5 = null

    var person = Person("taejun", 30)
    println(number1)
    println(number2)
    println(number3)
    println(number4)
    println(number5)
    println(person.name)
}
package com.example

fun main() {
    printAgeIfPerson(Person("", 100))
//    val number1 = 3
//    val number2: Long = number1.toLong()

//    val number1: Int? = 3
//    val number2: Long = number1?.toLong() ?: 0L

// String interpolation / String indexing
    val person = Person("taejun", 30)
    println("이름: ${person.name}")

    val name = "TAEJUN"
    println("이름: ${name}")

    val str5 =
    """
        ABC
        DEF
        ${name}
    """.trimIndent()
    println(str5)

    val str6 = "ABC"
    println(str6[0])
    println(str6[2])
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
       println(person?.age)    // 스마트 캐스트: 코틀린에서는 이 상황에서 Person을 생략하고 바로 obj를 호출이 가능하다.
    }

// 코틀린의 특이한 타입 3가지 - Any
    // Java의 Object 역할 => 모든 객체의 최상위 타입
    // 모든 Primitive Type의 최상의 타입도 Any이다.
    // Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면 Any?로 표현한다.
    // Any에 equals, hasCode, toString이 존재한다.

// 코틀린의 특이한 타입 3가지 - Unit
    // Unit은 Java의 void와 동일한 역할
    // void와 다르게 Unit은 그 자체로 타입 인자로 사용이 가능하다.
    // 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미한다.
    // 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현

// 코틀린의 특이한 타입 3가지 - Noting
    // Noting은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할이다.
    // 무조건 예외를 반환하는 함수/ 무한 루프 함수 등이 있다.
    // 실제로 많이 사용되는 타입은 아니다.
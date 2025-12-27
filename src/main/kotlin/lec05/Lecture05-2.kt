/*
    3. switch와 when

    when(값) {
    조건부 -> 어떠한 구문
    조건부 -> 어떠한 구문
    else -> 어떠한 구문
    }
    조건부에는 어떠한 expression이라도 들어갈 수 있다 (ex. is Type)
    조건부에는 여러 개의 조건을 동시에 검사할 수 있다. (",' 로 구분)
    조건부에는 when의 (값)이 없을 수도 있다. => early return 처럼 동작한다

    when은 Enum Class 혹은 Sealed Class와 함께 사용할 경우 더욱 효과적이다.

 */
package com.lec05

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber (number: Int) {
    when (number) {
        1, 0, -1 -> println("1, 0, -1")
        else -> println("Not 1, 0, -1")
    }
}

fun judgeNumber2 (number: Int) {
    when {
        number == 0 -> println("zero")
        number % 2 == 0 -> println("even")
        else -> println("add")
    }
}
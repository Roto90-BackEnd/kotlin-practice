/* 코틀린에서 조건문을 다루는 방법
    1. if문

    2. Expression과 Statement
    Kotlin에서는 if-else를 expression으로 사용할 수 있기 때문에 3항 연산자가 없다.


 */

package com.lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score} is not a negative")
    }
}

fun validateScoreRangeNot(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("Score must be between 0 and 100")
    }
}

fun validateScore(score: Int) {
    if (score in 0..100) {
        throw IllegalArgumentException("Score must be between 0 and 100")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}
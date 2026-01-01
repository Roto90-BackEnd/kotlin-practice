/*  코틀린에서 예외를 다루는 방법
    1. try catch finally 구문
    - 주어진 문자열을 정수로 변경하는 예제
    2. Checked Exception과 Unchecked Exception
    - 프로젝트 내 파일의 내용물을 읽어오는 예제

    3. try with resources

 */

package com.lec07

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
        // 기본 타입간의 형변환은 toType()을 사용
    } catch (e: NumberFormatException) {
        // 타입이 뒤에 위치한다.
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
        // new를 사용하지 않고 포맷팅이 간결하다.
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}
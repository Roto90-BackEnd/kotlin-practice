/*  코틀린에서 반복문을 다루는 방법
    1. for-each문 [향상된 for문]
    반복문은 무언가를 반복할 때 많이 사용,
    리스트와 같은 컬렉션, 배열과 함께 사용하는 경우가 많음.
    => 숫자가 들어 있는 리스트를 하나씩 출력하는 예제
    자바에서는 :을 쓰는데 코틀린에서는 in을 사용


    3. Progression과 Range
    ..은 1씩 등차수열을 만들라는 InRange가 포함되어 있음
    x..y => x부터 y까지 1씩 상승하는 등차수열을 만들어줘 라는 뜻
    한줄요약: 코틀린에서 전통적인 for문은 등차수열을 이용한다.

 */

package com.lec06

fun main() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }
}


/*  2. 전통적인 for문
    => 1부터 3까지 출력하는 예제      // 범위를 나타내는 ..를 사용함
    => 3부터 1까지 출력하는 예제      // 내려가는건 downTo를 사용함
    => 1부터 5까지 2씩 올라가는 예제   // step을 사용해서 숫자를 지정하면 그 숫자만큼 상승함

    4. while 문
    while문은 자바와 완전히 동일
    중요한 점은 while에서 i는 가변이니까 val이 아닌 var로 지정
 */
package com.lec06

fun main() {

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}
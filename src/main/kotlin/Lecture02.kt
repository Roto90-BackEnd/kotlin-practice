package com

fun main() {

    // Safe Call
    // null이 아니면 실행하고, null이면 실행하지 않는다.
    val str1: String? = "ABC"
    println(str1?.length)

    // Safe Call
    // null이면 그대로 null을 반환한다.
    val str2: String? = null
    println(str2?.length)

    // Elvis 연산자
    // Safe Call과 같이 사용되며 null이면 Elvis 연산자(?:) 뒤의 값을 반환한다.
    val str3: String? = null
    println(str3?.length ?: 0)
}

// String 뒤에 ?가 없기 때문에 바로 호출이 가능함
fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

// Kotlin에서의 null 체크 1
// null이 들어갈 수 없는 Boolean을 반환
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

// Kotlin에서의 null 체크 2
// null이 들어갈 수 있는 Boolean을 반환
fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

// Kotlin에서의 null 체크 3
// null이 들어갈 수 없는 Boolean을 반환
fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

// Safe Call과 Elvis 연산자를 동시에 사용 1
// null이 아닌 경우 Safe Call이 호출되서 true/false를 갖고, str이 null이면 Elvis 연산자 뒤의 Exception을 호출한다.
fun startsWithA4(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

// Safe Call과 Elvis 연산자를 동시에 사용 2
// str이 null이라면 전체가 null이기 때문에 null을 반환하고, null이 아니라면 startsWith가 호출되서 true/false를 반환한다.
fun startsWithA5(str: String?): Boolean? {
    return str?.startsWith("A")
}

// Safe Call과 Elvis 연산자를 동시에 사용 3
// str이 null이 아니라면 Safe Call이 불려서 startsWith가 호출해서 true/false를 반환하고,
// str이 null이라면 전체가 null이 되면서 Elvis 연산자 뒤에 있는 false가 반환된다.
fun startsWithA6(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// null 아님 단언!!
// !!는 절대 null이 아니라는 뜻이다.
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}
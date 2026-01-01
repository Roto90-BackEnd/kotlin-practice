/*  try with resources
    - Kotlin에서는 try with resources 구문이 없다.
    대신 use 라는 inline 확장함수를 사용해야 한다.
 */

package com.lec07

import java.io.BufferedReader
import java.io.FileReader

class FilePrinter2 {

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}
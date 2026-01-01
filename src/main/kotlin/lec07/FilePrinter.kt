/*  Checked Exception과 Unchecked Exception
    Kotlin에서는 Checked Exception과
    Unchecked Exception을 구분하지 않는다.
    모두 Unchecked Exception 이다.
 */
package com.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    fun readFile() {
        val currentFile = File("._")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }
}
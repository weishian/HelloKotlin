package net.macdidi5.basic

import net.macdidi5.other.average

fun main(args: Array<String>) {
    val a = average(3, 5, 7)
    println("Average: $a")

    outer@ for (x in 1..5) {
        for (y in 1..5) {
            println("X:$x - Y:$y")
            if (y == 3) {
                break@outer
            }
        }
    }

    outer@ for (x in 1..5) {
        for (y in 1..5) {
            if (y > 3) {
                continue@outer
            }
            print(y)
        }
        println("=>X:$x")
    }

    val ages: IntArray = IntArray(3)
    for (i in ages.indices) {
        println("[$i]: ${ages[i]}")
    }
    for ((i, v) in ages.withIndex()) {
        println("[$i]: $v")
    }

    val literal2: String = """
    |for (c in name) {
    |    print(c)
    |}
    """.trimMargin()
    println(literal2)

    var name: String? = null
    println("name.isNullOrBlank(): ${name.isNullOrBlank()}")
    println("name.isNullOrEmpty(): ${name.isNullOrEmpty()}")

    println("name.isBlank(): ${name?.isBlank()}")
    println("name.isEmpty(): ${name?.isEmpty()}")
}
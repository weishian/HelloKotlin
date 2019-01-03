fun main(args: Array<String>) {
    println("Hello World!")

    var v: Int
    v = 13
    println("V: " + v)

    val x = 3
    val y = 5
    val z = 7

    val s = "X: $x, Y: $y, Z: $z"
    println(s)

    println("summary: $x + x + z")

    println("summary: ${x + y + z}")

    val grade = 'B'

    println("Bonus: ${getBonus(grade)}")

    val bonus2 = when(grade) {
        'A' -> 5000
        'B' -> 3000
        'C' -> 1000
        else -> 50
    }
    println("Bonus2: $bonus2")

    for (index: Int in 1..5) {
        print(index)
    }
    println()

    for (index: Int in 1..5 step 2) {
        print(index)
    }
    println()

    for (index: Int in 5 downTo 1) {
        print(index)
    }

    println()

    val ia: IntArray = intArrayOf(120, 30, 15, 27, 66)
    ia.filter { it > 50 }.sortedBy { it }.map { it / 10 }.forEach { print("$it-") }

    println()

    val simon = Person("Simon")
    simon.sayGreeting()
    simon.gender = 'M'
    println(simon.information)
    println()

    val mary = Person("Mary", 'F')
    mary.sayGreeting()
    println("${mary.name}'s gender is ${mary.gender}")

    val simon2 = Employee("Simon", 'M', 25000.0)
    simon2.printInformation()
}

private fun getBonus(grade: Char): Int {
    return when(grade) {
        'A' -> 5000
        'B' -> 3000
        'C' -> 1000
        else -> 50
    }
}

open class Person(var name: String) {
    var gender: Char = 'U'
    val information: String
        get() = "$name(${if (gender=='M') "Male" else "Female"})"

    constructor(name: String, gender: Char) : this(name) {
        this.gender = gender
    }

    fun sayGreeting() {
        println("Hello, $name")
    }

    open fun printInformation() {
        println("Name: $name")
        println("Gender: $gender")
    }
}

class Employee(name: String) : Person(name) {
    private var salary: Double = 0.0

    constructor(name: String, gender: Char, salary: Double): this(name) {
        super.gender = gender
        this.salary = salary
    }

    override fun printInformation() {
        super.printInformation()
        println("Salary: $salary")
    }
}
package week3

fun week3Main() {
//    sum1()
//
//    val result = sum2()
//    print("Sum_2: $result")
//
//    sum3(2, 4)
//
//    val result4 = sum4(1, 3)
//    print("Sum_4: $result4")
    val result1 = calculate(2, 4, '+')
    println("Result: $result1")

    val result2 = calculate(
        sign = '-',
        value2 = 5,
        value1 = 2
    )
    println("Result: $result2")
}

/**
 * sum(1, 3) => 3
 * minus(1, 3) => -2
 * mul(1, 3) => 3
 * div(1,3) => 3.33
 */

fun sum(value1: Int, value2: Int): Int {
    return value1 + value2
}

fun minus(value1: Int, value2: Int): Int = value1 - value2
fun mul(value1: Int, value2: Int): Int = value1 * value2
fun div(value1: Int, value2: Int): Int = value1 / value2

fun calculate(value1: Int, value2: Int, sign: Char): Int {
    return when(sign) {
        '+' -> sum(value1, value2)
        '-' -> minus(value1, value2)
        '*' -> mul(value1, value2)
        '/' -> div(value1, value2)
        else -> -10000
    }
}


fun sum1() {
    print("Enter value 1: ")
    val value1 = readLine()!!.toInt()
    print("Enter value 2: ")
    val value2 = readLine()!!.toInt()
    print("Sum_1 = ${value1 + value2}")
}

fun sum2(): Int {
    print("Enter value 1: ")
    val value1 = readLine()!!.toInt()
    print("Enter value 2: ")
    val value2 = readLine()!!.toInt()

    return value1 + value2
}

fun sum3(value1: Int, value2: Int) {
    print("Sum_3 = ${value1 + value2}")
}

fun sum4(value1: Int, value2: Int): Int {
    return value1 + value2
}

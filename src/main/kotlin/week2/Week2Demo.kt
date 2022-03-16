package week2

fun week2Main() {
//    val value1: Int = 5
//    val value2: Int = 10
//    val result = value1 + value2
//    println("$value1 + $value2 = $result")

    //sumDemo2()
    //task1()
    task2()
}

fun sumDemo1() {
    // Sum from 1 to provided number
    // Ex: Input = 5 => sum = 1 + 2 + 3 + 4 + 5 = 15

    /**
     * 1. Print message to guide to user
     * 2. Ask user to input number
     * 3. Declare variable to store result, sum operation
     * 4. Declare variable for increase by 1 and has init value = 1
     * 5. Define loop for sum
     * 6. Sum the increase variable with result variable
     * 7. Plus 1 to increase variable
     * 8. if increase variable > sum variable then exit loop
     * 9. else continue loop
     * 10. Display sum result
     */
    print("Enter number: ")
    val inputNumber: Int = readLine()!!.toInt()
    var sum: Int = 0
    var incrementalNum: Int = 1

//    while (incrementalNum <= inputNumber) {
//        sum += incrementalNum
//        incrementalNum += 1
//    }
//    println("Sum = $sum")

    // Expected output: 1 + 2 + 3 + 4 + 5 = 15
    while (incrementalNum <= inputNumber) {
        if (incrementalNum == inputNumber) {
            print("$incrementalNum = ")
        } else {
            print("$incrementalNum + ")
        }
        sum += incrementalNum++
    }
    println("$sum")
}

fun sumDemo2() {
    do {
        print("Enter number: ")
        val inputNumber: Int = readLine()!!.toInt()
        var sum: Int = 0
        var incrementalNum: Int = 1

        while (incrementalNum <= inputNumber) {
            if (incrementalNum == inputNumber) {
                print("$incrementalNum = ")
            } else {
                print("$incrementalNum + ")
            }
            sum += incrementalNum++
        }
        println("$sum")
        print("Enter 'yes' to continue: ")
        val answer: String = readLine()!!.toString()
    } while(answer == "yes")
}

fun task1() {
    print("Enter student score: ")
    val score = readLine()!!.toInt()
    var grade: String = ""
    if (score >= 95) {
        grade = "A"
    } else if (score >= 90 && score < 95) {
        grade = "B"
    } else if (score >= 80 && score < 90) {
        grade = "D"
    } else if (score >= 65 && score < 80) {
        grade = "D"
    } else if (score >= 50 && score < 65) {
        grade = "E"
    } else {
        grade = "F"
    }
    print("Your garde is $grade")
}

fun task2() {
    // Rectangle area = width * height
    // Rectangle perimeter = 2 * (width + height)
    print("Enter width and height (split by space): ")
    val (width, height) = readLine()!!.split(' ').map(String::toInt)
    print("Rectangle S = ${width * height}, P = ${2 * (width + height)}")
}
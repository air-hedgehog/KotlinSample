import java.util.*

fun main(args: Array<String>) {
    println("Hello fuckin' world")
    println("\n")
    basics()
    println("\n")
    arrays()
    println("\n")
    ranges()
    println("\n")
    conditionalsOperators()
    println("\n")
    looping()

}

private fun looping() {
    for (x in 1..10) {
        println("Loop : $x")
    }

    val rand = Random()
    val magicNumber = rand.nextInt(50) + 1
    var guess = 0
    while (magicNumber != guess) {
        guess++
    }
    println("Magic number was : $guess")

    for (x in 1..20) {
        if (x % 2 == 0) {
            continue
        }
        println("Odd : $x")

        if (x == 15) break
    }

    //iterating through array indices:
    var array3: Array<Int> = arrayOf(3, 6, 9)
    for (i in array3.indices) {
        println("Multiple3 : ${array3[i]}")
    }

    //retrieving elements with indices from array:
    for ((index, value) in array3.withIndex()) {
        println("Index : $index Values : $value")

    }

}

private fun conditionalsOperators() {
    //if, else, &&, || etc. works just like java
    val age = 8

    //switch analog:
    when (age) {
        0, 1, 2, 3, 4 -> println("Go to preschool")

        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = age - 5
            println("Go to grade : $grade")
        }

    //default value:
        else -> print("Go to College")
    }
}

private fun ranges() {
    val oneTo10 = 1..10
    val alpha = "A".."Z"
    println("R in alpha : ${"R" in alpha}")

    //descendingrange from 10 to 1
    var tenTo1 = 10 downTo 1
    tenTo1 = 10.downTo(1)

    // range from 2 to 20:
    val twoTo20 = 2.rangeTo(20)

    //stepping through the range:
    val range3step = oneTo10.step(3)

    for (x in range3step) println("range3step : $x")

    //reverse a range:
    for (x in tenTo1.reversed()) println("Reversed : $x")
}

private fun arrays() {
    var myArray = arrayOf(1, 1.23, "Doge", false, 'C')
    println(myArray[2])
    myArray[1] = 3.14
    println("Array length : ${myArray.size}")
    println("Is array contents element : ${myArray.contains("Doge")}")

    // part of myArray:
    var partArray = myArray.copyOfRange(3, myArray.size - 1)

    println("First element of array : ${myArray.first()}")
    println("Index of Doge : ${myArray.indexOf("Doge")}")

    // create square array, which elements is square of it's index:
    var squareArray = Array(5, { x -> x * x })
    println("squareArray second element : ${squareArray[2]}")

    // predefined array of ints :
    val integerArray: Array<Int> = arrayOf(1, 2, 3)

}

private fun basics() {
    val name = "Antony"
    var age = 24
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE
    println("biggestInt : " + bigInt)
    println("smallestInt : $smallInt")
    println("534 + 2134 = ${534 + 2134}")

    var bitLong: Long = Long.MAX_VALUE

    //max length of double is 15 digits:
    var someDouble1: Double = 1.1111111111111111
    var someDouble2: Double = 1.1111111111111111
    println("double sum : " + (someDouble1 + someDouble2))

    var someCharacter: Char = 'A'
    println("someCharacter is a character : ${someCharacter is Char}")

    // Casting:
    println("3.14 to Int : " + (3.14.toInt()))
    println("A to Int : " + ('A'.toInt()))
    println("65 to Char : " + (65.toChar()))

    //String comparison:
    val randomString1 = "Random string"
    val randomString2 = "random string"
    println("Strings equal : ${randomString1.equals(randomString2)}")
    println("A compare to B : ${"A".compareTo("B")}")

    //Getitng char from String:
    println("fifth char of randomString1 : " + randomString1.get(4))
    println("fifth char of randomString1 : ${randomString1[4]}")
    println("substring 2-6 : ${randomString1.subSequence(2, 7)}")
    println("contains \"andom\" ${randomString1.contains("andom")}")
}
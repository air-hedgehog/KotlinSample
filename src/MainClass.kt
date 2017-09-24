import java.util.*

// https://www.youtube.com/watch?v=H_oGi8uuDpA

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
    println("\n")
    functions()
    println("\n")
    highOrderFunctions()
    println("\n")
    collectionOperators()
}

private fun collectionOperators() {
    val numList2 = 1..20

    //sum of all elements in a list:
    val listSum = numList2.reduce { x, y -> x + y }
    println("Reduce sum : $listSum")

    //fold is like reduce, but start from the initial value:
    val listSum2 = numList2.fold(5) { x, y -> x + y }
    println("Fold sum : $listSum2")

    //find any evens in a list:
    println("Evens : ${numList2.any { it % 2 == 0 }}")

    //check if all of them are evens:
    println("All evens are : ${numList2.all { it % 2 == 0 }}")

    //found all values that greater then 3:
    val greaterThen3 = numList2.filter { it > 3 }
    greaterThen3.forEach { n -> println(">3 : $n") }

    //maps:
    val times7 = numList2.map { it * 7 }
    times7.forEach { n -> println("times7 : $n") }
}

private fun highOrderFunctions() {
    println("filter even values : ")
    val numList = 1..20
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }

    //function that generates functions:
    val multiply3 = makeMathFunction(3)
    println("3 * 5 = ${multiply3(5)}")

    //passing functions as arguments:
    val multiply2 = { num1: Int -> num1 * 2 }
    val newNumList = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    mathOnList(myFunc = multiply2, numList = newNumList)
}

fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
    for (num in numList) {
        println("mathOnList : ${myFunc(num)}")
    }
}

fun makeMathFunction(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }

private fun functions() {
    //oneliner function without return:
    fun add(num1: Int, num2: Int): Int = num1 + num2
    println("5 + 4 = ${add(5, 4)}")

    //oneliner function with default values (works without return type too):
    fun substract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("5 - 4 = ${substract(5, 4)}")

    //parameter order is not important if you name arguments:
    println("4 - 5 = ${substract(num2 = 5, num1 = 4)}")

    //String formatting function without returning anything (void):
    fun sayHello(name: String): Unit = println("Hello $name")
    sayHello("Les Paul")

    //function, that returns two results:
    val (two, three) = nextTwo(1)
    println("1, $two, $three")

    //we also can send variable number of parameters ("vararg):
    println("Sum : ${getSum(1, 2, 3, 4, 5, 6, 7, 8)}")

    //creating value with inner function:
    val multiply = { num1: Int, num2: Int -> num1 * num2 }
    println("Multiply 5 * 6: ${multiply(5, 6)}")

}

private fun getSum(vararg nums: Int): Int {
    var numSum = 0
    nums.forEach { n -> numSum += n }
    return numSum
}

private fun nextTwo(number: Int): Pair<Int, Int> {
    return Pair(number + 1, number + 2)
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
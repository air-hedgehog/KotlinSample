
fun main(args : Array<String>) {
    println("Hello fuckin' world")
    basics()
}

private fun arrays() {

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
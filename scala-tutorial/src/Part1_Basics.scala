/**
 * https://www.youtube.com/watch?v=F90hJltCPEI&list=PLmtsMNDRU0BxryRX4wiwrTZ661xcp6VPM&index=2
 * Scala Tutorial - Scala at Light Speed, Part 2: Basics
 * @author HuanyuLee
 */
object Basics {
    // defining a value
    val meaningOfLife: Int = 22 // const int meaningOfLife = 22;

    // Int, Boolean, Double, Float, Char, String
    val aBoolean = false // type is optional

    // strings and string operations
    val aString = "I love Scala"
    val aComposedString = "I" + " " + "love" + " " + "Scala"
    val anInterpolatedString = s"The meaning of life is $meaningOfLife"

    // expressions = structures that can be reduced to a value
    val anExpression = 2 + 3

    // if-expression
    val ifExpression = if (meaningOfLife > 18) 999 else 888 // in other languages: meaningOfLife > 18 ? 999 : 888
    val chainedIfExpression = {
        if (meaningOfLife > 43) 56
        else if (meaningOfLife < 0) -1
        else 0
    }

    // code blocks
    val aCodeBlock = {
        // definitions
        val aLocalValue = 100
        // value of block is the value of the last expression
        aLocalValue + 200
    }

    // define a function
    def myFunction(x: Int, y: String): String = y + " " + x

    // recursive functions
    def factorial(n: Int): Int = if (n <= 1) 1 else n * factorial(n - 1)
    /*
    factorial(5) = 5 * factorial(4) = 5 * 24 = 120
    factorial(4) = 4 * factorial(3) = 4 * 6
    factorial(3) = 3 * factorial(2) = 3 * 2
    factorial(2) = 2 * factorial(1) = 2 * 1
    factorial(1) = 1
     */

    // In Scala we don't use loops or iteration, we use RECURSION!

    // the Unit type = no meaningful value === "void" in other languages
    // type of SIDE EFFECTS
    println("I love Scala") // System.out.println,printf,print,console.log

    def myUnitReturningFunction(): Unit = {
        println("I don't love returning Unit")
    }

    val theUnit = ()
}

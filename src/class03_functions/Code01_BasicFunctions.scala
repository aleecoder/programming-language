package class03_functions

/**
 * 函数式编程：基本函数、递归函数、默认值函数
 * @author HuanyuLee
 */
object Code01_BasicFunctions {

    def fun01() { // Java中必须要写返回值
        println("fun01 is executed!")
        3
    }

    def fun02() = { // 自动推断函数的返回值，最后一行作为返回值类型
        println("fun02 is executed!")
        2
        //return 2 // TODO: 如果用return关键字，必须给出函数的返回值类型，为什么？
    }

    // 参数必须给出类型，并且是val类型
    def fun03(a: Int): Unit = {
        println(s"fun03::a = ${a}")
    }

    // 递归函数 需要明确给出函数的返回值类型
    def factorial(num: Int): Int = {
        if (num == 1) num
        else num * factorial(num - 1)
    }

    def fun04(a: Int = 4, b: String = "god") = {
        println(s"fun04:: a, b = ${a}, ${b}")
    }

    def main(args: Array[String]): Unit = {
        val f1 = fun01() // 这在Java中是报错的
        println(s"f1 = ${f1}")
        val f2 = fun02()
        println(s"f2 = ${f2}")
        val f3 = fun03(3)
        println(s"f3 = ${f3}")

        println("--------- 递归函数 ---------")
        val num = 5
        println(s"${num}! = ${factorial(num)}")

        println("--------- 默认值函数 ---------")
        fun04()
        fun04(44)
        fun04(444, "haha")
        fun04(b = "tom") // fun04("tom") error
    }
}

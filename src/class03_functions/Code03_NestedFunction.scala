package class03_functions

/**
 * 函数式编程：嵌套函数
 * 写在函数中的函数
 * @author HuanyuLee
 */
object Code03_NestedFunction {
    def g() = {
        println("g函数返回圆周率！")
        Math.PI
    }

    def f(r: Int) = {
        println("f函数是计算圆的面积!") // 1

        def g() = {
            println("g函数计算完成！")
            Math.PI * r * r
        }

        println("g函数开始计算......") // 2
        g() // 3，并且调用的是f内部定义的
    }

    def main(args: Array[String]): Unit = {
        println(s"圆的面积= ${f(3)}")
    }
}

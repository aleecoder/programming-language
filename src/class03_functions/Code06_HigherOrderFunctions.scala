package class03_functions

/**
 * 高阶函数
 * 函数作为参数，函数作为返回值
 * @author HuanyuLee
 */
object Code06_HigherOrderFunctions {
    /**
     * 函数作为参数
     * @param a Int
     * @param b Int
     * @param f (Int, Int) => Int) 对a和b做什么操作
     */
    def calculate(a: Int, b: Int, f: (Int, Int) => Int): Unit = {
        println(s"ans = ${f(a, b)}")
    }

    /**
     * 函数作为返回值
     * @param op 用户传入操作符
     * @return (Int, Int) => Int
     */
    def option(op: String): (Int, Int) => Int = {
        def plus(x: Int, y: Int): Int = {
            x + y
        }
        def error(): (Int, Int) => Int = {
            print(s"Exception::错误的操作符$op，默认做加法运算: ")
            //throw RuntimeException
            _ + _
        }
        op match {
            //case "+" => plus
            case "+" => _ + _
            case "-" => _ - _
            case "*" => _ * _
            case "/" => _ / _
            // 不匹配的情况，如何自定义输出异常呢？
            case _ => error()
        }
    }

    def main(args: Array[String]): Unit = {
        // 函数作为参数
        calculate(3, 8, (x: Int, y: Int) => {
            x + y
        })
        // 函数作为参数：有参数列表，有函数体，
        // 且参数列表里的参数按顺序一次性的出现在了函数体里
        // 可把参数列表省略，用 _ 代替
        calculate(3, 8, _ + _)

        // 函数作为返回值
        calculate(10, 5, option("+"))
        calculate(10, 5, option("-"))
        calculate(10, 5, option("*"))
        calculate(10, 5, option("/"))
        calculate(10, 5, option("d"))
    }
}

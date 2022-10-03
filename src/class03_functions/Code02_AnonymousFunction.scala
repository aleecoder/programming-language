package class03_functions

/**
 * 函数式编程：匿名函数
 * @author HuanyuLee
 */
object Code02_AnonymousFunction {
    def main(args: Array[String]): Unit = {
        // val sum:(Int,Int) => Int
        // 签名：(参数类型列表) => 返回值类型。 例如：(Int,Int) => Int
        val sum = (x: Int, y: Int) => {
            x + y
        }
        println(sum(1, 1))
    }
}

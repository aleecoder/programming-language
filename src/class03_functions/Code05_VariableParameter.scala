package class03_functions

/**
 * 可变参数
 * @author HuanyuLee
 */
object Code05_VariableParameter {
    // 类型必须一致，s是数据集
    def f(s: Int*): Unit = {
        // def foreach[U](f: A => U): Unit
        s.foreach((x: Int) => {
            print(s"$x ")
        })
        //s.foreach(print(_))
        //s.foreach(print)
        println()
    }

    def main(args: Array[String]): Unit = {
        f(1)
        f(1, 2)
        f(1, 2, 3)
    }
}

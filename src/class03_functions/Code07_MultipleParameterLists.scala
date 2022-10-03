package class03_functions

/**
 * 多参数列表（柯里化）
 * 方法可以定义多个参数列表，当使用较少的参数列表调用多参数列表的方法时，
 * 会产生一个新的函数，该函数接收剩余的参数列表作为其参数。这被称为柯里化
 * @author HuanyuLee
 */
object Code07_MultipleParameterLists {

    def f(a: Int)(b: Boolean)(c: String): Unit = {
        println(s"$a\t$b\t$c")
    }

    // 柯里化
    // 比如有这样一个场景：用户传入的参数是三批参数
    // 第一批是Int类型，第二批是Boolean类型，第三批是String类型
    // 将参数列表分开，这样业务逻辑更清晰
    def g(a: Int*)(b: Boolean*)(c: String*): Unit = {
        a.foreach(println)
        b.foreach(println)
        c.foreach(println)
    }

    def main(args: Array[String]): Unit = {
        // 方法不想执行，赋值给一个引用
        // 方法名 + 空格 + _
        val func = f _
        //func(5)(true)("love you")
        g(1, 2, 3)(true)("scala", "java")
    }
}

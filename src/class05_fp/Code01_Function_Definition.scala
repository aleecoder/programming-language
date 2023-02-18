package class05_fp

/**
 * 函数的类型和值
 * @author HuanyuLee
 */
object Code01_Function_Definition {
    //（1）函数的类型和值
    val num: Int = 5
    //val counter: Int => Int = x => x + 1

    //（2）Lambda表达式 (参数) => 表达式
    val counter = (x: Int, y: Int) => x + y
    //val counter: (Int, Int) => Int = (x, y) => x + y

    //（3）闭包
    var more = 1
    val add = (x: Int) => x + more

    //（4）占位符语法
    val value = List(-3, -5, 1, 6, 9).filter(_ > 0)


    def main(args: Array[String]): Unit = {
        println(counter(4, 2))
        println(add(10))
        more = 2
        println(add(10))
        println(value)
    }
}

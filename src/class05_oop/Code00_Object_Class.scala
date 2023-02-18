package class05_oop

/**
 * object 和 class 一些细节
 * @author HuanyuLee
 */
object XX {
    // 方法体外的语句，scala编译后将它放在了static静态代码块里，优先被执行
    println("main:: up...")
    def main(args: Array[String]): Unit = {
        println("main")
    }
    println("main:: down...")
}

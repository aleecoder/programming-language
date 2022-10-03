package class01_basics

/**
 * 伴生
 * @author HuanyuLee
 */
object Boy {
    private var name = "object::tom"

    def main(args: Array[String]): Unit = {
        val boy = new Boy()
        boy.printMsg()
    }
}

class Boy {
    var name = "class::tom"

    // object Boy 中私有的属性依然可以被访问
    def printMsg(): Unit = {
        println(s"${this.name}")
        println(s"${Boy.name}")
    }

}

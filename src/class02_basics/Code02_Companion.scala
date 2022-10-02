package class02_basics

/**
 * 伴生
 * @author HuanyuLee
 */
object Boy{
    private var name = "tom"

    def main(args: Array[String]): Unit = {

    }
}

class Boy{
    // object Boy 中私有的属性依然可以被访问
    println(s"${Boy.name}")
}

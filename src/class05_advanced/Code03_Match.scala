package class05_advanced

/**
 * 模式匹配
 * 类似于Java中的switch，但比它更强大
 * @author HuanyuLee
 */
object Code03_Match {
    def main(args: Array[String]): Unit = {
        val t6 = (1, 3.14, "scala", true, 'J',99)
        // 现在有一个需求，遍历t5中的每一个元素，打印其对应的类型
        // Java 中如何做？instanceof判断
        val iter = t6.productIterator
        iter.foreach {
            case i: Int if i > 50 => println(s"$i is Int and $i > 50")
            case d: Double => println(s"$d is Double")
            case s: String => println(s"$s is String")
            case b: Boolean => println(s"$b is Boolean")
            case c: Char => println(s"$c is Char")
            case _ => println("unknown")
        }

        /*
        val res = iter.map {
            case i: Int => println(s"$i is Int")
            case d: Double => println(s"$d is Double")
            case s: String => println(s"$s is String")
            case b: Boolean => println(s"$b is Boolean")
            case c: Char => println(s"$c is Char")
            case _ => println("unknown")
        }
        while (res.hasNext){
            println(res.next())
        }
         */
        /* 运行结果：
        注意，这里的()是case中println的返回值Unit，在while中，println将其打印
        1 is Int
        ()
        3.14 is Double
        ()
        scala is String
        ()
        true is Boolean
        ()
        J is Char
        ()
         */
    }
}

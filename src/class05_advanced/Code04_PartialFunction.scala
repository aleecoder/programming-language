package class05_advanced

/**
 * 偏函数
 * @author HuanyuLee
 */
object Code04_PartialFunction {
    case class Node()

    /**
     * input: Any
     * @return String
     */
    def f: PartialFunction[Any, String] = {
        case s: String => s"val is String $s"
        case i: Int => s"val is Int $i"
        case t: (Int, Int) => s"val is Tuple2 $t"
        case _ => "unknown"
    }

    def main(args: Array[String]): Unit = {
        println(s"f(12) = ${f(12)}")
        println(s"f(\"hello\") = ${f("hello")}")
        println(s"f(Node) = ${f(Node)}")
        println(s"f(1, 2) = ${f(1, 2)}")
        println(f(1, 2, 3)(2))  // f(1,2,3) 得到 unknown，它是String，然后取出下标为2的值，所以为 k
    }
}

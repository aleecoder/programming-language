package class04_collections

/**
 * 元组
 * 元组是一个可以容纳不同类型元素的类。 元组是不可变的
 * 当我们需要从函数返回多个值时，元组会派上用场
 * 范围 [Tuple1,Tuple22]
 * @author HuanyuLee
 */
object Code04_Tuple {
    def main(args: Array[String]): Unit = {
        // 两元素的Tuple，在Scala中描绘的是 k-v 键值对
        val t2 = Tuple2(11, "tuple")
        val t3 = Tuple3(11, "tuple", 3.14)
        val t4 = (1, 2, 3, 4)
        val t5 = ((a: Int) => Math.pow(a, a), 2, 3, (a: Int, b: Int) => Math.max(a, b), 5)

        // 取值，索引从1开始
        println(s"t2._1 = ${t2._1}")
        println(t5._1(4))
        println(t5._2)
        println(t5._4(100, 200))

        // Tuple没有foreach
        // 需要引入迭代器
        val tIter = t5.productIterator
        while (tIter.hasNext) {
            println(tIter.next())
        }
    }
}

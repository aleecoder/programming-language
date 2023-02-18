package class04_collections

import scala.collection.mutable

/**
 * 集合
 * @author HuanyuLee
 */
object Code03_Set {
    def main(args: Array[String]): Unit = {
        // 无序的、去重的
        // 集合中的元素并不会记录元素的插入顺序，而是以"哈希"方法对元素的值进行组织，因此可以快速地找到某个元素
        // immutable
        val set = Set[Int](1, 2, 3, 4, 5, 4, 3, 2, 1)
        set.foreach(println)
        println(s"set = ${set}")
        //缺省情况下创建的是不可变集
        var mySet = Set("Hadoop", "Spark")
        mySet += "Scala"        //Set(Hadoop, Spark, Scala)

        // mutable
        val set2 = mutable.Set[Int](11, 22, 33)
        set2.add(44)
        println(s"set2 = ${set2}")
    }
}

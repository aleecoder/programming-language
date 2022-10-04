package class04_collections

import scala.collection.mutable

/**
 * 集合
 * @author HuanyuLee
 */
object Code03_Set {
    def main(args: Array[String]): Unit = {
        // 无序的、去重的
        // immutable
        val set = Set[Int](1, 2, 3, 4, 5, 4, 3, 2, 1)
        set.foreach(println)
        println(s"set = ${set}")

        // mutable
        val set2 = mutable.Set[Int](11, 22, 33)
        set2.add(44)
        println(s"set2 = ${set2}")
    }
}

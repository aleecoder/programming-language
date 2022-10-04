package class04_collections

import scala.collection.mutable.ListBuffer

/**
 * 链表
 * @author HuanyuLee
 */
object Code02_List {
    def main(args: Array[String]): Unit = {
        // Scala中collections中有2个包：immutable、mutable
        // 默认的是不可变的immutable
        val list = List[Int](1, 2, 3, 4, 5, 4, 3, 2, 1)
        println(s"list = ${list}")
        //list.+=(2) // error
        list.foreach(println)

        // mutable
        // TODO: 学习scala数据集中的 ++  +=  ++:  :++  --  -=  :--  :--
        val list2 = new ListBuffer[Int]()
        list2.+=(11)
        list2.+=(22)
        println(s"list2 = ${list2}")
        list2.-=(22)
        println(s"list2 = ${list2}")

    }
}

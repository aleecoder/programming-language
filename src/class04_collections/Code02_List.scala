package class04_collections

import scala.collection.mutable.ListBuffer

/**
 * 列表
 * 列表具有递归的链表结构
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
        //不同于Java的java.util.List，Scala的List一旦被定义其值就不能改变，因此声明List时必须初始化
        var strList: List[Any] = List("BigData", 2, "Hadoop", "Spark")
        //列表有头部和尾部的概念
        //head返回的是列表的第一个元素的值
        val h: Any = strList.head
        //tail返回的是除第一个元素外的其它值构成的新列表
        val t: List[Any] = strList.tail

        //构造列表常用的方法是通过在已有列表前端增加元素，使用的操作符为::
        val otherList = "Apache"::strList   //List("Apache", "BigData", 2, "Hadoop", "Spark")
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

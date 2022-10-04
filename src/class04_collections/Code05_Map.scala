package class04_collections

import scala.collection.mutable

/**
 * 映射
 * @author HuanyuLee
 */
object Code05_Map {
    def main(args: Array[String]): Unit = {
        val map = Map[String, Int](("a", 1), "b" -> 2, "c" -> 3, ("a", 4))
        // 遍历
        map.foreach(println)
        // 获取键
        val keys = map.keys
        val keySet = map.keySet
        println(s"keys = ${keys}")
        println(s"keySet = ${keySet}")

        // 取值，返回的类型是 Some 或者 None，是一个Option
        val option = map.get("a") // Some(4)
        val option2 = map.get("d") // None

        // 优化了Java中对于map.get(key)是否为null的机械判断
        val a = map("a") // 4
        val value2 = map.getOrElse("a", "not exist")
        println(s"a = ${a}")

        val value = map.getOrElse("d", "not exist")
        println(s"value = ${value}")

        // mutable
        val set2 = mutable.Map[String, Int](("tom", 18), ("lili", 19))
        set2.put("wang ting", 20)
    }
}

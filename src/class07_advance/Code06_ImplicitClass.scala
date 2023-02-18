package class07_advance

import java.util
import java.util.Map.Entry

/**
 * 隐式转换 —— 隐式类
 * @author HuanyuLee
 */
object Code06_ImplicitClass {
    //private val list = new util.LinkedList[Int]()
    private val list = new util.ArrayList[Int]()
    list.addAll(util.Arrays.asList(1, 2, 3))
    // 假如新增了Set集合
    private val set = new util.HashSet[Int]()
    set.addAll(util.Arrays.asList(11, 22, 33))
    // 假如又新增了Map集合
    private val map = new util.HashMap[Int, String]()
    map.put(111, "okk")
    map.put(222, "haha")


    implicit def c[T](c: util.Collection[T]): XXX[T] = {
        new XXX[T](c.iterator())
    }

    implicit def m[K, V](m: util.Map[K, V]): XXX[Entry[K, V]] = {
        new XXX[Entry[K, V]](m.entrySet().iterator())
    }

    // 这个类不需要再更改!!!可以处理各种类型的集合
    implicit class XXX[T](iter: util.Iterator[T]) {
        def foreach(f: T => Unit): Unit = {
            while (iter.hasNext) {
                f(iter.next())
            }
        }
    }

    def main(args: Array[String]): Unit = {
        //list.foreach(println)
        //set.foreach(println)
        map.foreach(println)
    }
}

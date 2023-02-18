package class04_collections

import scala.collection.{AbstractIterator, StrictOptimizedLinearSeqOps}

/**
 * 迭代器的源码分析
 * @author HuanyuLee
 */
object Code06_Iterator {
    //Iterable有两个方法返回迭代器：grouped和sliding
    //这些迭代器返回的不是单个元素，而是原容器元素的全部子序列
    //这些最大的子序列作为参数传递给这些方法
    //grouped方法返回元素的增量分块
    //sliding方法生成一个滑动元素的窗口
    //两者之间的差异通过REPL的作用能够清楚的看出
    val xs: List[Int] = List(1, 2, 3, 4, 5)
    val git: Iterator[List[Int]] = xs grouped 3
    git.next()  //List(1, 2, 3)
    git.next()  //List(4, 5)
    
    val sit: Iterator[List[Int]] = xs sliding 3
    sit.next()  //List(1, 2, 3)
    sit.next()  //List(2, 3, 4)
    sit.next()  //List(3, 4, 5)


    def main(args: Array[String]): Unit = {
        // list是真正的数据集，有数据
        val list = List[String]("hello world", "hello scala", "good idea")

        val iter = list.iterator
        val iterMap = iter.flatMap(_.split(" ")).map((_, 1))
    }
}

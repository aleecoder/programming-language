package class04_collections

/**
 * Scala的艺术
 * @author HuanyuLee
 */
object Art {
    // scala为什么要将集合设置成mutable和immutable两类？
    // 数据集是数据，是只发生一次计算吗？
    // 数据是珍贵的，可能来自IO，可能是某些计算的结果，它可能会参加不同种类的计算
    // 数据的中间状态有时也是有意义的，是数据的有状态性
    // 流式计算，所以数据应该是不可变的，而不应该是可变的
    def main(args: Array[String]): Unit = {
        val list = List[Int](1, 2, 3, 4, 5)
        //val list = Array[Int](1, 2, 3, 4, 5)
        println(s"list = ${list}")

        //val list2 = list.map((x: Int) => x * 10)
        val list2 = list.map(_ * 10)
        println(s"list2 = ${list2}")

        // list 并没有受影响，还可以继续计算
        val list3 = list.map(_ + 10)

        // 单词拆解
        val listStr = List[String]("hello world", "hello scala", "good idea")
        /*
        过程分析：
            1、val flatMap = listStr.flatMap((x: String) => x.split(" "))
            flatMap是扁平化的
            得到的中间结果：flatMap = List(hello, world, hello, scala, good, idea)
            2、val mapList = flatMap.map((_, 1))
            Tuple2可以做键值对
            得到的中间结果：mapList = List((hello,1), (world,1), (hello,1), (scala,1), (good,1), (idea,1))
         */
        val mapList = listStr.flatMap(_.split(" ")).map((_, 1))
        println(mapList)
        // TODO:以上代码有什么问题？
        // 内存扩大N倍，每一步计算内存都留有对象的数据
        // TODO:有没有什么现成的技术解决 数据计算中间状态占用内存 这一问题？
        // 迭代器计算 iterator!!!

        // TODO: 什么是迭代器？为什么会有迭代器这种设计模式？
        // 迭代器是解决数据迭代这一问题的。在多线程、高并发的环境下会有什么问题？
        // 首先，迭代数据，需要一个指针，用来记录上一步迭代到哪里
        // 其次，迭代器里不存数据，当多个线程进行访问数据的时候，给到它们各自指针
        val iter = listStr.iterator
        val iterMap = iter.flatMap(_.split(" ")).map((_, 1))
        iterMap.foreach(println)
    }
}

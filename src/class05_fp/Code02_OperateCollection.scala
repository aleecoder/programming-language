package class05_fp

/**
 * 针对集合的操作
 * @author HuanyuLee
 */
object Code02_OperateCollection {
    val list = List(1, 2, 3, 4, 5)
    val books = List("Hadoop", "Hive", "HDFS")
    val university = Map("XMU" -> "Xiamen University", "THU" -> "Tsinghua University", "PKU" -> "Peking University")
    //（1）遍历操作
    list.foreach(println)
    //list foreach println
    university.foreach(x => println(x._1 + ":" + x._2))

    //（2）map操作和flatMap操作
    //map操作是针对集合的典型变换操作，它将某个函数应用到集合中的每个元素并产生一个结果集合

    //books.map(x => x.toUpperCase)
    books.map(_.toUpperCase)

    //flatMap是map的扩展
    //在flatMap中，传入一个函数，该函数对每个输入都会返回一个集合（而不是一个元素）
    //然后，flatMap把生成的多个集合"拍扁"成为一个集合

    //books.flatMap(x => x.toList)
    books.flatMap(_.toList)

    //上面的flatMap执行时，会把books中的每个元素都调用toList，生成List[Char]
    //最终，多个Char的集合被"拍扁"成一个集合
    //List[Char] = List(H, a, d, o, o, p, H, i, v, e, H, D, F, S)

    //（3）filter操作
    //遍历一个集合并从中获取满足指定条件的元素组成一个新的集合，通过filter操作来实现
    val universityOfXiamen: Map[String, String] = university.filter(x => x._2.contains("Xiamen"))
    val universityOfP: Map[String, String] = university.filter(x => x._2.startsWith("P"))

    //（4）reduce操作
    //使用reduce这种二元操作对集合中的元素进行规约
    //直接使用reduce，默认采用的是reduceLeft
    list.reduceLeft(_ + _)
    list.reduceRight(_ + _)

    //（5）fold操作
    //折叠（fold）操作和reduce（归约）操作比较类似
    //fold操作需要从一个初始的"种子"值开始，并以该值作为上下文，处理集合中的每个元素
    list.fold(10)(_ * _)
}

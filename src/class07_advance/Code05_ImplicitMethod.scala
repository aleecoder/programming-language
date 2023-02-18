package class07_advance

import java.util

/**
 * 隐式转换 —— 隐式方法
 * 隐式转换它可以再不修改原有代码的基础上，保持原有的编程风格，无限的扩展你的需求！！！
 * @author HuanyuLee
 */
object Code05_ImplicitMethod {
    // 想象这样一个场景：
    // 别人写好了一个类、一个方法，打包给你，你如何不修改人家源码的情况下，扩充自己的需求？
    // 比如 Java中的LinkedList
    //private val list = new util.LinkedList[Int]()
    private val list = new util.ArrayList[Int]()
    list.addAll(util.Arrays.asList(1, 2, 3, 4, 5))
    // 当你学过Scala时，你会自然而然的想，list是一个数据集，它应该有foreach、flatMap、map等通用的方法
    // 然而事实上，它没有！！！
    // 可我就想让你有，怎么办？？？你又不可能去改Java的源代码！！！
    // TODO:我期待的样子是：list.foreach(println)

    // 第一种方法，定义方法，Java的思维
    def foreach[T](list: util.List[T], f: T => Unit): Unit = {
        val iter = list.iterator()
        while (iter.hasNext) {
            f(iter.next())
        }
    }

    // 第二种方法，定义包装类，Java的思维
    class XXX[T](list: util.List[T]) {
        def foreach(f: T => Unit): Unit = {
            val iter = list.iterator()
            while (iter.hasNext) {
                f(iter.next())
            }
        }
    }

    // 第三种方法，隐式转换！！！
    implicit def g[T](list: util.List[T]): XXX[T] = {
        new XXX[T](list)
    }

    def main(args: Array[String]): Unit = {
        // 调用第一种方法，虽然可以完成功能，但是和我们期待的样子还不一样！！！
        //foreach(list,println)

        // 调用第二种方法，虽然更接近了，但是和我们期待的样子还不一样！！！
        //val x = new XXX[Int](list)
        //x.foreach(println)

        // 第三种方法，成功！！！
        // 必须要认清一个事实：Java的list里没有foreach方法，在Java中这么写肯定报错
        // 但是这些代码最终是要运行在JVM上的
        // 1、Scala编译器发现 list.foreach(println) 它有bug，没有这个语法啊
        // 2、但是Scala不着急报错，它先去寻找有没有implicit定义的方法，且方法的参数正好是list的类型
        // 3、如果找到了，在编译期完成之前程序员手动 new XXX[Int](list) 的过程
        list.foreach(println)
    }
}

package class03_process_control

/**
 * 流程控制
 * @author HuanyuLee
 */
object Code01_If_While_For {
    def main(args: Array[String]): Unit = {
        val a = Math.random()
        // if-else 分支与 Java一样
        if (a <= 0.5) {
            println(s"a = ${a}")
        } else {
            println("error")
        }
        // while、do-while与Java一样
        // 区别在于Scala中的"++、--"是函数，不是Java中的自增、自减运算符
        var b = 0.1
        do {
            b = Math.random() * 10
            b -= 1
        } while (b >= 5)
        println(s"b = ${b}\n")

        // for 与 Java大不一样
        // Scala中没有像Java这样基于步进的for循环  for (int i = 0; i < 10; i++){}
        // Scala只支持基于增强（迭代）的for循环
        val sets = 1 to 10 // [1,10]
        val seq = 1 to(10, 2) // [1,10] 步长2
        val range = 1 until (10) // [1,10)

        // Scala没有break、continue关键字，但是可以在循环条件中加判断
        for (i <- 1 to 10 if i % 2 == 0) {
            println(i)
        }
        // 嵌套for循环
        println("--------------- 99乘法表 ---------------")
        // 以往的写法
        /*for (i <- 1 to 9) {
            for (j <- 1 to 9) {
                if (j <= i) print(s"$j * $i = ${i * j}\t")
                if (j == i) println()
            }
        }*/
        // Scala的写法
        var count = 0
        for (i <- 1 to 9; j <- 1 to 9 if j <= i) { // 为了减少CPU的判断，加入守卫，优化代码
            count += 1
            if (j <= i) print(s"$j * $i = ${i * j}\t")
            if (j == i) println()
        }
        println(s"count = ${count}") // 加入守卫：45；不加守卫：81

        // 收集for循环变成集合，使用yield关键字
        val value = for (i <- 1 to 5) yield {
            // 业务逻辑
            var x = 10
            i + x // 回收的变量
        }
        value.foreach(println)
    }
}

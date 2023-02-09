package class01_basics

import scala.io.StdIn._

/**
 * 控制台输入输出语句
 * @author HuanyuLee
 */
object Code03_Input {
    def main(args: Array[String]): Unit = {
        val i = readInt()
        val f = readFloat()
        val str = readLine("please input your name: ")
        //Scala还带有C语言风格的格式化字符串的printf()函数
        printf("My name is %s. I am %d years old and %.1f kg.\n", str, i, f)
    }
}

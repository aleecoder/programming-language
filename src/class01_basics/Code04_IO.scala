package class01_basics

import java.io.PrintWriter
import scala.io.Source

/**
 * 读写文件
 * @author HuanyuLee
 */
object Code04_IO {
    def main(args: Array[String]): Unit = {
        //写入文件
        val out = new PrintWriter("output.txt")
        for (i <- 1 to 5) out.println(i)
        out.close()
        //读取文件
        val input = Source.fromFile("output.txt")
        val lines = input.getLines()
        for (line <- lines) println(line)
    }
}

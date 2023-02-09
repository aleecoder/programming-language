package class01_basics

import java.io.{FileNotFoundException, FileReader, IOException}

/**
 * 异常处理
 * Scala不支持Java中的『受异常处理』（checked exception），将所有异常都当作『不受检异常』（运行时异常）
 * Scala扔使用try-catch结构来捕获异常
 * @author HuanyuLee
 */
object Code05_Exception {
    def main(args: Array[String]): Unit = {
        try {
            val f = new FileReader("input.txt")
        } catch {
            case ex: FileNotFoundException => println("Missing file exception")
            case ex: IOException => println("IO Exception")
        }
    }
}

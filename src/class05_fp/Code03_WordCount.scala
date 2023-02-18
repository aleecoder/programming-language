package class05_fp

import java.io.File
import scala.io.Source

/**
 * 词频统计
 * @author HuanyuLee
 */
object Code03_WordCount {
    def main(args: Array[String]): Unit = {
        val listFiles = new File("data").listFiles
        listFiles.foreach(file => {
            val data = Source.fromFile(file)
            data.getLines().toList
              .flatMap(_.split(" "))
              .map((_, 1))
              .groupBy(_._1)
              .map(x => (x._1, x._2.size))
              .toList
              .sortBy(_._2).reverse
              .foreach(println)
        })
    }
}
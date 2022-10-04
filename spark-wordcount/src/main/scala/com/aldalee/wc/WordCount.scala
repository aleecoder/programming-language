package com.aldalee.wc

import org.apache.spark.{SparkConf, SparkContext}

/**
 * Spark实现WordCount
 * @author HuanyuLee
 */
object WordCount {
    def main(args: Array[String]): Unit = {
        val conf = new SparkConf().setAppName("WordCount").setMaster("local[*]")
        val sc = new SparkContext(conf)
        val fileRDD = sc.textFile("data/data.txt")
        fileRDD.flatMap(_.split(" "))
          .map((_, 1))
          .reduceByKey(_ + _)
          .sortBy(_._2)
          .foreach(println)
    }
}

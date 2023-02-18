package com.aldalee.wc;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.api.java.function.VoidFunction;
import scala.Tuple2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Java实现WordCount
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class WordCountJava {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("WordCountJava").setMaster("local[*]");
        try (JavaSparkContext jsc = new JavaSparkContext(conf)) {
            JavaRDD<String> rdd = jsc.textFile("data/data.txt");
            rdd.flatMap((FlatMapFunction<String, String>) line
                            -> Arrays.asList(line.split(" ")).iterator()
                    )
                    .mapToPair((PairFunction<String, String, Integer>) word
                            -> new Tuple2<>(word, 1)
                    ).reduceByKey((Function2<Integer, Integer, Integer>) Integer::sum)
                    .sortByKey(Comparator.reverseOrder())
                    .foreach((VoidFunction<Tuple2<String, Integer>>) value
                            -> System.out.printf("(%s,%d)\n", value._1, value._2)
                    );
        }
    }
}

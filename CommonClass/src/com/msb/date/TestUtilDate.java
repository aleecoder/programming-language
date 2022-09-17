package com.msb.date;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/29  19:17
 * @Description: java.util.Date
 * @version: 1.0
 */
public class TestUtilDate {
    static long getProgramRunTime() throws IOException {
        long startTime = System.currentTimeMillis();
        File f = new File("demo.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 100000; i++) {
            bw.write((char)i);
        }
        bw.close();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("CST = " + date);
        System.out.println("GMT = " + date.toGMTString());     // 过期方法. GMT和 CST相差 8小时
        System.out.println("this date minus 1900: " + date.getYear());    // the year represented by this date, minus 1900
        System.out.println("the month: "+ date.getMonth());    // The value returned is between 0 and 11, with the value 0 representing January.
        System.out.println("milliseconds since January 1, 1970, 00:00:00 GMT:"
                + date.getTime()); //the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this date.
        /*
        public static native long currentTimeMillis();
            (1) static修饰的，推荐使用 比如：可以计算程序运行时间
            (2) 本地方法。为什么没有方法体？因为这个方法的具体实现不是通过java写的
            (3) 一般会去衡量一些算法所用的时间
         */
        try {
            System.out.println("Run time of the program: " + getProgramRunTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

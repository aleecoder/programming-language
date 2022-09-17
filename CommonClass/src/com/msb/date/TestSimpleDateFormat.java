package com.msb.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/29  21:02
 * @Description: 日期格式化 String 类型的日期和 Date之间的转换
 * @version: 1.0
 */
public class TestSimpleDateFormat {
    /** class SimpleDateFormat extends DateFormat
     *  abstract class DateFormat extends Format
    */  
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String to Date
        try {
            Date parse = df.parse("2020-01-01 12:00:01");
            System.out.println("parse = " + parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // Date to String
        String format = df.format(new Date());
        System.out.println("format = " + format);
    }
}

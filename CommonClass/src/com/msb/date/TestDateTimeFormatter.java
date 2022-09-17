package com.msb.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/4  23:49
 * @Description: JDK1.8新增日期 API: DateTimeFormatter
 * @version: 1.0
 */
public class TestDateTimeFormatter {

    public static void fun(LocalDateTime localDateTime, DateTimeFormatter df,String str){
        // LocalDateTime-->String
        String format = df.format(localDateTime);
        System.out.println("format = " + format);
        // String--->LocalDateTime
        TemporalAccessor parse = df.parse(str);
        System.out.println("parse = " + parse);
        System.out.println();
    }
    /** 方法一: 预定义的标准格式。
     * 如: ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;IS0_LOCAL_TIME
     *
     * 方法二: 本地化相关的格式。
     * 如: ofLocalizedDateTime()
     * 参数：FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT
     *
     * 方法三: 自定义的标准格式。[重点，以后常用]
     * 如: ofPattern( "yyyy-MM-dd hh:mm:ss")
    */

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        // 方法一: 预定义的标准格式
        DateTimeFormatter df1 = DateTimeFormatter.ISO_DATE_TIME;
        String str1 = "2022-02-05T00:42:49.96";
        fun(localDateTime,df1,str1);
        // 方法二: 本地化相关的格式
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        // FormatStyle.LONG: 2022年2月5日 上午12时37分18秒
        // FormatStyle.MEDIUM: 2022-2-5 0:38:02
        // FormatStyle.SHORT: 22-2-5 上午12:36

        String str2 = "20-6-15 下午3:18";
        fun(localDateTime,df2,str2);
        // 方法三: 自定义的标准格式
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str3 = "2022-02-05 12:42:49";
        fun(localDateTime,df3,str3);
    }
}
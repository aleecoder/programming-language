package com.msb.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/4  23:26
 * @Description: JDK1.8新增日期 API: LocalDate、LocalTime、LocalDateTime
 * @version: 1.0
 */
public class TestLocalDate {
    public static void main(String[] args) {
        // 实例化: now() 获取当前的日期，时间，日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("--------------------------------------------");

        // of() 设置指定的日期，时间，日期+时间
        LocalDate date = LocalDate.of(2019, 1, 1);
        LocalTime time = LocalTime.of(12, 1, 3);
        LocalDateTime dateTime = LocalDateTime.of(2018, 6, 7, 8, 1, 1);

        System.out.println("date = " + date);
        System.out.println("time = " + time);
        System.out.println("dateTime = " + dateTime);
        System.out.println("--------------------------------------------");
        /*
        LocalDate,LocalTime用的不如 LocalDateTime多
        LocalDateTime 常用方法
         */
        // (1) 常用的 get()
        System.out.println("getYear = " + localDateTime.getYear());
        System.out.println("getDayOfYear = "+ localDateTime.getDayOfYear());
        System.out.println("getMonth = "+ localDateTime.getMonth());
        System.out.println("getMonthValue = " + localDateTime.getMonthValue());
        System.out.println("getDayOfMonth = " + localDateTime.getDayOfMonth());
        System.out.println("getDayOfWeek = "+ localDateTime.getDayOfWeek());
        System.out.println("getHour = "+ localDateTime.getHour());
        System.out.println("getMinute = "+ localDateTime.getMinute());
        System.out.println("getSecond = "+ localDateTime.getSecond());
        System.out.println("--------------------------------------------");

        // (2) with() 不可变性
        LocalDateTime withMonth = localDateTime.withMonth(8);
        System.out.println("withMonth = " + withMonth);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("--------------------------------------------");

        // (3) 加、减操作
        LocalDateTime plusMonths = localDateTime.plusMonths(8);
        System.out.println("plusMonths = " + plusMonths);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("--------------------------------------------");

        LocalDateTime minusMonths = localDateTime.minusMonths(5);
        System.out.println("minusMonths = " + minusMonths);
        System.out.println("localDateTime = " + localDateTime);
    }
}

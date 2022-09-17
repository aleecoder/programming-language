package com.msb.date;

import java.util.Calendar;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/4  12:55
 * @Description: Calendar
 * @version: 1.0
 */
public class TestCalendar {
    // Calendar get方法
    public static void get(Calendar cal){
        System.out.println("YEAR = " + cal.get(Calendar.YEAR));
        System.out.println("MONTH = " + cal.get(Calendar.MONTH));    // 从 0开始
        System.out.println("DATE = " + cal.get(Calendar.DATE));
        System.out.println("DAY_OF_WEEK = " + cal.get(Calendar.DAY_OF_WEEK));  // 从周日开始 1
        System.out.println("MaxDATE = " + cal.getActualMaximum(Calendar.DATE));    // 获取当月日期的最大天数
        System.out.println("MinDATE = " + cal.getActualMinimum(Calendar.DATE));    // 获取当月日期的最小天数
    }
    public static void main(String[] args) {
        // abstract class Calendar
        // class GregorianCalendar extends Calendar
        // 两种方法创建 Calendar对象
        // (1) Calendar cal = Calendar.getInstance();
        // (2) Calendar cal = new GregorianCalendar();
        Calendar cal = Calendar.getInstance();
//        System.out.println("cal = " + cal);

        // 常用方法
        // (1) get方法,传入参数: Calendar中定义的常量
        get(cal);
        // (2) set方法: 可以改变Calendar中的内容
        cal.set(Calendar.YEAR,2022);
        cal.set(Calendar.MONTH,0);
        cal.set(Calendar.DATE,2);
        System.out.println("--------------------------");
        get(cal);
        // String to Calendar
        System.out.println("--------------------------");
        java.sql.Date date = java.sql.Date.valueOf("2021-3-2");
        cal.setTime(date);
        get(cal);
    }
}

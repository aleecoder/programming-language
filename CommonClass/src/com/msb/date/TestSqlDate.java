package com.msb.date;

import java.sql.Date;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/29  20:37
 * @Description: java.sql.Date
 * @version: 1.0
 */
public class TestSqlDate {
    /** java.util.Date(父类)转向java.sql.Date(子类)
    * @param:
    */
    static void test_utilToSql(){
        java.util.Date date = new Date(1643459037174L);
        System.out.println("date = " + date);
        // 方式1: 向下转型
        Date date1 = (Date) date;
        System.out.println("date1 = " + date1);
        // 方法2: 利用构造器
        Date date2 = new Date(date.getTime());
        System.out.println("date2 = " + date2);
    }
    /** java.sql.Date(子类)转向java.util.Date(父类)
    * @param:
    */
    static void test_sqlToUtil(){
        java.util.Date date = new Date(1643459037174L);
        System.out.println("date = " + date);
    }
    /** 测试valueOf方法 将String类型的日期转成java.sql.Date类型的对象
    * @param:
    */
    static void test_valueOf(){
        Date date = Date.valueOf("2022-1-1");
        System.out.println("date = " + date);
    }
    public static void main(String[] args) {
//        Date date = new Date(1643459037174L);
        Date date = new Date(System.currentTimeMillis());
        System.out.println("date = " + date);
//        test_sqlToUtil();
//        test_utilToSql();
//        test_valueOf();
    }
}
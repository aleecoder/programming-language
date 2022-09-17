package com.msb.enumfun;


import com.msb.myenum.MyInterface;
import com.msb.myenum.Season;

/**
 * @author HuanyuLee
 * @date 2022/3/15
 */
public class SeasonTest {

    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        /*
         * toString方法
         */
        System.out.println(season);
        System.out.println("// ============================================");
        /*
         * values方法: 返回枚举类对象的数组
         */
        Season[] values = Season.values();
        for (Season value: values) {
            System.out.println(value);
        }
        /*
         * valueOf方法: 通过对象名获取这个枚举对象
         * 对象名字不匹配会抛出异常
         */
        System.out.println("// ============================================");
        System.out.println(Season.valueOf("AUTUMN"));

        System.out.println("// ============================================");

        /*
         * 枚举类实现接口
         */
        Season s = Season.WINTER;
        MyInterface mi = () -> System.out.println("这是show方法实现......");
        s.show();
        mi.show();
    }

}

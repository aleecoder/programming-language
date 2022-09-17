package com.msb.math;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/5  11:32
 * @Description: Math类
 * @version: 1.0
 */
public class TestMath {
    public static void main(String[] args) {
        // 常用属性
        System.out.println(Math.PI);
        System.out.println(Math.E);
        // 常用方法
        System.out.println("随机数: " + Math.random());    // [0,1)
        System.out.println("向上取整: " + Math.ceil(9.1));
        System.out.println("向下取整: " + Math.floor(9.1));
        System.out.println("四舍五入: " + Math.round(4.5));
    }
}
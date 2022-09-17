package com.msb.oop.inner;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  23:05
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(">>> 调用外部类的方法......");
        outer.fun();

        // 静态的成员内部类创建对象
        System.out.println(">>> 静态的成员内部类创建对象......");
        Outer.SInterior sInterior = new Outer.SInterior();
        sInterior.sin_fun();

        // 非静态的成员内部类创建对象
        System.out.println(">>> 非静态的成员内部类创建对象......");
        Outer.Interior interior = outer.new Interior();
        interior.in_fun();
    }
}

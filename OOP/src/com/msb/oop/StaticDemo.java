package com.msb.oop;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/16  13:59
 * @Description: static
 * @version: 1.0
 */
public class StaticDemo {
    int id;
    static int sid;
    public void fun1(){
        System.out.println(id);
        System.out.println(sid);
    }
    static public void fun2(){
//        System.out.println(this.id);    //在静态方法中不能使用 this关键字
//        fun1();     // 在静态方法中不能访问非静态的方法
//        System.out.println(id);     // 在静态方法中不能访问非静态的属性
        System.out.println(sid);
    }
    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
        sd.fun1();      //非静态的方法可以用对象名.方法名去调用
        StaticDemo.fun2();  // 静态的方法可以用对象名.方法名去调用；也可以用类名.方法名(官方推荐)
        sd.fun2();
    }
}

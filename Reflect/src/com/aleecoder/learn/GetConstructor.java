package com.aleecoder.learn;

import java.lang.reflect.Constructor;

/**
 * 通过字节码信息获取构造器
 * @author HuanyuLee
 * @date 2022/3/17
 */
public class GetConstructor {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("com.aleecoder.learn.test.Student");
        /*
         * 通过字节码信息获取构造器
         * getConstructors()只能获取当前运行时 类中被public修饰的构造器
         * getConstructor() 默认获取被public修饰的空参构造器 也可以传入被public修饰的、指定参数类型的字节码
         *
         * getDeclaredConstructors() 获取运行时类的全部修饰符的构造器
         * getDeclaredConstructor() 默认获取被public修饰的空参构造器 也可以传入指定参数类型的字节码
         */
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor<?> c = clazz.getConstructor();
        System.out.println("c = " + c);

        Constructor<?> c2 = clazz.getConstructor(int.class,double.class,double.class);
        System.out.println("c2 = " + c2);

        System.out.println("===================================================");

        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor<?> dc = clazz.getDeclaredConstructor();
        System.out.println("dc = " + dc);
    }
}

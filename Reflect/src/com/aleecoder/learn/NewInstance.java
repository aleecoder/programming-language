package com.aleecoder.learn;

import java.lang.reflect.Constructor;

/** 根据字节码信息创建对象
 * @author HuanyuLee
 * @date 2022/3/17
 */
public class NewInstance {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("com.aleecoder.learn.test.Student");
        Constructor<?> c = clazz.getConstructor();

        // 通过构造器创建对象
        Object o = c.newInstance();
        System.out.println("o = " + o);

        // 直接通过字节码创建对象
        Object o1 = clazz.newInstance();
        System.out.println("o1 = " + o1);
    }
}

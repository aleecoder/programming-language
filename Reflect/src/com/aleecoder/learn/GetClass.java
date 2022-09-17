package com.aleecoder.learn;

import com.aleecoder.learn.test.Person;

/**
 * 获取字节码信息的4种方式
 * @author HuanyuLee
 * @date 2022/3/17
 */

public class GetClass {
    public static void main(String[] args) throws Exception {
        // 通过对象调用getClass方法获取
        Person p = new Person();
        Class<? extends Person> pClass = p.getClass();
        System.out.println("pClass = " + pClass);

        // 通过内置的class属性
        Class<Person> pClass2 = Person.class;
        System.out.println("pClass2 = " + pClass2);

        // 利用类的加载器
        ClassLoader loader = GetClass.class.getClassLoader();
        final Class<?> pClass3 = loader.loadClass("com.aleecoder.learn.test.Person");
        System.out.println("pClass4 = " + pClass3);

        // 调用Class类提供的 forName静态方法   最常用
        Class<?> pClass4 = Class.forName("com.aleecoder.learn.test.Person");
        System.out.println("pClass4 = " + pClass4);
    }
}

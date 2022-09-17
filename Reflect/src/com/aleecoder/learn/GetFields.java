package com.aleecoder.learn;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 根据字节码信息获取属性
 * @author HuanyuLee
 * @date 2022/3/20
 */
public class GetFields {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("com.aleecoder.learn.test.Student");
        /*
         * 获取属性
         * getFields(): 获取运行时类和其父类中被public修饰的属性
         */
        Field[] fields = clazz.getFields();
        for (Field field: fields) {
            System.out.println(field);
        }

        /*
         * 获取属性
         * getDeclaredFields(): 获取运行时类中所有的属性
         */
        System.out.println();

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field: declaredFields) {
            System.out.println(field);
        }

        Field score = clazz.getDeclaredField("score");

        /*
         * 获取属性的具体结构
         * 1. 获取修饰符
         * 2. 获取数据类型
         * 3. 获取名字
         */
        System.out.println();

        int modifiers = score.getModifiers();
        String s = Modifier.toString(modifiers);
        System.out.println("s = " + s);

        Class<?> type = score.getType();
        System.out.println("type = " + type);
        String name = score.getName();
        System.out.println("name = " + name);

        /*
         * 为属性赋值
         * :
         */

        Object o = clazz.newInstance();
        score.setAccessible(true);
        score.set(o,98.2);
        System.out.println(o);
    }
}

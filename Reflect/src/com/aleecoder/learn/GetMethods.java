package com.aleecoder.learn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 根据字节码信息获取方法和调用方法
 * @author HuanyuLee
 * @date 2022/3/20
 */
public class GetMethods {
    public static void main(String[] args) throws Exception{
        final Class<?> clazz = Class.forName("com.aleecoder.learn.test.Student");


        /*
         * getMethods(): 获取运行时类和其父类中所有被public修饰的方法
         */
        final Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

        /*
         * getDeclaredMethods(): 获取运行时类中所有的方法
         */
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        // 获取指定的方法
        Method showInfo = clazz.getDeclaredMethod("showInfo");
        System.out.println("showInfo = " + showInfo);
        Method showInfo1 = clazz.getMethod("showInfo", int.class);
        System.out.println("showInfo1 = " + showInfo1);

        /*
         * 获取方法的具体结构
         * 1. 获取名字
         * 2. 获取修饰符
         * 3. 获取返回值
         * 4. 获取参数列表
         * 5. 获取注解
         * 6. 获取异常
         */
        System.out.println(showInfo.getName());
        System.out.println(Modifier.toString(showInfo.getModifiers()));
        System.out.println(showInfo.getReturnType());
        Class<?>[] parameterTypes = showInfo1.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        final Annotation[] annotations = showInfo.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        final Class<?>[] exceptionTypes = showInfo.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        // 调用方法
        final Object o = clazz.newInstance();
        showInfo.invoke(o);
        showInfo1.invoke(o, 1);
    }
}

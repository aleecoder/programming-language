package com.msb.anno;

import com.msb.define.MyAnnotation;

/**
 * 文档相关的注解
 * 自定义注解
 *
 * @author HuanyuLee
 * @date 2022/3/15
 */
@MyAnnotation
public class Person {
    /**
     * 这个方法的功能
     *
     * @param var 变量
     * @return int
     * @throws RuntimeException 运行时异常
     * @see Student
     */
    public int function(int var) {
        new Student();
        if (var > 100) {
            throw new RuntimeException();
        }
        return var;
    }
}

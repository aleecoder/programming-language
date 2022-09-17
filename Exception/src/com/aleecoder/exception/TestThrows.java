package com.aleecoder.exception;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/28  18:48
 * @Description:
 * @version: 1.0
 */
public class TestThrows {
    static void throw1() throws IllegalAccessException {
        System.out.println("Inside throw1 . ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) throws IllegalAccessException {
        throw1();
    }
}

package com.aleecoder.exception;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/28  15:49
 * @Description:
 * @version: 1.0
 */
public class TestTry {
    public static void main(String[] args) {
        try {
            try {
                Class.forName("com.aleecoder.exception.TestTry").newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

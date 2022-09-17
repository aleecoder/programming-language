package com.msb.string;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/9  0:16
 * @Description:
 * @version: 1.0
 */
public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        // 线程安全
        /*
        public synchronized StringBuffer append(String str) {
            toStringCache = null;
            super.append(str);
            return this;
        }
         */
    }
}

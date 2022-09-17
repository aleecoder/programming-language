package com.msb.random;

import java.util.Random;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/5  14:17
 * @Description: Random
 * @version: 1.0
 */
public class TestRandom {
    public static void main(String[] args) {
        Random r1 = new Random(System.currentTimeMillis());
        System.out.println("r1 = " + r1.nextInt());

        Random r2 = new Random();   // 调用无参数构造器，实际底层还是调用了带参构造器
        System.out.println("r2 = " + r2.nextInt(10));   // 在 [0,指定值)之间均匀分布的 int 值
        System.out.println("r2 = " + r2.nextDouble());  // 在 0.0 和 1.0 之间均匀分布的 double 值
    }
}

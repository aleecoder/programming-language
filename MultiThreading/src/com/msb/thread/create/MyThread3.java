package com.msb.thread.create;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * 方式3 实现 Callable 接口
 * @author HuanyuLee
 * @date 2022/3/10
 */
public class MyThread3 implements Callable<Integer> {
    /**
     * 实现Callable接口，可以不带泛型，如果不带泛型，那么call方式的返回值就是Object类型
     * 方法有返回值，可以抛出异常
     * @return java.lang.Integer
     */
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}

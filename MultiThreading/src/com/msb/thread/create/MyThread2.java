package com.msb.thread.create;

/**
 * 方式 2 实现Runnable接口
 * @author HuanyuLee
 * @date 2022/3/10
 */
public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " --> " +i);
        }
    }
}

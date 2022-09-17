package com.msb.thread.create;

/**
 * 方式 1 继承 Thread类
 * @author HuanyuLee
 * @date 2022/3/10
 */
public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " --> " +i);
        }
    }
}


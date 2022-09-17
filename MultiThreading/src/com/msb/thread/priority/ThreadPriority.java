package com.msb.thread.priority;

/**
 * 线程优先级
 * @author HuanyuLee
 * @date 2022/3/10
 */
public class ThreadPriority {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.setPriority(1);
        t1.start();
        Thread t2 = new Thread(new Thread2());
        t2.setPriority(10);
        t2.start();
    }
}
class Thread1 extends Thread{
    int size = 10;
    @Override
    public void run() {
        for (int i = 0; i < size; i++) {
            System.out.println("Thread-1");
        }
    }
}
class Thread2 implements Runnable{
    int size = 10;
    @Override
    public void run() {
        for (int i = 0; i < size; i++) {
            System.out.println("Thread-2");
        }
    }
}
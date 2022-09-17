package com.msb.thread.join;

/**
 * 当一个线程调用量 join方法，这个线程就会被先执行，执行完毕后才可以去执行其他线程
 * @author HuanyuLee
 * @date 2022/3/10
 */
public class ThreadJoin {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("MainThread");
            if (i == 5){
                Thread t = new Thread(()->{
                    for (int j = 0; j < 10; j++) {
                        System.out.println(Thread.currentThread().getName());
                    }
                });
                t.start();
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

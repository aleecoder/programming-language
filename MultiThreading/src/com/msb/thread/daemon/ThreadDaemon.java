package com.msb.thread.daemon;

/**
 * 伴随线程
 * @author HuanyuLee
 * @date 2022/3/10
 */
public class ThreadDaemon extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Thread --> " + i);
        }
    }
}
class Test{
    public static void main(String[] args) {
        ThreadDaemon t = new ThreadDaemon();
        // 设置伴随线程  注意: 先设置，再启动
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main --> " + i);
        }
    }
}

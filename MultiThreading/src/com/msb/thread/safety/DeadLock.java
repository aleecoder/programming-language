package com.msb.thread.safety;

/**
 * 死锁
 * @author HuanyuLee
 * @date 2022/3/13
 */
public class DeadLock implements Runnable{
    public int flag = 1;
    static final Object O1 = new Object();
    static final Object O2 = new Object();

    @Override
    public void run(){
        System.out.println("flag = " + flag);
        // 当flag==1锁住o1
        if (flag == 1) {
            synchronized (O1) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 只要锁住o2就完成
                synchronized (O2) {
                    System.out.println("2");
                }
            }
        }
        // 如果flag==0锁住o2
        if (flag == 0) {
            synchronized (O2) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 只要锁住o1就完成
                synchronized (O1) {
                    System.out.println("3");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock td1 = new DeadLock();
        DeadLock td2 = new DeadLock();
        td1.flag = 1;
        td2.flag = 0;
        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);
        t1.start();
        t2.start();
    }
}

package com.msb.thread.safety;


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 模拟买火车票
 * 如何解决线程安全问题？？？？
 * 继承Thread synchronized()中不能用this
 * @author HuanyuLee
 * @date 2022/3/10
 */
public class BuyTicketThread{
    static int ticket = 10;
    static int person = 100;

    static class TicketThread extends Thread{
        public TicketThread(String name) {
            super(name);
        }
        @Override
        public void run() {
            for (int i = 0; i < person; i++) {
                synchronized (TicketThread.class){
                    if (ticket > 0) {
                        System.out.println("我在"+this.getName()+" 买到了从北京到哈尔滨的第 " + ticket-- + " 张车票");
                    }
                }
            }
        }
    }

    static class TicketThread2 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < person; i++) {
                buyTicket();
            }
        }

        private synchronized void buyTicket(){
            if (ticket > 0){
                System.out.println("我在"+Thread.currentThread().getName()+" 买到了从北京到哈尔滨的第 " + ticket-- + " 张车票");
            }
        }
    }
    static class TicketThread3 implements Callable<String> {
        Lock lock = new ReentrantLock();
        @Override
        public String call() throws Exception {
            for (int i = 0; i < person; i++) {
                lock.lock();
                try {
                    if (ticket > 0){
                        System.out.println("我在"+Thread.currentThread().getName()+" 买到了从北京到哈尔滨的第 " + ticket-- + " 张车票");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
            return "success!";
        }
    }

    public static void main(String[] args) {
        TicketThread t = new TicketThread("窗口-1");
        TicketThread t2 = new TicketThread("窗口-2");
        TicketThread t3 = new TicketThread("窗口-3");
       /* Thread t2 = new Thread(new TicketThread2(),"窗口-2");
        Thread t3 = new Thread(new FutureTask<>(new TicketThread3()),"窗口-3");*/
        t.start();
        t2.start();
        t3.start();
    }
}
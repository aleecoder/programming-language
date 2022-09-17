package com.msb.thread.create;

import java.util.concurrent.FutureTask;

/**
 * @author HuanyuLee
 * @date 2022/3/10
 */
public class Main {

    public static void myThread(){
        Thread.currentThread().setName("MainThread");
        MyThread mt = new MyThread("MyThread");
        printArray();
        System.out.println();
        mt.start();
        printArray();
    }
    public static void myThread2(){
        MyThread2 mt2 = new MyThread2();
        Thread t = new Thread(mt2,"MyThread2");
        t.start();
        printArray();
    }
    public static void myThreadL(){
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " --> " +i);
            }
        }).start();
        printArray();
    }

    public static void myThread3(){
        MyThread3 mt3 = new MyThread3();
        FutureTask<Integer> ft = new FutureTask<>(mt3);
        Thread t = new Thread(ft);
        t.start();
        try {
            System.out.println(ft.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void printArray(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " --> " +i);
        }
    }

    public static void main(String[] args) {
        myThread3();
    }
}

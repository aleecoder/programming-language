package com.msb.thread.sleep;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 实现一个秒表的功能
 * @author HuanyuLee
 * @date 2022/3/10
 */
public class ThreadSleep {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        while (true){
            Date date = new Date();
            System.out.println(df.format(date));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

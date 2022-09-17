package com.msb.thread.communicate;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 商品类
 * @author HuanyuLee
 * @date 2022/3/11
 */
public class Product {
    private String brand;
    private String name;
    private boolean flag = false;
    Lock lock = new ReentrantLock();
    /** 生产者的等待队列*/
    Condition produceCondition = lock.newCondition();
    /** 消费者的等待队列*/
    Condition consumeCondition = lock.newCondition();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(String brand,String name){
        lock.lock();
        try {
            // flag == true 有商品，生产者不生产，等着消费者消费
            if (flag){
                produceCondition.await();
            }
            this.setBrand(brand);
            Thread.sleep(1000);
            this.setName(name);
            System.out.println("生产者生产了: " + this.getBrand() + "--" + this.getName());
            flag = true;
            consumeCondition.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public void getProduct(){
        lock.lock();
        try {
            // flag == false 没有商品，等待生产者生产
            if (!flag){
                consumeCondition.await();
            }
            System.out.println("消费者消费了: " + this.getBrand() + "--" + this.getName());
            flag = false;
            produceCondition.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

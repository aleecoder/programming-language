package com.msb.thread.communicate;

/**
 * 消费者
 * @author HuanyuLee
 * @date 2022/3/11
 */
public class Customer extends Thread{
    /** 共享商品 */
    private final Product product;
    public Customer(Product product){
        this.product = product;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            product.getProduct();
        }
    }
}

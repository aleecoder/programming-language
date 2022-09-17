package com.msb.thread.communicate;

/**
 * 生产者
 * @author HuanyuLee
 * @date 2022/3/11
 */
public class Producer extends Thread{
    /** 共享商品 */
    private final Product product;
    public Producer(Product product){
        this.product = product;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0){
                product.setProduct("费列罗","巧克力");
            }else {
                product.setProduct("哈尔滨","啤酒");
            }
        }
    }
}

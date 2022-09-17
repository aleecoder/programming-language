package com.msb;

import java.util.function.Consumer;

/**
 * 四大常用内置函数式接口                             <p>
 * 1. 消费型接口 Consumer<T>     void accept(T t)  <p>
 * 2. 供给型接口 Supplier<T>     T get()           <p>
 * 3. 函数型接口 Function<T,R>   R apply(T t)      <p>
 * 4. 断言型接口 Predicate<T>    boolean test(T t)
 * @author HuanyuLee
 * @date 2022/3/13
 */
public class FunctionalInterface4 {

    public static void bath(double money,Consumer<Double> consumer){
        consumer.accept(money);
    }

    public static void main(String[] args) {

        /* 使用内置Consumer接口 */
        bath(2999,money -> System.out.println("明哥去洗澡了，来了个波西米亚套餐，花了" + money + "元"));
    }
}



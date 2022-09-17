package com.aleecoder.generic;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/16  23:03
 * @Description: 泛型类
 * @version: 1.0
 */
public class GenericClass<T> {
    private T t;

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}

class Test{
    public static void main(String[] args) {
        GenericClass<Integer> gc1 = new GenericClass<>();
        GenericClass<String> gc2 = new GenericClass<>();
        gc1.setT(10);
        gc2.setT("Generic");
        System.out.printf("整型值为 : %d\n",gc1.getT());
        System.out.printf("字符串为 : %s\n",gc2.getT());
    }
}

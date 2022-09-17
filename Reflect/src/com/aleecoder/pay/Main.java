package com.aleecoder.pay;

import java.lang.reflect.Method;

/**
 * @author HuanyuLee
 * @date 2022/3/15
 */
public class Main {
    public static void main(String[] args) {
        String str = "com.msb.pay.impl.AliPay";

        // 使用反射，下面的业务逻辑不必再改变
        try {
            Class<?> clazz = Class.forName(str);
            Object o = clazz.newInstance();
            Method payOnline = clazz.getMethod("payOnline");
            payOnline.invoke(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.aleecoder.generic;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/17  23:04
 * @Description: 泛型方法
 * @version: 1.0
 */
public class GenericFunction<T> {
    /*public static void a(T t){}*/     // Error 不能是静态方法、非泛型方法
    public void b(T t){}    // 非泛型方法
    public static <T> void c(T t){}     // 泛型方法
    public <E> void d(E t){}    // 泛型方法
    public <K,V> void e(K k,V v){}    // 泛型方法


    public static void main(String[] args) {
        GenericFunction<String> gc = new GenericFunction<>();
        gc.b("abc");
        c(123);
        c(false);
        c("hello");
        gc.d(123);
        gc.d("hello");
    }
}
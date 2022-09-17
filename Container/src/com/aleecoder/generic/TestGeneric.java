package com.aleecoder.generic;


import java.util.ArrayList;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/17  22:40
 * @Description: 泛型类的一些细节
 * @version: 1.0
 */
public class TestGeneric<K,V> {
    K key;
    V value;
    /*K[] keyArr = new K[10];*/     // Type parameter 'K' cannot be instantiated directly
    K[] keyArr = (K[]) new Object[10];  // 非要如此，要这么做。但不建议

    public TestGeneric() {
    }

    public TestGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "TestGeneric{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public void fun(){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        /*list1 = list2;*/  // Error
    }
    public static void defaultGeneric(){
        TestGeneric tg = new TestGeneric();
        tg.key = 10;
        System.out.println(tg);

        tg.key = "string";
        System.out.println(tg);

        tg.key = new int[]{1,2,3};
        System.out.println(tg);
    }

    /*public static void staticFun(K key){      // Error

    }*/
}

class Main{
    public static void main(String[] args) {
        TestGeneric.defaultGeneric();
    }
}

package com.msb;

/**
 * 测试 Lambda表达式
 * @author HuanyuLee
 * @date 2022/3/13
 */

@FunctionalInterface
interface MyInterface {
    void function();
}
@FunctionalInterface
interface MyInterface2 {
    void function(int x);
}
@FunctionalInterface
interface MyInterface3 {
    int function(int i, int j);
}

public class LambdaTest {
    public static void main(String[] args) {
        MyInterface i = () -> System.out.println("Lambda表达式");
        i.function();

        MyInterface2 i2 = x -> System.out.println("Lambda表达式: " + x);
        i2.function(10);

        MyInterface3 i3 = (x,y) -> {
            System.out.println("两个或两个以上的参数，有返回值");
            return x*y;
        };
        System.out.println(i3.function(2,5));

        i3 = (x,y) -> x-y;
        System.out.println(i3.function(5,2));
    }
}

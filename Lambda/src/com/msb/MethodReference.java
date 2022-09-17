package com.msb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * 方法引用 有3种情况<p>
 * 1. 对象::实例方法名      <p>
 * 2. 类::静态方法名       <p>
 * 3. 类::实例方法名
 * @author HuanyuLee
 * @date 2022/3/13
 */
public class MethodReference {
    public static void main(String[] args) {
        // 对象::实例方法名
        List<String> list = Arrays.asList("hello", "lambda", "java");
        list.forEach(System.out::println);

        Consumer<String> consumer = System.out::println;
        consumer.accept("长沙");

        // 类::静态方法名
        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(1, 2));

        // 类::实例方法名
        BiPredicate<String,String> bp = String::equals;
        System.out.println(bp.test("abc", "abc"));
    }
}

package com.aleecoder.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "k", "f", "d", "e");
        System.out.println("before sort: " + list);
        Collections.sort(list);
        System.out.println("after sort: " + list);
        System.out.println(Collections.binarySearch(list, "d"));

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"t","s");

        // copy: 其实是替换方法
        Collections.copy(list,list2);
        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);

        // fill: 填充
        Collections.fill(list2,"yyds");
        System.out.println("list2 = " + list2);
    }
}

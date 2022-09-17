package com.aleecoder.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/16  14:40
 * @Description:
 * @version: 1.0
 */
public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1,20);
        System.out.println("list = " + list);
        list.remove(1);
        System.out.println("list = " + list);
        list.set(1,30);
        System.out.println("list = " + list);
        System.out.println(list.get(0));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        // 方式 1: 普通 for 循环
        System.out.println("-----------------------------");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        // 方式 2: 增强 for 循环
        System.out.println("-----------------------------");
        for (Integer integer : list2) {
            System.out.println(integer);
        }
        // 方式 3: 迭代器
        System.out.println("-----------------------------");
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
package com.aleecoder.collection;

import java.util.*;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/14  13:05
 * @Description: Collection接口
 * @version: 1.0
 */
public class TestCollection {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        // 增加
        col.add(1);
        col.add(1);
        col.add(3.14);
        col.add("Hello Collection");
        col.add(false);
        col.add( new int[]{1, 2, 3});
        List<Integer> list = Arrays.asList(11, 22, 33);
        col.addAll(list);   // 将另一个集合添加入col中
        System.out.println("col = " + col);

        // 判断
        System.out.println("集合是否为空: " + col.isEmpty());
        System.out.println("集合是否包含 1 : " + col.contains(1));
        Collection<Integer> col1 = Arrays.asList(1,2,3);
        Collection<Integer> col2 = Arrays.asList(1,2,3);
        System.out.println("col1 和 col2 是否相等: " + col1.equals(col2));

        // 查看
        System.out.println("集合元素个数: " + col.size());
        for (Object o : col) {
            System.out.print(o + " ");
        }
        System.out.println();
        // 删除
        col.remove(3.14);
        System.out.println("col = " + col);
        col.clear();  // 清空集合
        System.out.println("col = " + col);
    }
}

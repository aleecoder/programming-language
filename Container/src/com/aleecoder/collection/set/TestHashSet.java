package com.aleecoder.collection.set;

import com.aleecoder.collection.Girl;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        Collections.addAll(hs, 1, 2, 6, 3, 5, 2, 7);

        hs.add(100);    // true
        hs.add(100);    // false

        System.out.println(hs.size());
        // [1, 2, 3, 100, 5, 6, 7] 无序、唯一
        System.out.println(hs);

        // ========自定义类型要重写hashCode和equals，集合才满足唯一、无序的特点=======
        HashSet<Girl> hs2 = new HashSet<>();
        hs2.add(new Girl("丽丽", 18, 170));
        hs2.add(new Girl("菲菲", 19, 171));
        hs2.add(new Girl("娜娜", 20, 165));
        hs2.add(new Girl("露露", 17, 168));
        hs2.add(new Girl("丽丽", 18, 170));
        System.out.println(hs2.size());
        hs2.forEach(System.out::println);

        // =========================LinkedHashSet============================
        LinkedHashSet<String> hs3 = new LinkedHashSet<>();
        hs3.add("a");
        hs3.add("c");
        hs3.add("b");
        hs3.add("d");
        hs3.add("e");
        System.out.println(hs3);
    }
}

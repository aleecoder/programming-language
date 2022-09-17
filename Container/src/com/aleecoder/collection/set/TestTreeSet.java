package com.aleecoder.collection.set;

import com.aleecoder.collection.Girl;
import java.util.TreeSet;

/**
 * TreeSet底层是二叉排序树
 * 遍历是中序遍历
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Girl> ts = new TreeSet<>((o1, o2) -> o2.getAge()- o1.getAge());
        ts.add(new Girl("丽丽",18,170));
        ts.add(new Girl("娜娜",16,171));
        ts.add(new Girl("露露",17,169));
        ts.add(new Girl("兰兰",19,150));
        ts.add(new Girl("丽丽",20,173));
        System.out.println(ts.size());
        ts.forEach(System.out::println);
    }
}

package com.aleecoder.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author HuanyuLee
 * @date 2022/2/14
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("c");
        arrayList.add("d");
        System.out.println(arrayList);

        final ListIterator<String> it = arrayList.listIterator();
        while (it.hasNext()) {
            if ("c".equals(it.next())) {
                it.add("ok");
            }
        }
        System.out.println(arrayList);

        // 逆向遍历
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}

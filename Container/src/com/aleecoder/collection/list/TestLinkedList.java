package com.aleecoder.collection.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/3/1  10:18
 * @Description:
 * @version: 1.0
 */
public class TestLinkedList {


    public static void main(String[] args) {
        // LinkedList 底层是双链表
        LinkedList<String> list = new LinkedList<>(Arrays.asList("a", "b", "c","d","e","e"));

        list.addFirst("first");
        list.addLast("last");
        list.offer("java");     // 添加元素在尾端
        list.offerFirst("scala");
        list.offerLast("python");
        System.out.println("list = " + list);

        System.out.println(list.poll());    // 删除头元素    推荐使用
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());

        System.out.println(list.remove());  //删除头元素
        System.out.println(list.remove(3));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println("list = " + list);

        // 遍历:普通for循环、增强for循环、迭代器
        // 迭代器方式 1
        /*Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
        // 迭代器方式 2  这种写法更加节省内存，因为随着for循环结束，it将被回收；而方式 1 it在main方法结束后才被回收
        for(Iterator<String> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}

package com.aleecoder.collection.list;

/**
 * @author HuanyuLee
 * @Date: 2022/3/1  11:00
 */

public class MyLinedList<E> {
    int size;
    Node<E> first;
    Node<E> last;

    public MyLinedList() {
    }

    public void add(E e){
        linkLast(e);
    }

    private void linkLast(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l,e,null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    @Override
    public String toString() {
        return "MyLinedList{" +
                "size=" + size +
                ", first=" + first +
                ", last=" + last +
                '}';
    }

    public static void main(String[] args) {
        MyLinedList<String> list = new MyLinedList<>();
        list.add("a");
        list.add("b");
        System.out.println(list.size);
    }



    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}

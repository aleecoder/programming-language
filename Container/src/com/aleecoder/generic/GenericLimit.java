package com.aleecoder.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/18  12:23
 * @Description: 泛型受限
 * @version: 1.0
 */


class Person{
}
class Student extends Person{ }
public class GenericLimit {
    public static void main(String[] args) {
        // a,b,c三个集合是并列的关系
        List<Object> a = new ArrayList<>();
        List<Person> b = new ArrayList<>();
        List<Student> c = new ArrayList<>();
        // 泛型的上限
        List<? extends Person> list1 = new ArrayList<>();
        /*list1 = a;*/  // Error
        list1 = b;
        list1 = c;

        // 泛型的下限
        List<? super Person> list2 = new ArrayList<>();
        list2 = a;
        list2 = b;
        /*list2 = c;*/  // Error

    }
}

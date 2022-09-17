package com.aleecoder.learn.test;

import java.io.Serializable;

/**
 * @author HuanyuLee
 * @date 2022/3/17
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -6979294503929764337L;
    public String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

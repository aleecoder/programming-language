package com.aleecoder.object_stream;

import java.io.Serializable;

/**
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -2012378405437408270L;
    private String name;
    /** 被transient和static修饰的不能被序列化*/
    private transient int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

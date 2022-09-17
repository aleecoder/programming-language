package com.aleecoder.collection;

import java.util.Objects;

/**
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class Girl {
    private String name;
    private int age;
    private double height;

    public Girl() {
    }

    public Girl(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Girl)) return false;
        Girl girl = (Girl) o;
        return getAge() == girl.getAge() && Double.compare(girl.getHeight(), getHeight()) == 0 && getName().equals(girl.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHeight());
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

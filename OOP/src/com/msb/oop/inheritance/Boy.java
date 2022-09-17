package com.msb.oop.inheritance;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  10:13
 * @Description:
 * @version: 1.0
 */
public class Boy {
    private String name;
    private int age;
    private double height;

    public Boy() {
    }

    public Boy(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void buy(){
        System.out.println("跟我谈恋爱，给你买买买");
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
        return "Boy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

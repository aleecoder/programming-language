package com.msb.oop.inheritance;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/16  15:24
 * @Description: 继承
 * @version: 1.0
 */
public class Student extends Person {
    private int id;
    static String school;

    public Student() {
    }
    public Student(int id) {
        this.id = id;
    }
    public Student(int id, String name, int age, String sex, double height) {
        super(name, age, sex, height);
        setSex(sex);
        this.id = id;
    }

    @Override
    public void setSex(String sex) {
        if ("男".equals(sex) || "女".equals(sex))
            super.setSex(sex);
        else
            super.setSex("男");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", "+
                super.toString().substring(7);  // substring(int beginIndex)
    }

}
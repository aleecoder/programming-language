package com.msb.oop.inheritance;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/18  13:04
 * @Description: 封装、类和类之间的关系
 * @version: 1.0
 */
public class Girl {
    private String name;
    private int age;
    private double weight;
    private Mother mother;

    public Girl() { }

    public Girl(String name, int age, double weight, Mother mother) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.mother = mother;
    }
    public void love(Boy boy){
        System.out.println("我的男朋友："+boy.toString());
        boy.buy();
    }
    public void wechat(){
        mother.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public void setAge(int age) {
        if (age > 30) {
            this.age = 18;
        }else
            this.age = age;
    }
    public int getAge() {
        return age;
    }
}
package com.msb.oop.polymorphism;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  12:24
 * @Description: 多态
 * @version: 1.0
 */
public class Cat extends Animal{
    protected double weight;
    public Cat() {
    }
    public Cat(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public void shout(){
        System.out.println("我是小猫，我可以喵喵叫……");
    }
    @Override
    public void eat(){
        System.out.println("我是小猫，我喜欢吃鱼……");
    }
    public void scratch(){
        System.out.println("我是小猫，我生气了会挠人……");
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}

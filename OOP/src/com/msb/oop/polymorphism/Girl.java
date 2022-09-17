package com.msb.oop.polymorphism;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/18  13:04
 * @Description: 多态
 * @version: 1.0
 */
public class Girl {
    String name;

    public Girl() {
    }

    public Girl(String name) {
        this.name = name;
    }

    public void play(Animal animal){
        animal.shout();
        animal.eat();
    }
}
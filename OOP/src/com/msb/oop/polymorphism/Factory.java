package com.msb.oop.polymorphism;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  13:35
 * @Description: 简单工厂设计模式：工厂类，负责生产对象
 * @version: 1.0
 */
public class Factory {
    public static Animal getAnimal(String name){
        Animal animal;
        switch (name){
            case "cat":
                animal = new Cat();break;   // 向上转型
            case "dog":
                animal = new Dog();break;
            case "pig":
                animal = new Pig();break;
            default:
                animal = null;
        }
        return animal;
    }

}

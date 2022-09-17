package com.msb.oop.polymorphism;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  12:35
 * @Description: 测试多态
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = Factory.getAnimal("cat");
        Girl girl = new Girl();
        girl.play(animal);

        ((Cat)animal).scratch();    // 向下转型
        ((Cat) animal).setWeight(2.5);
        System.out.println(((Cat) animal).getWeight());
    }
}

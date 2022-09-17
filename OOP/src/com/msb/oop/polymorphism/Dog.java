package com.msb.oop.polymorphism;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  12:29
 * @Description:
 * @version: 1.0
 */
public class Dog extends Animal{
    @Override
    public void shout(){
        System.out.println("我是小狗，我可汪汪叫……");
    }
    @Override
    public void eat(){
        System.out.println("我是小狗，我喜欢吃骨头……");
    }
    public void guard(){
        System.out.println("我是小狗，我会看家护院保护我的小主人……");
    }
}

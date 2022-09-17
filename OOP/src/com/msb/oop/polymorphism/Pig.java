package com.msb.oop.polymorphism;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  12:31
 * @Description:
 * @version: 1.0
 */
public class Pig extends Animal{
    @Override
    public void shout(){
        System.out.println("我是小猪，我可以哼哼的叫……");
    }
    @Override
    public void eat(){
        System.out.println("我是小猪，我喜欢吃白菜……");
    }
    public void sleep(){
        System.out.println("我是小猪，我吃饱了喜欢睡大觉……");
    }
}

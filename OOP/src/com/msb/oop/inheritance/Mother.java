package com.msb.oop.inheritance;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  10:10
 * @Description:
 * @version: 1.0
 */
public class Mother {
    private String name;

    public Mother() {
    }

    public Mother(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("妈妈唠唠叨叨都是爱，要听妈妈的话");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

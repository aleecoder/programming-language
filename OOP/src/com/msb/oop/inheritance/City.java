package com.msb.oop.inheritance;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/18  21:56
 * @Description: 继承条件下构造方法的执行过程
 * @version: 1.0
 */
public class City extends Object{
    private String name;
    private String address;
    public City(){}

    public City(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

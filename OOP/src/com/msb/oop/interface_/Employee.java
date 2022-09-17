package com.msb.oop.interface_;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  19:18
 * @Description:
 * @version: 1.0
 */
public class Employee extends People{
    String id;

    public Employee(String name, String id) {
        super(name);
        this.id = id;
    }
}

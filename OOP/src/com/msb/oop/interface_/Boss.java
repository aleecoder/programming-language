package com.msb.oop.interface_;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  19:18
 * @Description:
 * @version: 1.0
 */
public class Boss extends People{
    String company;

    public Boss(String name, String company) {
        super(name);
        this.company = company;
    }
}

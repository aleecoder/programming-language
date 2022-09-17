package com.msb.oop.interface_;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  19:07
 * @Description:
 * @version: 1.0
 */
public abstract class Phone {
    String name;
    int year;
    String style;
    protected int MAX_TIME;
    public Phone() {
    }

    public Phone(String name, int year, String style,final int MAX_TIME) {
        this.name = name;
        this.year = year;
        this.style = style;
        this.MAX_TIME = MAX_TIME;
    }
    public abstract void aboutPhone();

    public int getMAX_TIME() {
        return MAX_TIME;
    }
    public abstract void setMAX_TIME(int MAX_TIME, boolean vip);
}

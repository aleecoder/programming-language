package com.msb.oop.inheritance;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/18  21:58
 * @Description: 继承条件下构造方法的执行过程
 * @version: 1.0
 */
public class ShangHai extends City {
    private double gdp;
    public ShangHai(){}

    public ShangHai(String name, String address, double gdp) {
        super(name, address);
        this.gdp = gdp;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }
}

package com.msb.oop.inheritance;

import java.util.Objects;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/18  23:10
 * @Description: equals方法
 * @version: 1.0
 */
public class Phone {
    private String brand;
    private double price;
    private int year ;

    public Phone(){}

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.getPrice(), getPrice()) == 0 && getYear() == phone.getYear() && getBrand().equals(phone.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getPrice(), getYear());
    }
}

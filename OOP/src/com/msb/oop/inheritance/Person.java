package com.msb.oop.inheritance;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/15  13:03
 * @Description: 人类
 * @version: 1.0
 */
public class Person {
    private String name;    // 成员变量
    private int age;
    private String sex;
    private double height;
    static int sid;

    public Person(){
    }

    public Person(String name, int age, String sex, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat(){
        int num = 0;    // 局部变量必须初始化
//        System.out.println("num = " + num);
        System.out.println("I want to eat.");
    }
    public void sleep(String address){
        System.out.println("I like sleeping in " + address + ".");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                '}';
    }

    public String introduce(){
        return "My name is " + this.name + ".\nMy age is " + this.age + ".\nMy height is " + this.height;
    }
    public void test(){
        System.out.println(Person.sid);
    }
    public static void main(String[] args) {
        // 第一次加载类的时候，会进行类的加载，初始化创建对象的时候，对象的属性没有给赋值，有默认的初始化的值
        // zs 实际上存储的是 new Person 这个对象的内存地址
        Person zs = new Person("ZhangSan",18,"man",180);

        // 再次创建类的时候，就不会进行类的加载了，类的加载只在第一次需要的时候加载一次
        Person ls = new Person();
        ls.setName("LiSi");
        ls.setAge(20);
        ls.setHeight(175);
        /*
        对方法进行操作:
        不同的对象，属性有自己的特有的值，但是方法都是调用类中通用的方法
        属性：各个对象的属性是独立的
        方法：各个对象的方法是共享的
         */
        zs.eat();
        ls.eat();
        zs.sleep("hotel");
        System.out.println(zs.introduce());
    }
}

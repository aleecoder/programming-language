package com.aleecoder.learn.test;

/**
 * @author HuanyuLee
 * @date 2022/3/17
 */
public class Student extends Person implements MyInterface{

    private static final long serialVersionUID = 1277934290791210477L;
    public int sno;
    private double height;
    protected double weight;
    double score;

    public Student(){
        System.out.println("空参构造器......");
    }

    public Student(int sno, double height, double weight) {
        this.sno = sno;
        this.height = height;
        this.weight = weight;
    }

    protected Student(int sno, double score) {
        this.sno = sno;
        this.score = score;
    }

    private Student(String name, int age, int sno, double height, double weight, double score) {
        super(name, age);
        this.sno = sno;
        this.height = height;
        this.weight = weight;
        this.score = score;
    }

    @Override
    public void function() {
        System.out.println("重写了MyInterface中的function方法......");
    }

    @MyAnnotation("ss")
    public String showInfo() throws RuntimeException{
        System.out.println("show info 方法......");
        return "三好学生";
    }
    public String showInfo(int i){
        System.out.println("show info 方法 带参数......");
        return "三差学生";
    }
    @MyAnnotation("yes")
    private void work(){
        System.out.println("好好学习，好好搬砖......");
    }

    protected int happy(int days){
        System.out.println("我开心了......");
        return days;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}

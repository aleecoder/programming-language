package com.msb.wrapper;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/29  13:56
 * @Description: 包装类 以Integer为例
 * @version: 1.0
 */
public class TestInteger {
    /** 测试Integer的属性
    * @param:
    */
    public static void testAttributes(){
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
    /** 测试Integer的构造器
    * @param:
    */
    public static void testConstructor(){
        Integer i1 = new Integer(111);
        System.out.println(i1);
        Integer i2 = new Integer("111");
        System.out.println(i2);
        try {
            Integer i3 = new Integer("abe3");
            System.out.println(i3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /** 测试Integer自动装箱（int → Integer）拆箱（Integer → int）
    * @param:
    */
    public static void testAutomatic(){
        Integer a = 140;
        System.out.println(a);
        int b = new Integer(140);
        System.out.println(b);
        System.out.println(a == b);
    }
    /** 测试Integer compareTo方法
     *
    * @param:
     * @return the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y
    */
    public static int test_compareTo(int x,int y){
        Integer i1 = new Integer(x);
        Integer i2 = new Integer(y);
        return i1.compareTo(i2);
    }
    /** 测试Integer equals方法
     * Integer对Object中的equals方法进行了重写，比较的是底层封装的那个value的值
    * @param:
    * @return: true if the objects are the same; false otherwise.
    */
    public static boolean test_equals(int x, int y){
        Integer i1 = new Integer(x);
        Integer i2 = new Integer(y);
        return i1.equals(i2);
    }
    /** 测试自动装箱的范围
    * @param:
    * @return: 如果自动装箱值在[-128,127]之间，那么比较的就是具体的数值;否则比较的就是对象的地址
    */
    public static boolean testAutomatic(int x, int y){
        Integer i1 = x;
        Integer i2 = y;
        return i1 == i2;
    }
    public static void main(String[] args) {
//        testAttributes();
//        testConstructor();
//        testAutomatic();
//        System.out.println(test_compareTo(5, 5));
//        System.out.println(test_compareTo(5, 8));
//        System.out.println(test_compareTo(5, 3));
//        System.out.println(test_equals(5, 5));
//        System.out.println(test_equals(5, 6));
        System.out.println(testAutomatic(1, 11));
        System.out.println(testAutomatic(127, 127));
        System.out.println(testAutomatic(-128, -128));
        System.out.println(testAutomatic(128, 128));
    }
}
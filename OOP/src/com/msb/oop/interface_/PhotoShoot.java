package com.msb.oop.interface_;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  19:00
 * @Description: 拍照
 * @version: 1.0
 */
public interface PhotoShoot {
    public static final int HEIGHT = 100;   //图片的高
    public static final int WEIGHT = 100;   //图片的款
    public abstract void takePhoto();

    /* JDK1.8以后，新增非抽象方法：
    (1)被public default修饰的非抽象方法
    (2)静态方法
     */

    // default修饰符不可省略；实现类中若重写接口中的非抽象方法，default修饰符必须省略
    public default void selfie() {
        System.out.println("自拍功能……");
    }
    // 静态方法 static 不可省略，不可重写静态方法
    public static void video(){
        System.out.println("录像功能……");
    }
}

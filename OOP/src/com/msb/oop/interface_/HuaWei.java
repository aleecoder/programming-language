package com.msb.oop.interface_;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  19:11
 * @Description:
 * @version: 1.0
 */
public class HuaWei extends Phone implements PhotoShoot,Calling{
    public HuaWei() {
    }

    public HuaWei(String name, int year, String style,final int MAX_TIME) {
        super(name, year, style,MAX_TIME);
    }

    @Override
    public void takePhoto() {
        System.out.println("华为手机可以照相……");
        PhotoShoot.super.selfie();  //  调用接口中的非抽象方法
        PhotoShoot.video();     // 调用接口中的静态方法
    }

    @Override
    public void call(People people1,People people2) {
        System.out.println(people1.getName()+"可以和"+people2.getName()+"打电话……");
    }

    //实现类中若重写接口中的非抽象方法，default修饰符必须省略
    @Override
    public void selfie() {
//        PhotoShoot.super.selfie();
        System.out.println("HuaWei 重写了PhotoShoot接口中selfie方法……");
    }
    // Method does not override method from its superclass
    /*public static void video(){}*/

    public void aboutPhone(){
        System.out.println(">>> HuaWei.aboutPhone:");
        System.out.println("手机的像素为：" + HEIGHT + "x" + WEIGHT);
        System.out.println("手机的最大通话时间："+ getMAX_TIME());
    }
    @Override
    public void setMAX_TIME(int MAX_TIME, boolean vip) {
        if (!vip)
            this.MAX_TIME = getMAX_TIME();
        else this.MAX_TIME = Math.min(MAX_TIME, 200) + getMAX_TIME();
    }
}

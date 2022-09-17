package com.msb.oop.interface_;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  19:20
 * @Description: boss和employee用华为手机进行打电话
 * 综合了：面向对象三大特性，接口，抽象类，简单工厂设计模式
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Boss boss = new Boss("雷军","小米");
        Employee employee = new Employee("婷婷","202201006");
        String phoneStyle = "huawei";
//        String phoneStyle = "vivo";
        Phone phone = JingDong.getPhone(phoneStyle);

        ((HuaWei)phone).takePhoto();
        ((HuaWei)phone).call(boss,employee);
//        ((ViVo)phone).call(boss,employee);

        phone.aboutPhone();
        ((HuaWei) phone).selfie();

        phone.setMAX_TIME(30,true);
        System.out.println(phone.getMAX_TIME());
    }
}
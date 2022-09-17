package com.msb.oop.interface_;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  20:11
 * @Description: 工厂类，生产对象
 * @version: 1.0
 */
public class JingDong {
    public static Phone getPhone(String name){
        Phone phone;
        switch (name){
            case "huawei":
                phone = new HuaWei("HUAWEI Mate 40",2021,"华为",100);break;
            case "vivo":
                phone = new ViVo("ViVo X70",2021,"vivo",200);break;
            default:
                phone = null;
        }
        return phone;

    }
}

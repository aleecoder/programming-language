package com.msb.test;


import com.msb.oop.inheritance.Boy;
import com.msb.oop.inheritance.Girl;
import com.msb.oop.inheritance.Mother;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/15  13:13
 * @Description: 测试类
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy("鹿晗",32,180);
        Mother mother = new Mother("李君");
        Girl girl = new Girl("关晓彤",25,100,mother);
        girl.love(boy);
        girl.wechat();
    }
}


package com.msb.anno;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author HuanyuLee
 * @date 2022/3/15
 */
public class Student extends Person {
    @Override
    public int function(int var) {
        var = new Random().nextInt();
        return var;
    }

    @Deprecated
    public void deprecatedFun() {
        System.out.println("废弃方法......");
    }
}

class Test {
    public static void main(String[] args) {

        @SuppressWarnings({"unused", "rawtypes"})
        List list = new ArrayList();

        Student student = new Student();
        student.deprecatedFun();
    }
}
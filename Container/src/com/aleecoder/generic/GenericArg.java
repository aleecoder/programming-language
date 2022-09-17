package com.aleecoder.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/18  11:41
 * @Description: 泛型参数继承情况、通配符
 * @version: 1.0
 */
public class GenericArg {
    public static void main(String[] args) {
        Object obj = new Object();
        String s = new String();
        obj = s;    // 多态
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        /*list1 = list2;*/  // Error

        // 引入通配符'?'
        List<?> list = null;
        list = list1;
        list = list2;
    }
}

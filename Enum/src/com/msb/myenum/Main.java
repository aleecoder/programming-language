package com.msb.myenum;

import com.msb.enumdefine.Season;

/**
 * @author HuanyuLee
 * @date 2022/3/15
 */
class Main {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        System.out.println("SeasonD类的父类: " + Season.class.getSuperclass().getName());

        System.out.println(summer);

        com.msb.myenum.Season s = com.msb.myenum.Season.SPRING;
        System.out.println("Season枚举类的父类: " + com.msb.myenum.Season.class.getSuperclass().getName());
        System.out.println(s);
    }
}

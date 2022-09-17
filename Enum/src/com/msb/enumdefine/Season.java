package com.msb.enumdefine;

/**
 * jdk1.5之前使用枚举类，需要如下定义的方式
 * 比如自定义季节枚举类
 * @author HuanyuLee
 * @date 2022/3/15
 * @version  jdk1.5之前
 */
public class Season {
    private final String name;
    private final String desc;

    private Season(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","烈日炎炎");
    public static final Season AUTUMN = new Season("秋天","硕果累累");
    public static final Season WINTER = new Season("冬天","冰天雪地");

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "SeasonD{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


package com.msb.apply;

/**
 * @author HuanyuLee
 * @date 2022/3/15
 */
public class People {
    private String name;
    private Gender sex;

    public People() {
    }

    public People(String name, Gender sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}

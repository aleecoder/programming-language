package com.msb.apply;

/**
 * @author HuanyuLee
 * @date 2022/3/15
 */
public class Test {
    public static void main(String[] args) {
        People people = new People();
        people.setName("Tome");
        // 传入枚举类Gender的对象，在入口处就对参数进行了限制
        people.setSex(Gender.MALE);
        System.out.println(people);

        /*
         * switch可以匹配的类型: int、short、byte、char、String、enum
         */
        Gender sex = people.getSex();
        switch (sex){
            case MALE:
                System.out.println("这个爷们");break;
            case FEMALE:
                System.out.println("是个娘们");break;
            default:
        }
    }
}

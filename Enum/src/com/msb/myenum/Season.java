package com.msb.myenum;

/**
 * 定义枚举类，并实现接口
 * @author HuanyuLee
 * @date 2022/3/15
 * @since jdk1.5
 */
public enum Season implements MyInterface {
    /**
     * 枚举对象，必须放在第一行
     */
    SPRING ("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("这是春天的show方法实现......");
        }
    },
    SUMMER ("夏天","烈日炎炎"){
        @Override
        public void show() {
            System.out.println("这是夏天的show方法实现......");
        }
    },
    AUTUMN ("秋天","硕果累累"){
        @Override
        public void show() {
            System.out.println("这是秋天的show方法实现......");
        }
    },
    WINTER ("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("这是冬天的show方法实现......");
        }
    };

    private final String name;
    private final String desc;
    Season(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void show() {
        System.out.println("show......");
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

}
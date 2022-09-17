package com.msb.oop.interface_;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  19:45
 * @Description:
 * @version: 1.0
 */
public class ViVo extends Phone implements Calling {
    public ViVo() {
    }

    public ViVo(String name, int year, String style,final int MAX_TIME) {
        super(name, year, style,MAX_TIME);
    }

    @Override
    public void call(People people1, People people2) {
        System.out.println(people1.getName()+"可以和"+people2.getName()+"打电话……");
    }

    public void aboutPhone(){
        System.out.println(">>> ViVo.aboutPhone:");
        System.out.println("手机的最大通话时间："+getMAX_TIME());
    }
    @Override
    public void setMAX_TIME(int MAX_TIME, boolean vip) {
        if (!vip)
            this.MAX_TIME = getMAX_TIME();
        else
            this.MAX_TIME = MAX_TIME + getMAX_TIME();
    }
}

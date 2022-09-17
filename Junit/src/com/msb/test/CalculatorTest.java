package com.msb.test;

import com.msb.calculate.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * 计算器测试类，使用Junit
 * @author HuanyuLee
 * @date 2022/3/15
 */
public class CalculatorTest {

    Calculator cal = new Calculator();

    @Before
    public void init(){
        System.out.println("方法执行开始了......");
    }
    @After
    public void close(){
        System.out.println("方法执行结束了......");
    }

    @Test
    public void testAdd(){
        System.out.println("测试add方法");
        int result = cal.add(10,30);
        Assert.assertEquals(40,result);
    }

    @Test
    public void testDiv(){
        System.out.println("测试div方法");
        int result = cal.div(1,0);
        System.out.println(result);
    }
}

package com.msb.oop;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/17  21:06
 * @Description: 代码块
 * @version: 1.0
 */
public class CodeBlock {
    int var;
    static int svar;

    public CodeBlock() {
        System.out.println(">>> 执行空构造器.");
    }
    public CodeBlock(int var) {
        this.var = var;
    }

    public void fun1(){
        // 普通块
        {
            System.out.println(">>> 执行普通块.");
            int var1 = 1;
            System.out.println("var1 = " + var1);
        }
        // System.out.println("var1 = " + var1);   // Cannot resolve symbol 'var1'(普通块限制了局部变量的作用范围)
    }
    public static void fun2(){
        System.out.println(">>> 执行静态方法fun2.");
    }
    // 构造块
    {
        System.out.println(">>> 执行构造块.");
    }
    // 静态块
    static {
        System.out.println(">>> 执行构造块.");
        // fun1();  // Non-static method 'fun1()' cannot be referenced from a static context
        /*
        在静态块中只能调用静态属性、静态方法
         */
        System.out.println("svar = " + svar);
        fun2();
    }

    public static void main(String[] args) {
        /*
        通过程序的执行结果得知：
        先执行静态块，且只执行一次
        然后创建对象，执行构造块、再执行构造器（new几个对象就执行几次），最后执行普通块。
         */
        System.out.println("--------------------------");
        CodeBlock cb = new CodeBlock();
        cb.fun1();
        System.out.println("--------------------------");
        CodeBlock cb2 = new CodeBlock();
        cb2.fun1();
    }
}

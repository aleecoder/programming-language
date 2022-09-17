package com.msb.oop.inner;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/22  22:36
 * @Description: 内部类
 * @version: 1.0
 */
public class Outer {
    int var = 10;
    static int svar = 100;
    /**成员内部类
     *      里面可以有 属性，方法，构造器等
     *      修饰符：private，default，protect，public，final,abstract
     *      可以访问：
     *          内部类可以访问外部类的内容
     *          静态内部类中只能访问外部类中被static修饰的内容
     *          外部类想要访问内部类的东西，需要创建内部类的对象然后进行调用
     *          内部类和外部类属性重名的时候，如何进行调用
     *      创建内部类的对象
     *          静态的成员内部类创建对象
     *          非静态的成员内部类创建对象
    */
    static {
        class Block_Interior {
            public void bl_in_fun(){
                System.out.print("块内的局部内部类:");
                System.out.println("Block_Interior.bl_in_fun");
            }
        }
        new Block_Interior().bl_in_fun();
    }
    static class SInterior{
        public void sin_fun(){
            System.out.print("静态成员内部类:");
            System.out.println("SInterior.sin_fun");
            System.out.println("svar = " + svar);
        }
    }
    class Interior {
        int var = 20;
        public void in_fun(){
            int var = 30;
            System.out.print("非静态成员内部类:");
            System.out.println("Interior.in_fun");
            System.out.println("svar = " + svar);
            // 内部类和外部类属性重名的时候，如何进行调用
            System.out.println(var);    // 30
            System.out.println(this.var);   // 20
            System.out.println(Outer.this.var);     // 10
            fun();
        }
    }

    public Outer() {
        class Con_Interior {
            public void con_in_fun(){
                System.out.print("构造器内的局部内部类:");
                System.out.println("Con_Interior.con_in_fun");
            }
        }
        new Con_Interior().con_in_fun();
    }

    public void fun(){
        // 在局部内部类中访问到的变量必须是被 final 修饰的
        final int var = 123;
        class Fun_Interior {
            public void fun_in_fun(){
                System.out.print("方法体内的局部内部类:");
                System.out.println("Fun_Interior.fun_in_fun");
                // Variable 'var' is accessed from within inner class, needs to be final or effectively final
                // var = 321;
                System.out.println("var = " + var);
            }
        }
        new Fun_Interior().fun_in_fun();
    }
    // 如果类B在整个项目中只使用一次，则没有必要单独创建一个B类，使用内部类就可以
    public Comparable method(){
        class B implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new B();
    }
    public Comparable method2(){
        // 匿名内部类
        return new Comparable(){
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
    public void method3(){
        // 接口指向实现类的引用
        Comparable com = new Comparable(){
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
        System.out.println(com.compareTo("abc"));
    }
}

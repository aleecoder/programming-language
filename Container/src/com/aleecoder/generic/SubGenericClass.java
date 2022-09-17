package com.aleecoder.generic;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/2/17  22:28
 * @Description: 泛型类的继承
 * @version: 1.0
 */
class SubGenericClass extends GenericClass<Integer>{

}
class SubGenericClass2<T> extends GenericClass<T>{
    // 父类不指定泛型，那么子类也会变成一个泛型类
}
class Demo{
    public static void main(String[] args) {
        // 父类指定泛型，子类不需要再指定泛型，可以直接使用
        SubGenericClass sgt = new SubGenericClass();
        sgt.setT(10);
        System.out.println(sgt.getT());     // 10

        // 父类不指定泛型，子类需要指定泛型
        SubGenericClass2<String> sgt2 = new SubGenericClass2<>();
        sgt2.setT("hello");
        System.out.println(sgt2.getT());    // hello
    }
}

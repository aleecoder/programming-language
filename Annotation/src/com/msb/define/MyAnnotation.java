package com.msb.define;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解:
 *   内部没有定义配置参数的注解叫做 “标记”
 *   内部定义配置参数的注解叫做 "元数据"
 * 元注解: 用于修饰其他注解的注解
 *    Retention: 指定修饰的那个注解的生命周期
 *    Target:    指定被修饰的注解可以修饰的程序元素
 *    Documented: 指定被该元注解修饰的注解类将被javadoc工具提取成文档（很少用）
 *    Inherited: 被它修饰的Annotation将具有继承性（极少用）
 * @author HuanyuLee
 * @date 2022/3/15
 */
@Retention(RetentionPolicy.SOURCE)  //只在源文件里有效
@Target(ElementType.TYPE)
public @interface MyAnnotation {
    String[] value() default "value";
}

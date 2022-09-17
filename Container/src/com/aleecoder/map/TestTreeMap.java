package com.aleecoder.map;


import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap实现类
 * 特点：唯一、有序
 * 原理：二叉树。key遵照二叉树的特点 放入集合的key的数据对应的类型内部一定要实现比较器（内部比较器或外部比较器）
 *
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class TestTreeMap {
    public static TreeMap<Student,Integer> init(){
        // 身高降序
        TreeMap<Student,Integer> map = new TreeMap<>(
                (o1, o2) -> Double.compare(o2.getHeight(),o1.getHeight())
        );
        // 默认升序
        TreeMap<Student,Integer> map2 = new TreeMap<>(Comparator.comparingDouble(Student::getAge));
        TreeMap<Student,Integer> map3 = new TreeMap<>(Comparator.comparingDouble(Student::getHeight));
        TreeMap<Student,Integer> map4 = new TreeMap<>(Student::compareTo);

        map.put(new Student("a",19,170.50),180512201);
        map.put(new Student("b",19,171.90),180512202);
        map.put(new Student("c",20,169.70),180512203);
        map.put(new Student("d",18,173.20),180512204);
        map.put(new Student("e",21,172.40),180512205);
        return map;
    }

    public static void main(String[] args) {
        TreeMap<Student,Integer> tm = init();
        Set<Map.Entry<Student, Integer>> entrySet = tm.entrySet();
        entrySet.forEach(System.out::println);
    }
}


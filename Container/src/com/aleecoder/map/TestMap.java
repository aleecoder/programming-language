package com.aleecoder.map;

import java.util.*;

/**
 * HashMap实现类
 * 特点：无序、唯一
 * 按照key进行  底层key遵照哈希表的结构（数组+链表）    哈希表必须重写hashCode和equals方法
 *
 * Hashtable实现类：since jdk1.0 效率低、线程安全、key不可为null值
 * HashMap实现类： since jdk1.2 效率高、线程不安全、key可以为null值
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class TestMap {
    public static Map<String,Integer> init(){
//        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map = new LinkedHashMap<>();
//        Map<String,Integer> map = new Hashtable<>();
        map.put(null,111);
        map.put("java",10);
        map.put("python",12);
        map.put("scala",19);
        map.put("java",20);
        return map;
    }

    public static void main(String[] args) {
        Map<String,Integer> map = init();
        Map<String,Integer> map2 = init();
        System.out.println(map);
        System.out.println(map.containsKey("java"));
        System.out.println(map.containsValue(10));
        System.out.println(map.get("java"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map == map2);    // false
        System.out.println(map.equals(map2));       // true

        map.remove("java");
        System.out.println(map);
        // keySet()对集合中的key进行遍历查看
        final Set<String> keySet = map.keySet();
        keySet.forEach(System.out::println);

        // values()对集合中的value进行遍历查看
        final Collection<Integer> values = map.values();
        values.forEach(System.out::println);

        // entrySet()
        final Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        entrySet.forEach(System.out::println);
    }
}

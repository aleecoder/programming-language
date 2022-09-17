package com.aleecoder.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author HuanyuLee
 * @date 2022/3/25
 */
public class TestHashMap {
    public static HashMap<Integer,String> init(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(12,"丽丽");
        map.put(13,"菲菲");
        map.put(11,"露露");
        map.put(14,"明明");
        map.put(12,"莹莹");
        return map;
    }

    public static void main(String[] args) {
        HashMap<Integer,String> hm = init();
        System.out.println("集合的长度："+hm.size());
        System.out.println("集合中内容查看："+hm);
    }
}

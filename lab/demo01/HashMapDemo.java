package Java.lab.demo01;

import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,Student> map = new HashMap<>();
       // HashMap<Integer,TreeMap<Integer,Student>> map = new HashMap<>();
        Student s1 = new Student("小明",60);
        Student s2 = new Student("小红",170);
        Student s3 = new Student("小芳",80);
        Student s4 = new Student("小强",90);
        Student s5 = new Student("小张",100);
        Student s6 = new Student("小刚",110);
        Student s7 = new Student("小李",120);
        Student s8 = new Student("小赵",130);
        Student s9 = new Student("小王",140);
        Student s10 = new Student("小薇",150);
        map.put(180501, s1);
        map.put(180502, s2);
        map.put(180503, s3);
        map.put(180514, s4);
        map.put(180505, s5);
        map.put(180506, s6);
        map.put(180507, s7);
        map.put(180508, s8);
        map.put(180509, s9);
        map.put(180510, s10);
        Map<Integer,Student> smap = new TreeMap<Integer, Student>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                });
        //遍历操作
        System.out.println("A班班级学生信息如下：");
        //Set<Integer> keys = map.keySet();
        Set<Integer> keys = map.keySet();
        for (Integer key:keys) {
            System.out.println("学号："+key+"\t"+map.get(key));
        }

        System.out.println("删除学生：");
        Scanner sca = new Scanner(System.in);
        System.out.print("请输入要删除的学生学号：");
        int number = sca.nextInt();
        map.remove(number);
        System.out.println(smap.containsKey(number)?"删除失败！":"删除成功！");
        for (Integer key:keys) {
            System.out.println("学号："+key+"\t"+map.get(key));
        }
        System.out.println("添加学生：");
        System.out.print("请输入学生学号：");
        number = sca.nextInt();
        System.out.print("请输入学生姓名：");
        String name = sca.next();
        System.out.print("请输入学生成绩：");
        int result = sca.nextInt();
        Student s11 = new Student(name,result);
        map.put(number,s11);
        System.out.println(map.containsKey(number)?"添加成功！":"添加失败!");
        for (Integer key:keys) {
            System.out.println("学号："+key+"\t"+map.get(key));
        }
    }
}

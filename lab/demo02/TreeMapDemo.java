package Java.lab.demo02;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
/*
实验二第2题测试用例，基于实验一
对实验一的代码进行改进，减少了代码冗余
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, HashMap<String, Integer>> treeMap = new TreeMap<>(
                new Comparator<Integer>() {
                    //降序排序
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                }
        ); // 创建集合对象
        //学生的学号
        int[] student_id = {180401,180502,180503,180904,181005,180306,180407,180108,180609,190510};
        //学生的姓名
        String[] student_name = {"小明","小红","小芳","小强","小张","小刚","小李","小赵","小王","小薇"};
        //学生对应的分数
        int[] student_result ={60,170,80,90,100,110,120,130,140,150};
        for (int i = 0; i < 10; i++) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put(student_name[i],student_result[i]);
            treeMap.put(student_id[i], hashMap);
        }
        // 获取学号
        Set<Integer> mapSet = treeMap.keySet();
        System.out.println("学生信息(学号按从大到小输出):");
        // 循环遍历
        for (Integer Mapkey2 : mapSet) {
            // 由学号获取每个学生键值对<姓名，成绩>
            HashMap<String, Integer> Value1 = treeMap.get(Mapkey2);
            // 获取value构成集合
            Set<String> MapValueSet1 = Value1.keySet();
            for (String MapValueKey2 : MapValueSet1) {
                Integer MapValueValue2 = Value1.get(MapValueKey2);
                System.out.println("学号："+Mapkey2 + "\t\t姓名：" + MapValueKey2 + "\t\t成绩：" + MapValueValue2);
            }
        }
    }
}

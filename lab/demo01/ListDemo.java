package Java.lab.demo01;
import java.util.*;
public class ListDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        /*生成10个1至100之间的不同的随机整数
         将生成的随机数存在HashSet集合里，
         因为由HashSet类实现的Set集合中的对象是唯一的
         */
        Set<Integer> hashSet = new HashSet<>();
        while (hashSet.size()<10){
            int random =rd.nextInt(100)+1;
            hashSet.add(random);
        }
        System.out.print("随机数：");
        System.out.println(hashSet);
        for (Integer i:hashSet) {
            System.out.print(i+"\t");
        }
        //将产生的数据存储到一个List集合中
        List<Integer> list = new LinkedList<>() ;
        list.addAll(hashSet);
        System.out.println();
        fun(list,1,50);
        //使用Collections的sort方法对集合进行排序。
        Collections.sort(list);
        System.out.println("排序后："+list);
    }
    /*定义个fun(List list, int min, int max)，
    功能为：遍历集合中的元素并删除集合list中在[min,max]间的数据；
     */
    public static  void fun(List<Integer> list,int min,int max){
        List<Integer> list1 = new LinkedList<>();
        for (int i=0;i<list.size();i++) {
            if (list.get(i)>=min && list.get(i)<=max){
                list1.add(list.get(i));
            }
        }
        list.removeAll(list1);
        System.out.println("删除指定范围的元素后"+list);
    }
}

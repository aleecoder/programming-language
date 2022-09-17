package Java.Test.重点程序.ch9_集合.demo01;

import java.util.Iterator;
import java.util.TreeSet;

public class Example9_13 {

    public static void main(String[] args) {
        Person person1 = new Person("马先生", 220181);
        Person person2 = new Person("李先生", 220186);
        Person person3 = new Person("王小姐", 220193);
        Person person4 = new Person("尹先生", 220196);
        Person person5 = new Person("王先生", 220175);
        TreeSet<Person> treeSet = new TreeSet<Person>();
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);
        treeSet.add(person5);
        System.out.println("初始化的集合：");
        Iterator<Person> it = treeSet.iterator();
        while (it.hasNext()) { // 遍例集合
            Person person = it.next();
            System.out.println("------ " + person.getId_card() + "  "
                    + person.getName());
        }
        System.out.println("截取前面部分得到的集合：");
        it = treeSet.headSet(person1).iterator();// 截取在集合中排在马先生（不包括）之前的人
        while (it.hasNext()) {
            Person person = it.next();
            System.out.println("------ " + person.getId_card() + "  "
                    + person.getName());
        }
        System.out.println("截取中间部分得到的集合：");
        // 截取在集合中排在马先生（包括）和王小姐（不包）之间的人
        it = treeSet.subSet(person1, person3).iterator();
        while (it.hasNext()) {
            Person person = it.next();
            System.out.println("------ " + person.getId_card() + "  "
                    + person.getName());
        }
        System.out.println("截取后面部分得到的集合：");
        it = treeSet.tailSet(person3).iterator(); // 截取在集合中排在王小姐（包括）之后的人
        while (it.hasNext()) {
            Person person = it.next();
            System.out.println("------ " + person.getId_card() + "  "
                    + person.getName());
        }
    }

}


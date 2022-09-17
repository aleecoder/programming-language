package Java.lab.demo02;
import java.util.*;
/*
实验二第1题测试用例
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student(180512201,"红红",18,100);
        Student s2 = new Student(180512202,"兰兰",19,90);
        Student s3 = new Student(180512203,"小王",17,77);
        Student s4 = new Student(180512204,"小赵",13,33);
        Student s5 = new Student(180512205,"小鹏",20,99);
        Student s6 = new Student(180512206,"小薇",21,100);
        Student s7 = new Student(180512207,"小华",22,98);
        Student s8 = new Student(180512208,"明月",25,96);
        Student s9 = new Student(180512209,"明星",31,94);
        Student s10 = new Student(180512210,"明天",16,95);

        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s5);
        treeSet.add(s4);
        treeSet.add(s6);
        treeSet.add(s7);
        treeSet.add(s8);
        treeSet.add(s9);
        treeSet.add(s10);
        Iterator<Student> it = treeSet.iterator();
        System.out.println("按年龄升序输出：");
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.toString());
        }

        Student.StudentCompatator stu = new Student.StudentCompatator();
        TreeSet<Student> treeSet2 = new TreeSet<>(stu);
        treeSet2.addAll(treeSet);
        it = treeSet2.iterator();
        System.out.println("按成绩升序输出：");
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.toString());
        }
    }
}

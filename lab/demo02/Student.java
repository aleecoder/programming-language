package Java.lab.demo02;

import java.util.Comparator;
public class Student implements Comparable<Student>{
    private long id;            //学号
    private String name;		//姓名
    private int result;			//成绩
    private int age;            //年龄

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student(long id,String name, int age, int result){
        this.id = id;
        this.name = name;
        this.age = age;
        this.result = result;
    }
    public String toString(){
        String str = "学号："+this.id+"\t姓名："+this.name+"\t年龄："+this.age+"\t成绩："+this.result;
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //默认按年龄升序排序
    @Override
    public int compareTo(Student o) {
        Student s = o;
        //int result = id > s.id?1:(id == s.id?0:-1);
        int result = age > s.age?1:(age == s.age?0:-1);
        return result;
    }
    //定义内部类
    static class StudentCompatator implements Comparator<Student>{
        //成绩升序
        @Override
        public int compare(Student o1, Student o2) {
            Student s1 = o1;
            Student s2 = o2;
            int result = (int)(s1.getResult()-s2.getResult());
            return result;
        }
    }

}

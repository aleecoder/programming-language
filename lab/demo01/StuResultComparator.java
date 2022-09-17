package Java.lab.demo01;

import java.util.Comparator;

public class StuResultComparator implements Comparator<Student> {
   public int compare(Student s1,Student s2) {
        int num = s1.getName().compareTo(s2.getName());
        if (num == 0) {
            return new Integer(s1.getResult()).compareTo(new Integer(s2.getResult()));
        }
        return num;
    }
}

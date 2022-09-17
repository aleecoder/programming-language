package Java.Test.题库.填空.demo04;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.fliton());
    }
    public int fliton(){
        try{
            //创建test.txt文件的FileInputStream对象，对象引用名为din
            FileInputStream din = new FileInputStream("test.txt");
            din.read();
        }catch (IOException ioe){
            System.out.println("one");
            return -1;
        }
        finally {
            System.out.println("two");
        }
        return 0;
    }
}

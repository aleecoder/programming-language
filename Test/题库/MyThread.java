package Java.Test.题库;

import java.io.File;

public class MyThread implements Runnable {
    String myString = "Yes";
    @Override
    public void run() {
        this.myString = "No";
    }

    public static void main(String[] args) {
        File f = new File("E:\\xxx\\yyy");
        f.mkdirs();
        MyThread t = new MyThread();
        new Thread(t).start();
        for (int i = 0; i < 10; i++) {
            System.out.println(t.myString);
        }
    }
}

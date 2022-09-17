package Java.Test.题库.demo08;

public class ThreadTest {
    public static void main(String[] args) {
        PrintThread pt1,pt2;
        pt1 = new PrintThread("线程Ⅰ正在运行！");
        pt2 = new PrintThread("线程Ⅱ正在运行！");
        pt1.setPriority(10);
        pt2.setPriority(6);
        pt1.start();
        pt2.start();
    }

    static class PrintThread extends Thread{
        String name;
        public PrintThread(String threadName){
            name = threadName;
        }
        public void run(){
            for (int i = 0; i < 2; i++) {
                System.out.println(name);
            }
        }
    }
}


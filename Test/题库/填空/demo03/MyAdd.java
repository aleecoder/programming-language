package Java.Test.题库.填空.demo03;

public class MyAdd extends Thread {
    static int total = 10;
    int n;
    public MyAdd(int n){
        this.n = n;
    }

    @Override
    public void run() {
        try {
            sleep(n);
            total += n;
            System.out.println(total);
        }catch (Exception e){
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        MyAdd t1 = new MyAdd(3000);
        t1.start();
    }
}

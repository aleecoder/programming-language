package Java.Test;

public class Hello extends Thread{
    static int total = 10;
    int n;
    public Hello(int n){
        this.n = n;
    }

    @Override
    public void run() {
        try{
            sleep(n);
            total +=n;
            System.out.println(total);
        }catch (Exception e){
            System.out.println("EXCEPTION!");
        }
    }

    public static void main(String[] args) {
        Hello t1 = new Hello(3000);
        Hello t2 = new Hello(1000);
        t1.start();
        t2.start();
    }
}

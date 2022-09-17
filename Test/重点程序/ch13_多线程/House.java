package Java.Test.重点程序.ch13_多线程;

public class House implements Runnable {
    int waterAmount;       //用int变量模拟水量
    boolean flag = true;
    public void setWater(int w) {
        waterAmount = w;
    }
    public void run() {
        while(flag) {
            String name=Thread.currentThread().getName();
            if(name.equals("狗")) {
                if (waterAmount >= 2)
                    eatWater("狗",2);
                else
                    break;
            }
            else if(name.equals("猫")){
                if (waterAmount>=1)
                    eatWater("猫",1);
                else
                    break;
            }
            try{
                Thread.sleep(2000);  //间隔时间
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public synchronized void eatWater(String animalName,int water){
        System.out.println(animalName+"喝水") ;
        waterAmount -= water;
        System.out.println(" 剩 "+waterAmount);
    }
    public static void main(String args[ ]) {
        House house = new House();
        house.setWater(10);
        Thread dog,cat;
        dog=new Thread(house);
        cat=new Thread(house);  //cat和dog的目标对象相同
        dog.setName("狗");
        cat.setName("猫");
        dog.start();
        cat.start();
    }
}

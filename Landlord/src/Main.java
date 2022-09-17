
/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/30  0:39
 * @Description: 计分测试
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        People p1 = new People("A",0,false,false);
        People p2 = new People("B",0,false,false);
        People p3 = new People("C",0,false,false);
        Fight f = new Fight();
        f.showGame();
        f.multiplier = 1;
        while (!f.getIsQuit()){
            f.setFamousBrand();
            f.setEndScore();
            f.setLandGrabbers();
            f.setLandlord(p1,p2,p3);
            f.setBombs();
            f.setSuccess(p1,p2,p3);
            f.setSpring();
            f.setMultiplier();
            System.out.println("倍数："+f.getMultiplier());
            f.setScores(p1,p2,p3);
            f.printScores(p1,p2,p3);
            f.clear(p1,p2,p3);
            f.setIsQuit();
        }
    }
}
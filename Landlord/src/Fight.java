import java.util.Scanner;

/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/30  0:02
 * @Description: 斗地主
 * @version: 1.0
 */
public class Fight {
    Scanner sc = new Scanner(System.in);
    private boolean isQuit;
    private int endScore;   // 底分
    private boolean isFamousBrand;  // 明牌
    private boolean isSpring;   // 春天
    public int multiplier;     // 倍数
    private int landGrabbers;   // 抢地主
    private int bombs;  // 炸弹

    public void showGame(){
        System.out.println("========================斗地主计分系统========================");
    }

    public boolean getIsQuit() {
        return isQuit;
    }

    public void setIsQuit() {
        System.out.print("是否退出游戏[y/n]: ");
        String s = sc.next();
        this.isQuit = "y".equals(s);
    }

    public People getLandlord(People p1, People p2, People p3){
        if (p1.isLandlord()) return p1;
        if (p2.isLandlord()) return p2;
        return p3;
    }
    public People[] getFarmers(People p1, People p2, People p3){
        if (p1 == getLandlord(p1,p2,p3))
            return new People[]{p2,p3};
        else if (p2 == getLandlord(p1,p2,p3))
            return new People[]{p1,p3};
        else
            return new People[]{p1,p2};
    }
    public void setLandlord(People p1, People p2, People p3){
        System.out.print("谁是地主[" + p1.getName()+"/"+p2.getName()+"/"+p3.getName()+"]: ");
        String landlord = sc.next();
        if (landlord.equals(p1.getName()))
            p1.setLandlord(true);
        if (landlord.equals(p2.getName()))
            p2.setLandlord(true);
        if (landlord.equals(p3.getName()))
            p3.setLandlord(true);
    }

    public int getEndScore(){
        return endScore;
    }
    public void setEndScore(){
        System.out.print("底分[1/2/3]: ");
        int endScore = sc.nextInt();
        if (endScore >= 1 && endScore <= 3)
            this.endScore = endScore;
        else
            this.endScore = 3;
    }

    public int getLandGrabbers() {
        return landGrabbers;
    }
    public void setLandGrabbers(){
        System.out.print("抢地主的次数[0/1/2/3]:");
        int landGrabbers = sc.nextInt();
        if (landGrabbers > 0 && landGrabbers <= 3)
            this.landGrabbers = landGrabbers;
        else
            this.landGrabbers = 0;
    }

    public boolean isFamousBrand() {
        return isFamousBrand;
    }

    public void setFamousBrand() {
        System.out.print("是否明牌[y/n]: ");
        String isFamousBrand = sc.next();
        this.isFamousBrand = "y".equals(isFamousBrand);
    }

    public boolean isSpring() {
        return isSpring;
    }

    public void setSpring() {
        System.out.print("是否春天[y/n]: ");
        String isSpring = sc.next();
        if ("y".equals(isSpring))
            this.isSpring = true;
    }

    public int getBombs() {
        return bombs;
    }

    public void setBombs() {
        System.out.print("炸弹的个数: ");
        int bombs  = sc.nextInt();
        if (bombs >= 0)
            this.bombs = bombs;
    }

    public int getMultiplier() {
        return multiplier;
    }
    public void setMultiplier() {
        if (isFamousBrand())  this.multiplier += 6;
        this.multiplier += getLandGrabbers()*2;
        this.multiplier += getBombs()*2;
        if (isSpring()) this.multiplier += 4;
    }
    public void setSuccess(People p1,People p2,People p3){
        People p = getLandlord(p1,p2,p3);
        System.out.print("地主是否胜利[y/n]: ");
        String success = sc.next();
        p.setSuccess("y".equals(success));
        if (p.isSuccess()){
            for (int i = 0; i < 2; i++)
                getFarmers(p1,p2,p3)[i].setSuccess(false);
        }else {
            for (int i = 0; i < 2; i++)
                getFarmers(p1,p2,p3)[i].setSuccess(true);
        }
    }
    public void setScores(People p1,People p2,People p3){
        p1.setScores(p1.isLandlord(),p1.isSuccess(),getEndScore(),getMultiplier());
        p2.setScores(p2.isLandlord(),p2.isSuccess(),getEndScore(),getMultiplier());
        p3.setScores(p3.isLandlord(),p3.isSuccess(),getEndScore(),getMultiplier());
    }

    public void printScores(People p1,People p2,People p3){
        System.out.println("====================本局得分============================");
        System.out.print(p1.getName()+"的得分 = " + p1.getScores()+"\n");
        System.out.print(p2.getName()+"的得分 = " + p2.getScores()+"\n");
        System.out.print(p3.getName()+"的得分 = " + p3.getScores());
        System.out.println("\n================================================");
    }
    public void clear(People p1,People p2,People p3){
        p1.setSuccess(false);
        p2.setSuccess(false);
        p3.setSuccess(false);
        p1.setLandlord(false);
        p2.setLandlord(false);
        p3.setLandlord(false);
        multiplier = 1;
    }
}
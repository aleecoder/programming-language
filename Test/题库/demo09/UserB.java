package Java.Test.题库.demo09;

public class UserB extends Thread {
    private ATM atm;
    private float money;
    public UserB(ATM atm,float money){
        this.atm = atm;
        this.money = money;
    }

    @Override
    public void run() {
        System.out.println("B取钱:"+money);
        try{
            atm.drawMoney(money);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("账户余额："+atm.getAccountBalance());
    }
}

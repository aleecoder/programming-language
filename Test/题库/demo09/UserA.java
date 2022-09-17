package Java.Test.题库.demo09;

public class UserA extends Thread {
    private ATM atm;
    private float money;
    public UserA(ATM atm,float money){
        this.atm = atm;
        this.money = money;
    }

    @Override
    public void run() {
        System.out.println("A存钱："+money);
        try{
            atm.deposit(money);
        }catch (Exception ignored){}
        System.out.println("账户余额："+atm.getAccountBalance());
    }
}

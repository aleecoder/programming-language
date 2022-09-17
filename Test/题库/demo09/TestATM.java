package Java.Test.题库.demo09;

public class TestATM {
    public static void main(String[] args) {
        ATM atm = new ATM(200);
        System.out.println("账户余额："+atm.getAccountBalance());
        UserA userA = new UserA(atm,100);
        UserB userB = new UserB(atm,50);
        userA.start();
        try{
            userA.join();
//            System.out.println(userB.isAlive());
        }catch (Exception e){
            e.printStackTrace();
        }
        userB.start();
//        System.out.println(userB.isAlive());
    }
}

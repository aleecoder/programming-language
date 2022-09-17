package Java.Test.题库.demo09;

public class ATM {
    private float accountBalance;
    public ATM(float accountBalance){
        this.accountBalance = accountBalance;
    }
    public synchronized float getAccountBalance(){
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
        return accountBalance;
    }
    public synchronized void deposit(float money){
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        accountBalance += money;
    }
    public synchronized void drawMoney(float money) throws Exception{
        if (accountBalance<money)
            throw new Exception("账户余额不足!");
        else {
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
            accountBalance -= money;
        }
    }
}

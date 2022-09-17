package Java.lab.demo06;

public class Wallet implements Runnable {
    private int walletMoney;
    private final int dad_getMoney = 100;
    private final int mom_getMoney = 150;
    private final int son_getMoney = 20;
    public void setWallet(int wallet){
        this.walletMoney = wallet;
    }
    @Override
    public  void run() {
        String name = Thread.currentThread().getName();
        while (walletMoney>0){
            if (name.equals("dad"))
                getMoney(dad_getMoney);
            else if (name.equals("mom"))
                getMoney(mom_getMoney);
            else if (name.equals("son"))
                getMoney(son_getMoney);
            try{
                Thread.sleep((int)Math.random()*1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public synchronized void getMoney(int money){
        String name = Thread.currentThread().getName();
        if (walletMoney>0){
            if (name.equals("dad")){
                getMoney(name,dad_getMoney);
            }
            else if (name.equals("mom")){
                getMoney(name,mom_getMoney);
            }
            else {
                getMoney(name,son_getMoney);
            }
            showWalletMoney(walletMoney);
        }
    }
    //显示钱包余额
    public void showWalletMoney(int walletMoney){
        if (walletMoney>0)
            System.out.println("钱包余额:$"+walletMoney);
        else
            System.out.println("The wallet is empty!");
    }
    //显示取钱情况
    public void showGetMoney(String name,int getMoney){
        if (getMoney>0)
            System.out.println("The "+name+" get money $"+getMoney+"!");
    }
    //取钱操作
    public void getMoney(String name,int getMoney){
        System.out.println("------------------------------");
        System.out.println("The "+name+" is getting money!");
        if (walletMoney >= getMoney){
            showGetMoney(name,getMoney);
            walletMoney -= getMoney;
        }else {
            showGetMoney(name,walletMoney);
            walletMoney = 0;
        }
    }
    //测试
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.setWallet(1000);
        //创建线程
        Thread dad,mom,son;
        dad = new Thread(wallet);
        mom = new Thread(wallet);
        son = new Thread(wallet);
        dad.setName("dad");
        mom.setName("mom");
        son.setName("son");
        //启动线程
        dad.start();
        mom.start();
        son.start();
    }
}
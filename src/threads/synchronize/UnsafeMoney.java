package threads.synchronize;

/**
 * 线程不安全
 * 模拟取钱
 *
 */
public class UnsafeMoney {

    public static void main(String[] args) {
        Account account = new Account(100,"结婚礼金");
        Drawing you = new Drawing(account,80,"可悲得你");
        Drawing wife = new Drawing(account,90,"happy的她");
        you.start();
        wife.start();
    }
}
class Account{
    int money;
    String name;
    public Account(int money, String name){
         this.money = money;
         this.name = name;
    }
}


class Drawing extends Thread{
    Account account;
    int drawingMoney;
    int drawingTotal;
    int packetTotal;

    public Drawing(Account account,int drawingMoney,String name){
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }
    @Override
    public void run(){
        if(account.money - drawingMoney < 0){
            return;
        }
        // 模拟取钱的延时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money -= drawingMoney;
        packetTotal += drawingMoney;
        System.out.println(this.getName() + "--->" + "账户余额为：" + account.money);
        System.out.println(this.getName() + "--->" + "口袋的钱为：" + packetTotal);
    }
}
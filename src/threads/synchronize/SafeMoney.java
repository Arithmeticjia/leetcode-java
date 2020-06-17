package threads.synchronize;

/**
 * 线程安全
 * 模拟取钱
 * 锁account对象
 */
public class SafeMoney {

    public static void main(String[] args) {
        Account account = new Account(1000,"结婚礼金");
        SafeDrawing you = new SafeDrawing(account,80,"可悲得你");
        SafeDrawing wife = new SafeDrawing(account,90,"happy的她");
        you.start();
        wife.start();
    }
}

//class Account{
//    int money;
//    String name;
//    public Account(int money, String name){
//         this.money = money;
//         this.name = name;
//    }
//}


class SafeDrawing extends Thread{
    Account account;
    int drawingMoney;
    int drawingTotal;
    int packetTotal;

    public SafeDrawing(Account account,int drawingMoney,String name){
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }
    // 这里锁定SafeDrawing对象是没有用的，要锁Account
    @Override
    public void run(){
        // 加个判断，提高性能
        if(account.money <= 0){
            return;
        }
        synchronized (account){
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
}
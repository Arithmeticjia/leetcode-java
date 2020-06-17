package threads.synchronize;

public class UnsafeThread {

    public static void main(String[] args) {

        UnsafeWeb12306 web12306 = new UnsafeWeb12306();

        new Thread(web12306, "张三").start();
        new Thread(web12306, "李四").start();
        new Thread(web12306, "王五").start();
    }
}


class UnsafeWeb12306 implements Runnable{

    // 票数
    private int tickerNum = 10;
    private boolean flag = true;
    @Override
    public void run() {
        while (flag){
            BuyTicket();
        }
    }

    public void BuyTicket(){
        while (true){
            if(tickerNum < 0){
                flag = false;
                return;
            }
            // 模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "--->" + tickerNum--);
        }
    }
}
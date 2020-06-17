package threads.synchronize;

/**
 * 抢票
 * 同步/线程安全
 */
public class SafeThread {

    public static void main(String[] args) {

        SafeWeb12306 web12306 = new SafeWeb12306();

        new Thread(web12306, "张三").start();
        new Thread(web12306, "李四").start();
        new Thread(web12306, "王五").start();
    }
}


class SafeWeb12306 implements Runnable{

    // 票数
    private int tickerNum = 10;
    private boolean flag = true;
    @Override
    public void run() {
        while (flag){
            BuyTicket();
        }
    }

    // synchronized锁住了web12306对象
    public synchronized void BuyTicket(){
        while (true){
            if(tickerNum <= 0){
                flag = false;
                return;
            }
            // 模拟延时
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "--->" + tickerNum--);
        }
    }
}
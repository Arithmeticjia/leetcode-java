package threads;

public class BuyFood {


    public static void main(String[] args) throws InterruptedException{
        System.out.println("---主线程开始---");
//        Thread t1 = new ThreadOne();
        new Thread(new ThreadOne()).start();

    }
}

class ThreadOne extends Thread{
    @Override
    public void run() {
        System.out.println("线程1开始");
        System.out.println("线程2插队");
        Thread t = new Thread(new ThreadTwo());
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程1结束");
    }
}

class ThreadTwo extends Thread{
    @Override
    public void run() {
        System.out.println("线程2开始");
        for(int i = 0;i < 10;i++){
            System.out.println(i+"秒过去了");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("线程2结束");
    }
}
package learn_synchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test_volatile {

    /**
        可见性
     */
    public volatile int inc = 0;

    public synchronized void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final test_volatile test = new test_volatile();
        ExecutorService addTreads = Executors.newFixedThreadPool(10);
        for (int i =1; i <= 10;i++){
            final int index=i ;
            addTreads.execute(new Runnable(){
                @Override
                public void run() {
                    System.out.println("\n第"+index+"个线程"+Thread.currentThread().getName());
                    for(int j = 0;j < 1000;j++) {
                        test.increase();
                    }
                }

            });
        }
        addTreads.shutdown();
        // 若关闭后所有任务都已完成，则返回true。
        // 注意除非首先调用shutdown或shutdownNow，否则isTerminated永不为true。
        // 返回：若关闭后所有任务都已完成，则返回true
        while (!addTreads.isTerminated()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("\n结束了！");
        System.out.println("\n"+test.inc);
    }
}

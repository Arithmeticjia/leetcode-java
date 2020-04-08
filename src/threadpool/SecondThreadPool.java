package threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ArithmeticJia
 * 当池中正在运行的线程数大于等于corePoolSize时，新插入的任务进入workQueue排队（如果workQueue长度允许），等待空闲线程来执行
 */
public class SecondThreadPool {

    public static void main(String[] args){
        ThreadFactory namedThreadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return null;
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,10,5, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(Integer.MAX_VALUE));
        // 任务1
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("-------------helloworld_001---------------" + Thread.currentThread().getName());
            }
        });

        try {
            //主线程睡2秒
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 任务2
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("-------------helloworld_002---------------" + Thread.currentThread().getName());
            }
        });

        // 任务3
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("-------------helloworld_003---------------" + Thread.currentThread().getName());
            }
        });
        // shutdown就是不再接受新的任务，然后等待线程池全部执行完毕
        threadPoolExecutor.shutdown();
        // 若关闭后所有任务都已完成，则返回true。
        // 注意除非首先调用shutdown或shutdownNow，否则isTerminated永不为true。
        // 返回：若关闭后所有任务都已完成，则返回true
        // 等待线程池返回结束标志，如果为true，表示全部结束，退出while等待循环
        while (!threadPoolExecutor.isTerminated()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("\n结束了！");
    }
}


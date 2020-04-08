package threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ArithmeticJia
 * 当队列里的任务数达到上限，并且池中正在运行的线程数等于maximumPoolSize，对于新加入的任务，执行拒绝策略（线程池默认的拒绝策略是抛异常）。
 * 当任务5加入时，队列达到上限，池内运行的线程数达到最大，故执行默认的拒绝策略，抛异常。
 */
public class FourthThreadPool {

    public static void main(String[] args){
        ThreadFactory namedThreadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return null;
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,3,5, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(1));
        // 任务1
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3 * 1000);
                    System.out.println("-------------helloworld_001---------------" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 任务2
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep( 5 * 1000);
                    System.out.println("-------------helloworld_002---------------" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 任务3
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("-------------helloworld_003---------------" + Thread.currentThread().getName());
            }
        });

        // 任务4
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2 * 1000);
                    System.out.println("-------------helloworld_004---------------" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 任务5
        threadPoolExecutor.execute(new Runnable() {

            @Override
            public void run() {
                System.out.println("-------------helloworld_005---------------" + Thread.currentThread().getName());
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


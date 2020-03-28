package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Arithmetic
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        for (int i =1; i<=10;i++){
            final int index=i ;
            fixedThreadPool.execute(new Runnable(){
                @Override
                public void run() {
                    try {
                        System.out.println("第" +index + "个线程" +Thread.currentThread().getName());
                        Thread.sleep(1000);
                    }  catch(InterruptedException  e ) {
                        e .printStackTrace();
                    }
                }

            });
        }
        fixedThreadPool.shutdown();

    }
}
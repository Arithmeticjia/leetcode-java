package AlwaysTest;

import threads.OverrideRunnable;

/**
 * 可重入锁 synchronized
 */
public class HelloTestNew implements Runnable{

    int i = 0;
    int j = 0;
    @Override
    public void run() {
        for(int j = 0;j < 1000000;j++){

            //this,当前实例对象锁
            synchronized(this){
                i++;
                increase();//synchronized的可重入性
            }
        }
    }

    public synchronized void increase(){
        j++;
    }

    public static void main(String[] args) throws InterruptedException {
        HelloTestNew helloTestNew = new HelloTestNew();
        Thread t1 = new Thread(helloTestNew);
        Thread t2 = new Thread(helloTestNew);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(helloTestNew.i);
    }
}

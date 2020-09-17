package AlwaysTest;

/**
 * 可重入锁
 */
public class HelloTest implements Runnable{
    static HelloTest instance = new HelloTest();
    static int i = 0;
    static int j = 0;
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
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}

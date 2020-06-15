package threads;


/**
 * 通过Runnable接口创建线程类
 * （1）定义runnable接口的实现类，并重写该接口的run()方法，该run()方法的方法体同样是该线程的线程执行体。

 * （2）创建 Runnable实现类的实例，并依此实例作为Thread的target来创建Thread对象，该Thread对象才是真正的线程对象。
 *
 * （3）调用线程对象的start()方法来启动该线程。
 */
public class OverrideRunnable implements Runnable{

    private int i;

    @Override
    public void run() {
        for(i = 0;i < 100;i++) {
            //当线程类实现Runnable接口时，要获取当前线程对象只有通过Thread.currentThread()获取
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for(int i = 0;i < 100;i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i == 20) {
                OverrideRunnable overrideRunnable = new OverrideRunnable();
                new Thread(overrideRunnable,"线程1").start();
                new Thread(overrideRunnable,"线程2").start();
            }
        }
    }
}

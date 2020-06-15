package threads;

/**
 * 一、继承Thread类创建线程类
 *
 * （1）定义Thread类的子类，并重写该类的run方法，该run方法的方法体就代表了线程要完成的任务。因此把run()方法称为执行体。
 *
 * （2）创建Thread子类的实例，即创建了线程对象。
 *
 * （3）调用线程对象的start()方法来启动该线程。
 *
 *  本例有三个线程：main、Thread-0 、Thread-1
 */
public class ExtendThread extends Thread{

    int i = 0;

    @Override
    public void run() {
        for (; i < 100; i++) {
            //返回当前线程的名字
            System.out.println(getName() + "  " + i);
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            //调用Thread类的currentThread()方法获取当前线程
            System.out.println(Thread.currentThread().getName() + "  : " + i);
            if (i == 50) {
                //创建并启动第一个线程
                new ExtendThread().start();
                //创建并启动第二个线程
                new ExtendThread().start();
            }
        }
    }
}

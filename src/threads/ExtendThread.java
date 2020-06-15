package threads;

/**
 * 一、继承Thread类创建线程类
 *
 * （1）定义Thread类的子类，并重写该类的run方法，该run方法的方法体就代表了线程要完成的任务。因此把run()方法称为执行体。
 *
 * （2）创建Thread子类的实例，即创建了线程对象。
 *
 * （3）调用线程对象的start()方法来启动该线程。
 */
public class ExtendThread extends Thread{

    int i = 0;

    // 重写run方法，run方法的方法体就是现场执行体
    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + "  " + i);
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "  : " + i);
            if (i == 50) {
                new ExtendThread().start();
                new ExtendThread().start();
            }
        }
    }
}

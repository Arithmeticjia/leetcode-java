package learn_synchronized;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import serializable.TransientTest;

public class learn_synchronized {

    private static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        // 线程1不断运行，此时线程2对共享变量的修改不会被线程1读取到
        new Thread(() ->{
            while (flag){

            }
        }
        ).start();

        Thread.sleep(2000);

        new Thread(() -> {
            flag = false;
            System.out.println("线程修改了变量的值为false");
        }
        ).start();
    }
}

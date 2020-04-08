package learn_synchronized;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示原子性
 */
public class learn_atomicity {

    public static int number = 0;
    public static void main(String[] args) throws InterruptedException {

        // number加到6000
        Runnable increament = () -> {
            for(int i =0; i < 5000;i++){
                //
                number++;
            }
        };

        List<Thread> list = new ArrayList<>();

        // 启动5个线程
        for(int i = 0; i < 5; i++){
            Thread t = new Thread(increament);
            t.start();
            list.add(t);
        }

        // join保证了线程全部执行完后主程序退出
        for(Thread t: list){
            t.join();
        }
        // 打印number的值
        System.out.println(number);
    }
}

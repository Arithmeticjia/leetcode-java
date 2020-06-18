package threads.synchronize;

import java.util.ArrayList;
import java.util.List;

/**
 * 不安全的容器操作
 */
public class UnsafeArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i = 0;i < 10000;i++){
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        System.out.println(list.size());
    }
}

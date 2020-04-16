package fastfail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fastFail {

    private static List<String> list = new ArrayList<>();
    public static void main(String[] args){
        new ThreadOne().start();
        new ThreadTwo().start();
    }

    public static void printAll(){
        String value = null;
        Iterator<String> iter = list.iterator();
            while(iter.hasNext()){
                value = (String)iter.next();
                System.out.println(value);
            }


        }

    public static class ThreadOne extends Thread {
        @Override
        public void run(){
            for(int i = 0;i < 50;i++){
                list.add(String.valueOf("线程1"+i));
                printAll();
            }
        }
    }
    public static class ThreadTwo extends Thread {
        @Override
        public void run(){
            for(int i = 0;i < 50;i++){
                list.add(String.valueOf("线程2"+i));
                printAll();
            }
        }
    }
}

package learn_synchronized;

class Counter {
    int count = 0;
    public synchronized void add(int n){
        count += n;
    }

    public synchronized void dec(int n){
        count -= n;
    }

    public int get(){
        return count;
    }
}

class AddThread extends Thread {
    Counter counter;
    // 构造函数
    public AddThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i = 0; i < Main.Loop;i++){
            counter.add(1);
        }
    }
}

class DecThread extends Thread {
    Counter counter;
    public DecThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for(int i = 0; i < Main.Loop; i++){
            counter.dec(1);
        }
    }
}

public class Main {

    final static int Loop = 10000;
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new AddThread(counter);
        Thread t2 = new DecThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.get());
    }

}

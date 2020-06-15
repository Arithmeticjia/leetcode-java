package threads;

/**
 * 插队join
 */
public class BlockJoin extends Thread{

    @Override
    public void run() {
        //重写run()方法
        for(int i = 0; i < 100;i++){
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // run()普通方法调用
        // new ExtendThread().run();
        Thread t = new BlockJoin();
        t.start();
        for(int i = 0;i < 100;i++){
            if(i == 20){
                t.join();//插队 main被阻塞了
            }
            System.out.println("main..." + i);
        }
    }
}

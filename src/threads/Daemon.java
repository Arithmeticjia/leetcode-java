package threads;

/**
 * 守护线程
 * 虚拟机等待所有用户线程执行完毕，才会停止，但是不会等待守护线程
 *
 */
public class Daemon {

    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        Thread t = new Thread(god);
        // 将用户线程设置为守护，虚拟机不用等待守护线程执行完成
        t.setDaemon(true);

//        new Thread(god).start();
        new Thread(you).start();
    }
}


class You implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i < 365 * 100; i++){
            System.out.println("Happy Life");
        }
        System.out.println("ooooop");
    }
}

class God implements Runnable{

    @Override
    public void run() {
        for(;true;){
            System.out.println("Bless You");
        }
    }
}

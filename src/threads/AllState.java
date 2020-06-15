package threads;

/**
 * t线程和主线程交替执行
 */
public class AllState extends Thread{

    @Override
    public void run() {
        for(int i = 0;i < 10;i++){
            try {
                // sleep() 使当前线程进入阻塞状态，在指定时间不会执行
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Thread t = new AllState();

        //观察状态
        State state = t.getState();
        // NEW
        System.out.println(state);

        t.start();
        //观察状态
        state = t.getState();
        // RUNNABLE
        // 此时t线程进入RUNNABLE状态
        System.out.println(state);

        while(state != State.TERMINATED){
            // 活动的线程数
            int num = Thread.activeCount();
            System.out.println("活动的线程数" + " " + num);
            try {
                // 100ms监控一次
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 此时t线程TIMED_WAITING或者RUNNABLE
            state = t.getState();
            // TIMED_WAITING或者RUNNABLE
            System.out.println(state);
        }
    }
}

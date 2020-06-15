package threads;

/**
 * t线程和主线程交替执行
 */
public class AllState extends Thread{

    @Override
    public void run() {
        for(int i = 0;i < 10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + i);
        }

    }

    public static void main(String[] args) {
        Thread t = new AllState();

        //观察状态
        State state = t.getState();
        // NEW
        System.out.println(state);

        t.start();

        state = t.getState();
        // RUNNABLE
        System.out.println(state);

        while(state != State.TERMINATED){
            try {
                // sleep() 使当前线程进入阻塞状态，在指定时间不会执行
                AllState.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 此时t线程被阻塞
            state = t.getState();
            // TIMED_WAITING
            System.out.println(state);
        }
    }
}

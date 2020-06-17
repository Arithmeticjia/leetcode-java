package threads;

public class ThreadInfo {


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isAlive());

        MyInfo info = new MyInfo("代理角色");

        Thread t =  new Thread(info);
        t.setName("真实角色");
        t.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.isAlive());

    }
}


class MyInfo implements Runnable{

    private String name;

    public MyInfo(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + name);
    }
}
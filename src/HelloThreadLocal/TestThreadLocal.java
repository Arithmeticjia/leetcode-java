package HelloThreadLocal;

/**
 * demo of ThreadLocal
 */
public class TestThreadLocal {

    static ThreadLocal<String> lovalVar = new ThreadLocal<>();

    static void print(String str){
        System.out.println(str + " :" + lovalVar.get());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lovalVar.set("localVar1");
                print("thread1");
                lovalVar.remove();
                System.out.println("after remove : " + lovalVar.get());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lovalVar.set("localVar2");
                print("thread2");
                lovalVar.remove();
                System.out.println("after remove : " + lovalVar.get());
            }
        });

        t1.start();
        t2.start();
    }
}

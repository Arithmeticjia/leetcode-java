package learn_synchronized;

public class create_synchronized {


    /**
     * 修饰代码块
     */
    public void method() {
        synchronized (this) {
            // to do some thing
        }
    }

    /**
     * 修饰方法
     */
    public synchronized void method2() {

    }

    /**
     * 修饰静态方法
     */
    public synchronized static void method3() {
        // todo some thing
    }

    /**
     * 修饰方法
     */
    public synchronized void method4() {
        synchronized (create_synchronized.class) {

        }
    }
}

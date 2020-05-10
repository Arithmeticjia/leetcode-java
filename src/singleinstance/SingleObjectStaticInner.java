package singleinstance;

/**
 * 静态内部类方式
 * 线程安全
 * 类加载是线程安全的
 */
public class SingleObjectStaticInner {

    private static class SingletonClassInstance{
        private static final SingleObjectStaticInner instance = new SingleObjectStaticInner();
    }

    public static SingleObjectStaticInner getInstance(){
        return SingletonClassInstance.instance;
    }

    private SingleObjectStaticInner(){

    }
}

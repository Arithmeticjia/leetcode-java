package singleinstance;

/**
 * 静态内部类方式
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

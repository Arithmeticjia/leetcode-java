package singleinstance;

/**
 * 静态内部类方式
 * 线程安全
 * 类加载是线程安全的
 * 不需要实例化 A 类出来，就可以实例化 B 类
 * B 类不能直接访问 A 类的非静态变量（只能直接访问 A 类的静态变量，即类变量，访问类变量是不需要先获取对象的）
 * A 类和 B 类的类加载时间没有关系，如果完全可以 A 类加载了，但是 B 类还没有加载（这是实现单例模式的核心）
 */
public class SingleObjectStaticInner {

    private static class SingletonClassInstance{
        private static final SingleObjectStaticInner instance = new SingleObjectStaticInner();
    }

    public static SingleObjectStaticInner getInstance(){
        return SingletonClassInstance.instance;
    }

    private SingleObjectStaticInner(){}
}

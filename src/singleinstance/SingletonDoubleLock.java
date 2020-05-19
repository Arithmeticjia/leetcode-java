package singleinstance;


/**
 * new 对象的过程可以拆解为：首先 JVM 将申请一块空间（1）然后执行构造方法为属性赋值（2）最后让对象指向刚刚分配好的地址（3）。
 * 如果发生指令重排序，那么 new 对象的过程就有可能变成：首先 JVM 将申请一块空间（1）让对象指向刚刚分配好的地址（3）执行构造方法为属性赋值（2）
 * 如果只有一条线程则没问题，但出现了另一条线程，执行 getInstance() 方法时，先检查单例对象 instance 是否为空（if (instance == null)）
 * 完全有可能检查到 instance 不为空（因为已经指向了刚刚分配好的地址），但是 instance 还没有执行完构造方法，最终拿到了一个没真正创建完毕的对象。
 * volatile 关键字实现的第二个作用，就是禁止指令重排序。
 * （顺便一提，不光是禁止两个被 volatile 修饰的属性，在操作上不能重排序，而且被 volatile 修饰的属性，和它周围的普通属性的相关操作都不能重排序）。被 volatile 修饰的单例对象，将严格按照指令顺序被创建，因此不存在问题。
 */
public class SingletonDoubleLock {

    // 私有构造函数
    private SingletonDoubleLock(){};

    // 不需要先实例化
    private static volatile SingletonDoubleLock instance = null;

    // 静态方法，返回单例
    public static SingletonDoubleLock getInstance(){
        if(instance == null){
            //加锁
            synchronized (SingletonDoubleLock.class){
                //二次判断
                if(instance == null){
                    instance = new SingletonDoubleLock();
                }
            }
        }

        return instance;
    }
}

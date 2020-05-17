package singleinstance;

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

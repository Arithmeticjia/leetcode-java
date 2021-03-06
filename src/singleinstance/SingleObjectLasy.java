package singleinstance;

import java.io.Serializable;


// 实现序列化烦序列化
public class SingleObjectLasy implements Serializable {

    //创建 SingleObject 的一个对象
    //懒汉模式
    private static SingleObjectLasy instance;

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private SingleObjectLasy(){
        // 防止反射破解
        if(instance != null){
            throw new RuntimeException();
        }
    }

    /**
     * 获取唯一可用的对象
     * 返回值是一个实例对象 
     * @return
     */
    public static synchronized SingleObjectLasy getInstance(){
        if(instance == null){
            instance = new SingleObjectLasy();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

    // 防止反序列化破解
    // 反序列化时，如果定义了readResolve()则直接返回此方法指定的对象，而不需要单独再创建对象
    private Object readResolve(){
        return instance;
    }
}

package singleinstance;

public class SingleObject {

    /**
     * 创建 SingleObject 的一个对象
     * 饿汉模式
     * 先new一个对象出来
     */
    private static SingleObject instance = new SingleObject();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private SingleObject(){

    }

    /**
     * 获取唯一可用的对象
     * 返回值是一个实例对象
     * @return
     */
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

package singleinstance;

public class SingleObjectLasy {

    //创建 SingleObject 的一个对象
    //懒汉模式
    private static SingleObjectLasy instance;

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private SingleObjectLasy(){

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
}

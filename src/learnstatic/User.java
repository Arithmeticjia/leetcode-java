package learnstatic;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class User {

    int id;
    String name;
    String pwd;

    static String company="bytedance";

    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
    //静态块，不是方法，类初始化时执行
    static {
        System.out.println("执行类的初始化");
        company = "ooo";
    }
    public void login(){
        printCompany();
        System.out.println(company);
        System.out.println("登录"+name);
    }

    public static void printCompany(){
//        login();静态方法不能调用普通方法
        System.out.println(company);
    }

    public static void main(String[] args) {
        User u = new User(1,"j");
        User.printCompany();
        User.company = "alibaba";
        User.printCompany();
    }

}

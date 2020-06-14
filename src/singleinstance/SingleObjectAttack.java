package singleinstance;

import com.sun.tools.internal.jxc.ap.Const;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleObjectAttack {

//    private static SingleObjectAttack instance = null;
//
//    private SingleObjectAttack(){
//
//    }
//
//    private static SingleObjectAttack getInstance(){
//        if(instance != null){
//            instance = new SingleObjectAttack();
//        }
//
//        return instance;
//    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        SingleObjectLasy s1 = SingleObjectLasy.getInstance();
        SingleObjectLasy s2 = SingleObjectLasy.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        // 通过反射的方式直接调用私有构造器
//        Class clazz = Class.forName("singleinstance.SingleObjectLasy");
//
//        Constructor<SingleObjectLasy> c = clazz.getDeclaredConstructor(null);
//        c.setAccessible(true);
//        SingleObjectLasy s3 = c.newInstance();
//        SingleObjectLasy s4 = c.newInstance();
//
//        System.out.println(s3);
//        System.out.println(s4);


        // 通过反序列化的方式

        FileOutputStream fos = new FileOutputStream("/Users/Arithmetic/LearnJava/leetcode/src/singleinstance/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/Arithmetic/LearnJava/leetcode/src/singleinstance/a.txt"));
        SingleObjectLasy s5 = (SingleObjectLasy)ois.readObject();
        System.out.println(s5);
    }
}

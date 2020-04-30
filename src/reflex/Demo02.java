package reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo02 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        String path = "reflex.User";

        Class clazz = Class.forName(path);
        // 获得包名+类名
        System.out.println(clazz.getName());
        // 获得类名
        System.out.println(clazz.getSimpleName());
        // 获得属性，返回的是数组
        // 只能是公开的
        System.out.println(Arrays.toString(clazz.getFields()));
        // 返回所有属性
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));

        Field name = clazz.getDeclaredField("name");

        System.out.println(name);

        // 必须传参数类型对应的Class对象
        Method md01 = clazz.getDeclaredMethod("setId",int.class);

        Method md02 = clazz.getDeclaredMethod("setId", null);

        System.out.println(md01);
        System.out.println(md02);

        Constructor[] constructors = clazz.getDeclaredConstructors();
        // 获得无参构造器
        Constructor c = clazz.getDeclaredConstructor(null);
        System.out.println(c);
        // 获得有参构造器
        Constructor cc = clazz.getDeclaredConstructor(int.class,String.class);
        System.out.println(cc);

        for(Constructor cons: constructors){
            System.out.println(cons);
        }

    }
}

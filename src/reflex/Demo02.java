package reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo02 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String path = "reflex.User";

        Class stringClass = String.class;
        Class stringClass2 = path.getClass();
        System.out.println(stringClass == stringClass2);

        Class intClass = int.class;

        Class clazz = Class.forName(path);
        Class clazz2 = Class.forName(path);

        // 一个类只有一个Class对象，hashCode相同
        System.out.println(clazz.hashCode());
        System.out.println(clazz2.hashCode());

        // 这里和数组的维度有关
        int[] arr01 = new int[10];
        int[] arr02 = new int[20];

        // 这里的hashCode是相同的
        System.out.println(arr01.getClass().hashCode());
        System.out.println(arr02.getClass().hashCode());

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
        Method[] methods = clazz.getDeclaredMethods();

        for(Method m:methods){
            System.out.println("方法:" + m);
        }

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

        Class<User> userClass = (Class<User>) Class.forName(path);

        User u = userClass.newInstance();

        Constructor<User> userConstructor = userClass.getDeclaredConstructor(int.class, String.class);

        User uu = userConstructor.newInstance(18,"jake");
        System.out.println(uu.getName());
        System.out.println(uu.getAge());

        for(Constructor cons: constructors){
            System.out.println(cons);
        }

    }
}

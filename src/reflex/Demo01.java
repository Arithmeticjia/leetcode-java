package reflex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo01 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        System.out.println(String.class);
        String path = "reflex.User";
        Class clazz = Class.forName(path);
        Class clayy = String.class;
        System.out.println(clazz.getDeclaredField("age"));
        System.out.println(clazz.getSimpleName());
        // 只能是public
        Field[] fields = clazz.getFields();
        // 所有属性
        Field[] fields1 = clazz.getDeclaredFields();
        System.out.println(fields.length);
        for(Field f:fields1){
            System.out.println(f);
        }

        Method[] methods = clazz.getMethods();
        for(Method m:methods){
            System.out.println(m);
        }
    }
}

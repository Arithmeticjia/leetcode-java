package reflex;

import java.util.Arrays;

public class Demo02 {

    public static void main(String[] args) throws ClassNotFoundException {
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
    }
}

package reflex;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class leanReflex {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();
        person.age = 22;
        test(person);
    }

    public static void test(Object object) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 获得类
        Class c = object.getClass();
        Field ageField = c.getDeclaredField("age");
        System.out.println(ageField.getInt(object));
        Method method = c.getDeclaredMethod("sayHello");
        method.invoke(object);
        // 运行时是否有注解
        System.out.print(c.isAnnotationPresent(learnAnno.class)+"\n");

        System.out.print(ageField.getDeclaredAnnotation(learnAnno.class).name());
    }
}

@learnAnno
class Person{

    @learnAnno
    int age;
    void sayHello(){
        System.out.println("hello");
    }
}
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
        Class c = object.getClass();
        Field ageField = c.getDeclaredField("age");
        System.out.println(ageField.getInt(object));
        Method method = c.getDeclaredMethod("sayHello");
        method.invoke(object);
    }
}

class Person{

    int age;
    void sayHello(){
        System.out.println("hello");
    }
}
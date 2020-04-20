package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * @author Arithmetic
 * @Target 注解作用范围
 * @Retention(source,class,runtime)有效周期
 */
@Target(value = {ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)//可以被反射读取到
public @interface myannotation {

    String studentName() default "liming";
    int studentAge() default 10;
    String[] love() default {"money"};
}

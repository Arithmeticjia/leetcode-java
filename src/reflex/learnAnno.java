package reflex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解
 * @author Arithmetic
 */
// 类、字段、方法
//@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
// 保留到何时，默认保留到class
//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
public @interface learnAnno {
    String name() default "ssj";
}

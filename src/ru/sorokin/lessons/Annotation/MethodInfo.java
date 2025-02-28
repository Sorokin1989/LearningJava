package ru.sorokin.lessons.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface MethodInfo {
    String author() default "Dima";

    int dateOfCreation() default 2025;

    String purpose();
}

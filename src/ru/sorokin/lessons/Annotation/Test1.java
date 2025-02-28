package ru.sorokin.lessons.Annotation;

@MyAnnotation
public class Test1 {
    @MyAnnotation
    private String name;

    @MyAnnotation
    public Test1() {

    }

    @MyAnnotation
    public void test1(@MyAnnotation int value) {
        @MyAnnotation String localVar = "Hello";

    }

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {

    }
}

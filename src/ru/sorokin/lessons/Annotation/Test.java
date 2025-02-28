package ru.sorokin.lessons.Annotation;


public class Test {
    @MethodInfo(purpose = "Print Hello World")
    public void printHelloWorld() {
        System.out.println("Hello World");

    }

}

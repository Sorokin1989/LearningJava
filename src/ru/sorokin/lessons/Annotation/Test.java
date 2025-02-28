package ru.sorokin.lessons.Annotation;

public class Test {
    @MethodInfo(author = "Dima", dateOfCreation = 2025, purpose = "Print Hello World")
    public void printHelloWorld() {
        System.out.println("Hello World");

    }

}

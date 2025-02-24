package ru.sorokin.lessons.LambdaExpressions;

public class Test {
    public static void main(String[] args) {
        Thread thread=new Thread(() -> System.out.println("Hello"));
    }
}

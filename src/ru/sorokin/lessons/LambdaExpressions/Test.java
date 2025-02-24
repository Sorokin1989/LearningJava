package ru.sorokin.lessons.LambdaExpressions;

public class Test {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");

            }
        });
    }
}

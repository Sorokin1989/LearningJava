package ru.sorokin.lessons.multithreading;

public class Test {
    public static void main(String[] args) {
     MyThread myThread=new MyThread();
     myThread.start();
        System.out.println("Hello from main Thread");

    }
}
class MyThread extends Thread {
    public void run() {
        for(int i=0; i<1000;i++) {
            System.out.println("Hello from my Thread");
        }
    }
}

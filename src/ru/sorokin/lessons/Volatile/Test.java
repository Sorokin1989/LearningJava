package ru.sorokin.lessons.Volatile;

public class Test {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();

    }
}
class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
package ru.sorokin.lessons.multithreading;

public class Test {
    public static void main(String[] args) throws InterruptedException {
    //MyThread myThread=new MyThread();
    //myThread.start();

    //MyThread myThread2=new MyThread();
    //myThread2.start();
        Thread thread=new Thread(new Runner());
        thread.start();
        System.out.println("Hello from main thread");
    }
}
class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from my Thread " + i);

        }
    }
}
class MyThread extends Thread {
    public void run() {
        for(int i=0; i<1000;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from my Thread " +i);
        }
    }
}

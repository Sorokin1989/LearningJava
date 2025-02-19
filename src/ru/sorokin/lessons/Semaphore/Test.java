package ru.sorokin.lessons.Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Connection connection = Connection.getConnection();

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.doWork();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            });
        }


        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

    }


}

class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;


    private Connection() {

    }

    public static Connection getConnection() {
        return connection;

    }

    public void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        Thread.sleep(5000);

        synchronized (this) {
            connectionsCount--;
        }

    }
}

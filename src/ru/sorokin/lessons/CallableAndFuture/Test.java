package ru.sorokin.lessons.CallableAndFuture;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finished");
            Random random = new Random();
            int randomValue = random.nextInt(10);

            if (randomValue < 5)
                throw new Exception("Something bad happened");
            return randomValue;


        });
        executorService.shutdown();
        try {
            int result = future.get();

            System.out.println(result);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
            throw new RuntimeException(e);

        }
    }

}

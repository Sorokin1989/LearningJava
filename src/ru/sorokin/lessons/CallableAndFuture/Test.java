package ru.sorokin.lessons.CallableAndFuture;

import java.util.Random;
import java.util.concurrent.*;

public class Test {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future=executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finished");
            Random random=new Random();
            return random.nextInt(10);


        });
        executorService.shutdown();
        try {
            int result= future.get();

            System.out.println(result);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}

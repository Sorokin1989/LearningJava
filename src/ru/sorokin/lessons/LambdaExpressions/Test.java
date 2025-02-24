package ru.sorokin.lessons.LambdaExpressions;

interface Executable {
    int execut();
}

class Runner {
    public void run(Executable e) {
       int a= e.execut();
        System.out.println(a);

    }
}


public class Test {
    public static void main(String[] args) {

        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execut() {
                System.out.println("Hello");
                System.out.println("Goodbye");
                return 1;

            }
        });

        runner.run(() -> {
            System.out.println("Hello");
            System.out.println("Goodbye");
            return 5;
        });


    }
}

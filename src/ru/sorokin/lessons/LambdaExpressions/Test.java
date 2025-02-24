package ru.sorokin.lessons.LambdaExpressions;

interface Executable {
    void execut();
}

class Runner {
    public void run(Executable e) {
        e.execut();

    }
}

class ExecutableImplementation implements Executable {

    @Override
    public void execut() {
        System.out.println("Hello");

    }
}


public class Test {
    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.run(new ExecutableImplementation());

        runner.run(new Executable() {
            @Override
            public void execut() {
                System.out.println("Hello");
            }
        });

        runner.run(() -> System.out.println("Hello"));


    }
}

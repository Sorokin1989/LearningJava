package ru.sorokin.lessons.simple;

public class Main {
    public static void main(String[] args) {
        SimpleService service = new SimpleService();
        Integer calculate = service.calculate(2, 10);
        System.out.println("calculate: " + calculate);
    }
}

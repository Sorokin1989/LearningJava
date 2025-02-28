package ru.sorokin.lessons.simple;

public class SimpleService {

    public Integer calculate(Integer a, Integer b) {

        int sum = 0;
        try {
            sum = a + b;

        } catch (IllegalArgumentException e) {

        }
        return sum;
    }


}

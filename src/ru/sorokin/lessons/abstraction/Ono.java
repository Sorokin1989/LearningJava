package ru.sorokin.lessons.abstraction;

public class Ono implements IAnimal {
    @Override
    public String getName() {
        return "My name is ono";
    }

    @Override
    public void run() {
        System.out.println("Ku-ku");
    }
}

package ru.sorokin.lessons.abstraction;

public class Horse implements IAnimal {
    @Override
    public String getName() {
        return "My name is horse";
    }

    @Override
    public void run() {
        System.out.println("Horse is running fast");
    }
}

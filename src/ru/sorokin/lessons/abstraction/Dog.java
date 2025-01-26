package ru.sorokin.lessons.abstraction;

public class Dog implements IAnimal {
    @Override
    public String getName() {
        return "My name is Murzik";
    }

    @Override
    public void run() {
        System.out.println("Gav-Gav");
    }
}

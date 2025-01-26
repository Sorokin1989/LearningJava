package ru.sorokin.lessons.interface_1;

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

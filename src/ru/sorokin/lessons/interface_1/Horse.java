package ru.sorokin.lessons.interface_1;

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

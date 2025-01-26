package ru.sorokin.lessons.interface_1;

public class Cat implements IAnimal {
    @Override
    public String getName() {
        return "My name is cat Obdya";
    }

    @Override
    public void run() {
        System.out.println("Tuk-tuk-tuk");
    }
}

package ru.sorokin.lessons.lesson41;

import ru.sorokin.lessons.interface_1.Cat;
import ru.sorokin.lessons.interface_1.Dog;
import ru.sorokin.lessons.interface_1.IAnimal;

public class Test {
    public static void main(String[] args) {
        Cat1 cat=new Cat1();
        Dog1 dog=new Dog1();
        dog.makeSound();
        cat.makeSound();
        cat.eat();
        dog.eat();



    }
}

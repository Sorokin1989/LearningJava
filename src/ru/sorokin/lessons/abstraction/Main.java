package ru.sorokin.lessons.abstraction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IAnimal animal = getAnimal("svgsdfhgndf");

        System.out.println("Hello " + animal.getName());
        animal.run();
    }

    public static IAnimal getAnimal(String animalName) {
        return
                switch (animalName) {
                    case "Obdya" -> new Cat();
                    case "Murzik" -> new Dog();
                    case "horse" -> new Horse();
                    default -> new Ono();
                };
    }
}
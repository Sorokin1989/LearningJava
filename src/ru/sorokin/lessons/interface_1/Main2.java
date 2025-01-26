package ru.sorokin.lessons.interface_1;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        IAnimal animal = getAnimal("Obdya");

        System.out.println("Hello " + animal.getName());
        animal.run();

    }

    public static IAnimal getAnimal(String animalName) {
        HashMap<String, IAnimal> animalHashMap = new HashMap<>();

        animalHashMap.put("Obdya", new Cat());
        animalHashMap.put("horse", new Horse());
        animalHashMap.put("Murzik", new Dog());

        IAnimal animal = animalHashMap.getOrDefault(animalName, new Ono());

        return animal;
    }
}

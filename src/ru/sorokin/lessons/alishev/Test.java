package ru.sorokin.lessons.alishev;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст: ");
        int age = scanner.nextInt();
        if (age == 0) {
            System.out.println("Ты родился");
        } else if (age == 7) {
            System.out.println("Ты пошел в школу");
        } else if (age == 18) {
            System.out.println("Ты закончил школу");
        } else {
            System.out.println("Ни одно из условий не подошло");
        }

    }

}

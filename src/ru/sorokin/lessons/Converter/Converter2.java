package ru.sorokin.lessons.Converter;

import java.util.Scanner;

public class Converter2 {
    public static void main(String[] args) {
        double amount;
        double dollar, yuan, euro;

        Scanner sc = new Scanner(System.in);
        System.out.println("Options!");

        System.out.println("Enter 1 : Dollar");
        System.out.println("Enter 2 : Yuan");
        System.out.println("Enter 3 : Euro\n");
        System.out.println("Выберите валюту: ");

        int choice = sc.nextInt();

        System.out.println("Your number is : " + choice);

        System.out.println("Введите сумму, которую хотите сконвертировать");

        amount = sc.nextDouble();
        System.out.println("Your amount is : " + amount);

        if (choice == 1) {
            yuan = amount * 7.12;
            System.out.println(amount + " Dollar = " + yuan + " Yuan ");
            euro = amount * 1.02;
            System.out.println(amount + " Dollar = " + euro + " Euro ");
        } else if (choice == 2) {
            dollar = amount * 0.14;
            System.out.println(amount + " Yuan = " + dollar + " Dollar ");
            euro = amount * 0.14;
            System.out.println(amount + " Yuan = " + euro + " Euro ");

        } else if (choice == 3) {
            dollar = amount * 0.98;
            System.out.println(amount + " Euro = " + dollar + " Dollar ");
            yuan = amount * 6.98;
            System.out.println(amount + " Euro = " + yuan + " Yuan ");

        } else {
            System.out.println("Некорректный ввод");
        }

    }
}

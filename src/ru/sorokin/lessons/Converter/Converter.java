package ru.sorokin.lessons.Converter;

import java.util.Scanner;

public class Converter {
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

        switch (choice) {
            case 1: // dollar
                yuan = amount * 7.12;
                System.out.println(amount + " Dollar = " + yuan + " Yuan ");
                euro = amount * 1.02;
                System.out.println(amount + " Dollar = " + euro + " Euro ");
                break;

            case 2: //Yuan
                dollar = amount * 0.14;
                System.out.println(amount + " Yuan = " + dollar + " Dollar ");
                euro = amount * 0.14;
                System.out.println(amount + " Yuan = " + euro + " Euro ");
                break;

            case 3:// Euro
                dollar = amount * 0.98;
                System.out.println(amount + " Euro = " + dollar + " Dollar ");
                yuan = amount * 6.98;
                System.out.println(amount + " Euro = " + yuan + " Yuan ");
                break;

            default:
                System.out.println("Некорректный ввод");


        }


    }
}

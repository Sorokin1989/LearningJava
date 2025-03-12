package ru.sorokin.lessons.alishev;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите сообщение :");
        String s=scanner.nextLine();

        System.out.println("Вы ввели " + s);
    }
}

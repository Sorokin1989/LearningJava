package ru.sorokin.lessons.alishev;

public class Test {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите 5: ");
        //int value = scanner.nextInt();
        //while (value != 5) {
        //    System.out.println("Введи 5: ");
        //    value = scanner.nextInt();
        //}
        //System.out.println("Вы ввели 5");

        //Scanner scanner = new Scanner(System.in);
        //int value;
        //do {
        //    System.out.println("Введите 5: ");
        //    value = scanner.nextInt();
        //}
        //while (value != 5);
        //System.out.println("Вы ввели 5: ");
//
//

        int i = 0;
        while (true) {
            if (i == 15)
                break;
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла");
    }

}

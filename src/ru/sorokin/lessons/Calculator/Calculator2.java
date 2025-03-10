package ru.sorokin.lessons.Calculator;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое и второе число - ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Выберите оператор и нажмите ENTER (+ , - , * , / , %) - ");

        char op = sc.next().charAt(0);
        solve(a, b, op);
    }

    private static int solve(int a, int b, char op) {
        int ans = 0;
        switch (op) {
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '*':
                ans = a * b;
                break;
            case '/':
                ans = a / b;
                break;
            case '%':
                ans = a % b;
                break;
            default:
                System.out.println("Некорректный ввод");
        }
        System.out.println("Ваш ответ - " + ans);

        return ans;
    }
}

package ru.sorokin.lessons.TestZadanie;

public class HelloWorld {
    public static void main(String[] args) {
        String name = "Dima";
        System.out.println("Hello, " + name);

        if (name.equals("Dima")) {

            checkUser(name);

        }
    }

    static void checkUser(String nameChek) {

        if (nameChek == "Dima") {
            System.out.println("Special user priveledges granted!");
        }


    }
}


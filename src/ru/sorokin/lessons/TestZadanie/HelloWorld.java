package ru.sorokin.lessons.TestZadanie;

public class HelloWorld {
    public static void main(String[] args) {
        String name = "Dima";
        System.out.println("Hello, " + name);

        if (name.equals("Dima")) {
            grantPermission();
            grantPermission();
            grantPermission();
            grantPermission();
            grantPermission();

        }
    }

    static void grantPermission() {
        System.out.println("Special user priveledges granted!");
    }
}


package ru.sorokin.lessons.lesson48;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        //     switch (animal) {
        //        case CAT:
        //           System.out.println("it's a cat");
        //         break;
        //      case DOG:
        //          System.out.println("it's a dog");
        //          break;

        //  }
        Season season = Season.SUMMER;
        switch (season) {
            case SUMMER:
                System.out.println("it's warm outside");
                break;
            case WINTER:
                System.out.println("it's cold outside");
                break;
        }

    }


}





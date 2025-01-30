package ru.sorokin.lessons.exceptions1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }
    }
    public static void  readFile() throws FileNotFoundException {
        File file= new File("test");
        Scanner scanner= new Scanner(file);
    }
}

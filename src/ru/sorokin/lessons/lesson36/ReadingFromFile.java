package ru.sorokin.lessons.lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "Дмитрий" + separator + "OneDrive" + separator + "Рабочий стол" + separator + "File.txt";
        File file = new File(path);


        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}

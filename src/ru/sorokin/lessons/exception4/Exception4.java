package ru.sorokin.lessons.exception4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);

        }
    }
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}

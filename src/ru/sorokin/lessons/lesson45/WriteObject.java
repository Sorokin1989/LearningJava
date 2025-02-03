package ru.sorokin.lessons.lesson45;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person person1=new Person(1,"Mike");

        try {
            FileOutputStream fos=new FileOutputStream("people.bin");
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeObject(person1);
            fos.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }



    }
}

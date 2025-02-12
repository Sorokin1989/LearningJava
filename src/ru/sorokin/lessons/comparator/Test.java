package ru.sorokin.lessons.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add("a");
        animals.add("wdwfefffw");
        animals.add("bird");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        // List<Integer> numbers=new ArrayList<>();
        //numbers.add(1);
        //numbers.add(500);
        //numbers.add(100);
        //numbers.add(5);

        //Collections.sort(numbers);
        //System.out.println(numbers);

    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;

        }

    }

}


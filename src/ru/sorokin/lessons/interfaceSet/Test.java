package ru.sorokin.lessons.interfaceSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();
        Set<String> linkedHashSet=new HashSet<>();
        Set<String> treeSet=new TreeSet<>();

        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");

        for (String name: hashSet) {
            System.out.println(name);

        }

    }
}

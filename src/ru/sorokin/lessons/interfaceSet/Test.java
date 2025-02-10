package ru.sorokin.lessons.interfaceSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();
        Set<String> linkedHashSet=new LinkedHashSet<>();
        Set<String> treeSet=new TreeSet<>();

        linkedHashSet.add("Mike");
        linkedHashSet.add("Katy");
        linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");

        for (String name: linkedHashSet) {
            System.out.println(name);

        }

    }
}

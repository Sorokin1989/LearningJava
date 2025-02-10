package ru.sorokin.lessons.linkedHashMapAndTreeMap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,String> translations=new HashMap<>();

        translations.put("Собака","Dog");
        translations.put("Слон", "Elephant");
        translations.put("Кошка","Cat");

        for(Map.Entry entry: translations.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());

        }

    }
}

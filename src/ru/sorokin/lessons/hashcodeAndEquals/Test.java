package ru.sorokin.lessons.hashcodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();

        map.put(1,"Один");
        map.put(1,"Другое значение");

        set.add(1);
        set.add(1);

        System.out.println(map);
        System.out.println(set);


    }
}

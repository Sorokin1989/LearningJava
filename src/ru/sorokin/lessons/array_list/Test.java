package ru.sorokin.lessons.array_list;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(2);

        list.add(1);

        Integer i = list.get(3);
//stream api
        Integer i1 = Optional.ofNullable(list)
                .orElse(List.of())
                .stream()
                .filter(integer -> integer != null)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not found element not equals null"));

/// /////1 variant
        for (int index = 0; index < list.size() - 1; index++) {
            Integer integer = list.get(index);
            System.out.println("for loop each: " + integer);
        }
/// ////2 variant
        Integer i2 = null;
        if (list != null) {
            for (Integer integer : list) {
                if (integer != null){
                    i2 = integer;
                } else {
                    return;
                }
            }
            if (i2 == null){
                throw  new IllegalArgumentException("Not found element not equals null");
            }
        } else {
           throw  new IllegalArgumentException("Not found element not equals null");
        }
       /// /////3 variant
      list.forEach(integer -> System.out.println("stream api for each: " + integer));

      Set<String> set = new HashSet<>();
      set.add("qwe");

      for(String s: set){
          System.out.println(s);
      }

        set.forEach(System.out::println);

        Map<String, Object> map = new HashMap<>();
        Object mapObject = new Object();
        map.put("qwe",  mapObject);
        Object objectFromMap = map.get("qwe");
    }


}
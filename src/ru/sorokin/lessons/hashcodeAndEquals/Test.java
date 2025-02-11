package ru.sorokin.lessons.hashcodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Person,String> map=new HashMap<>();
        Set<Person> set=new HashSet<>();

        Person person1=new Person(1,"Mike");
        Person person2=new Person(2,"Katy");

        map.put(person1,"123");
        map.put(person2,"123");

        set.add(person1);
        set.add(person2);
        System.out.println(map);
        System.out.println(set);




    }
}
class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

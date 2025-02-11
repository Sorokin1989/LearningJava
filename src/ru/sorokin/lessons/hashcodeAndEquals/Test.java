package ru.sorokin.lessons.hashcodeAndEquals;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Person,String> map=new HashMap<>();
        Set<Person> set=new HashSet<>();

        Person person1=new Person(1,"Mike");
        Person person2=new Person(1,"Mike");

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

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

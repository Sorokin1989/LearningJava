package ru.sorokin.lessons.comparable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peopleList=new ArrayList<>();
        Set<Person> peopleSet=new TreeSet<>();
        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);



    }
    private static void addElements(Collection collection) {
        collection.add(new Person(2,"Katy"));
        collection.add(new Person(1,"Bob"));
        collection.add(new Person(4,"George"));
        collection.add(new Person(3,"Tom"));

    }
}
class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(this.id>o.getId()) {
            return 1;
        } else if (this.id<o.getId()) {
            return -1;
        }else {
            return 0;
        }

        }
    }


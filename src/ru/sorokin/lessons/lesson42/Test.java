package ru.sorokin.lessons.lesson42;

public class Test {
    public static void main(String[] args) {
    String a="Hello";
    String b="Hello123".substring(0,5);
        System.out.println(b);
        System.out.println(a==b);



    }
}
    class Animal {
        private int id;
        public Animal(int id) {
            this.id=id;

        }

        @Override
        public boolean equals(Object obj) {
            Animal otherAnimal=(Animal) obj;
            return this.id==otherAnimal.id;
        }
    }


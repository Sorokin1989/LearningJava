package ru.sorokin.lessons.lesson48;

public enum Animal {
    DOG("Собака"),CAT("Кошка"),FROG("Лягушка");
    private String translation;
    Animal(String translation) {
        this.translation = translation;
    }

public String getTranslation() {
    return translation;
        }
        public String toString() {
        return "перевод на русский язык " + translation;
        }
    }


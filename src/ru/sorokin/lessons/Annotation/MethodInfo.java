package ru.sorokin.lessons.Annotation;

public @interface MethodInfo {
    String author()default "Dima";
    int dateOfCreation()default 2025;
    String purpose();
}

package ru.sorokin.lessons.lesson48;

public enum Season {
    SUMMER(35), WINTER(-35),AUTUMN(10),SPRING(15);
private int temperature;
    Season(int temperature) {
        this.temperature=temperature;

    }

    public int getTemperature() {
        return temperature;
    }
}

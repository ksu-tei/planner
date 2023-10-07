package ru.ksutei.planner.util;

public enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    String russian;
    Day(String dayInRussian) {
        russian = dayInRussian;
    }

    public String getRusName() {
        return russian;
    }
}
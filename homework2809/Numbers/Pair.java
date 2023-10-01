package org.example.homework2809.Numbers;

public class Pair {
    public static void main(String[] args) {
        // Создание объекта Pair с использованием конструктора по умолчанию
        Pair pair1 = new Pair();

        // Создание объекта Pair с использованием конструктора с параметрами
        Pair pair2 = new Pair("hello", "world");
    }
    private String first;
    private String second;

    // Блок инициализации
    {
        System.out.println("Значение полей first и second в блоке инициализации:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        // Присвоение значений
        first = "one";
        second = "two";
    }

    // Конструктор по умолчанию
    public Pair() {
        System.out.println("Значение полей first и second в конструкторе по умолчанию:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
    }

    // Конструктор с параметрами
    public Pair(String first, String second) {
        this.first = first;
        this.second = second;
        System.out.println("Значение полей first и second в конструкторе с параметрами:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
    }

    // Геттеры
    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }
}

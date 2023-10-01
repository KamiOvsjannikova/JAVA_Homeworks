package org.example.homework2809.Numbers;

public class Pair {
    public static void main(String[] args) {
        // создаю объект Pair с использованием конструктора 1 
        Pair pair1 = new Pair();

        // создаю объект Pair с использованием конструктора 2 с параметрами
        Pair pair2 = new Pair("Hi", "Kamilla");
    }
    private String first;
    private String second;

    // блок инициализации, в котором выведите в консоль значение полей first и second
    {
        System.out.println("Значение полей first и second в блоке инициализации:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        // присваиваю полю first значение “one”, а полю second значение «two».
        first = "one";
        second = "two";
    }

    // Конструктор1
    public Pair() {
        System.out.println("Значение полей first и second в конструкторе по умолчанию:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
    }

    // Конструктор 2 с параметрами
    public Pair(String first, String second) {
        this.first = first;
        this.second = second;
        System.out.println("Значение полей first и second в конструкторе с параметрами:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
    }

    // Getter
    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }
}

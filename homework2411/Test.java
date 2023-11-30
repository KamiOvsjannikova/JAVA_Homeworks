package org.example.homework2411;

import java.util.Arrays;
import java.util.Scanner;
//Задача 2.
//Ввести с консоли 5 слов, отсортировать эти слова в алфавитном порядке.
//Вывести в результат первое и последнее слово.
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим 5 слов с консоли
        System.out.println("Введите 5 слов:");
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.next();
        }

        // Сортируем слова в алфавитном порядке
        Arrays.sort(words);

        // Выводим первое и последнее слово
        System.out.println("Первое слово: " + words[0]);
        System.out.println("Последнее слово: " + words[4]);
    }
}

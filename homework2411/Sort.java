package org.example.homework2411;
import java.util.Scanner;
import java.util.TreeSet;

//Задача 2.
//Ввести с консоли 5 слов, отсортировать эти слова в алфавитном порядке.
//Вывести в результат первое и последнее слово.
public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Введите 5 слов: ");

        TreeSet<String> wordsSet = new TreeSet<>(); // TreeSet - sorted set (поддерживает порядок сортировки)
        for (int i = 0; i < 5; i++) { // меньше 5
            wordsSet.add(scanner.next());
        }
        String firstWord = wordsSet.first(); // отсортировать эти слова в алфавитном порядке.
        String lastWord = wordsSet.last();
        System.out.println("Первое слово: " + firstWord);
        System.out.println("Последнее слово: " + lastWord);
    }
}

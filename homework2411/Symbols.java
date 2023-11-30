package org.example.homework2411;
//Задача 1.
// Приложение подсчета символов :
// Ввести с консоли любую строку,
// Вывести в результат - количество уникальных символов в строке и количество дублирующих символов в строке.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Symbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Ввести с консоли любую строку
        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();

        // Подсчет уникальных и дублирующихся символов
        Map<Character, Integer> charCountMap = new HashMap<>(); // создаю объект new HashMap с параметрами- Character и Integer они использ. для подсчета кол-во каждого символа в вед.строке
        for (char c : inputString.toCharArray()) { // toCharArray - преобразует строку в массив символов
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Вывести в результат
        System.out.println("Количество уникальных символов: " + charCountMap.size());

        System.out.println("Дублирующиеся символы и их количество:");
        // charCountMap.entrySet() - получает набор всех записей (ключ-значение) из charCountMap.
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            // entry.getValue() - количество вхождений символа (значение) из записи.
            if (entry.getValue() > 1) { // проверка на кол-во вхождений символа больше 1 если, символ дублируется в строке, то выполняется следующий блок кода.
                // entry.getKey() - символ (ключ) из записи.
                System.out.println(entry.getKey() + ": " + entry.getValue()); //Выводит на консоль символ и количество его вхождений
            }
        }
    }
}

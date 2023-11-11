//1.Написать метод который примет список значений String, и вернет одну строку , которая представляет собой конкатенацию всех значений.
//2.Написать метод который примет список значений int и вернет их максимум или минимум
// 3.Написать метод который примет список значений String , и вернет максимальную длину строки в этом списке
// 4.Написать метод который примет список значений String,дополнительный параметр длину , и вернет список со всеми значениями String переданной длины
// 5.Написать метод который примет список значений int и вернет список, содержащий только нечетные числа
// 6.Написать метод который примет список значений String, и вернет список этих значений без каких-либо дубликатов.
//
//        Методы оформить в отдельном классе ArrayListWorkUtil,
//        В основном классе программы,создавать необходимые списки, вызывать необходимые методы и класса выше и выводить результат в консоль
package org.example.homework0611;

import java.util.List;
import java.util.ArrayList;

public class ArrayListWorkUtil {

    // метод который примет список значений String, и вернет одну строку , которая представляет собой конкатенацию всех значений.
    public static String concatenateStrings(List<String> strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

    // метод который примет список значений int и вернет их максимум или минимум
    public static int findMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max; // вернет их максимум
    }
    // метод который примет список значений String , и вернет максимальную длину строки в этом списке
    public static int maxLength(List<String> strings) { //length - длинa строки
        int maxLength = 0;
        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        return maxLength; // вернет максимальную длину строки в этом списке
    }

    // метод который примет список значений String,дополнительный параметр длину , и вернет список со всеми значениями String переданной длины
    public List<String> test1(List<String> list, int number) {
        List<String> newList = new ArrayList<>();
        for (String i : list) { // Итерация по каждому элементу входного списка строк.
            if (number == i.length()) { // Проверка, равна ли длина текущей строки заданному числу.
                newList.add(i); // Если длина строки равна числу, то добавляю текущую строку в новый список.
            }
        }
        return newList; // возращаю новый список
    }

    // метод который примет список значений int и вернет список, содержащий только нечетные числа

    public List<Integer> test2(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) { //Итерация по каждому элементу входного списка целых чисел.
            if (i % 2 != 0) { // проверяю явл. ли текущее число нечетным
                newList.add(i); //Если число нечетное то, добавляю текущее число в новый список.
            }
        }
        list.clear(); // отчистка оригинального списка
        list.addAll(newList); // добовляю все эелемнты нового списка в оригинальный список
        return list; // возврашаю оригинальный список с изменениями
    }
    // метод который примет список значений String, и вернет список этих значений без каких-либо дубликатов.
  

}

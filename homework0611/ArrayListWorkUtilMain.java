package org.example.homework0611;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWorkUtilMain {
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>(); //добавляю элементы в список listOne
        listOne.add("This is "); //передаю строки
        listOne.add("my second");
        listOne.add(" Homework");
        System.out.println("Concatenated String: " + ArrayListWorkUtil.concatenateStrings(listOne));

        List<Integer> List = new ArrayList<>(); //добавляю int  в список List
        List.add(7); //перадаю целые числа
        List.add(9);
        List.add(17);
        List.add(5);
        System.out.println("Max value in the int list: " + ArrayListWorkUtil.findMax(List));
        System.out.println("Max length in the string list: " + ArrayListWorkUtil.maxLength(listOne));

        ArrayListWorkUtil task = new ArrayListWorkUtil();// Ключик, создаю объект класса  ArrayListWorkUtil task  для использования его методов

        List<String> list_array1 = new ArrayList<>();//добавляю элементы в список list_array1
        list_array1.add("One"); //передаю строки
        list_array1.add("Four");
        list_array1.add("Three");
        list_array1.add("Four");
        list_array1.add("Five");


        List<Integer> list_array2 = new ArrayList<>();//добавляю  в список list_array2
        list_array2.add(23);// перадаю целые числа
        list_array2.add(5);
        list_array2.add(6);
        list_array2.add(87);
        list_array2.add(12);

        System.out.println(task.test1(list_array1, 4));
        System.out.println(task.test2(list_array2));

    }
}

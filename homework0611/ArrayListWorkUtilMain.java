package org.example.homework0611;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWorkUtilMain {
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>(); //добавляю элементы в список listOne
        listOne.add("This is ");
        listOne.add("my second");
        listOne.add(" Homework");
        System.out.println("Concatenated String: " + ArrayListWorkUtil.concatenateStrings(listOne));

        List<Integer> List = new ArrayList<>(); //добавляю int  в список List
        List.add(7);
        List.add(9);
        List.add(17);
        List.add(5);
        System.out.println("Max value in the int list: " + ArrayListWorkUtil.findMax(List));
        System.out.println("Max length in the string list: " + ArrayListWorkUtil.maxLength(listOne));

    }
}


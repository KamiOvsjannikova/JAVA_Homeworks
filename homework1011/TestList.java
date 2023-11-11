//Создать лист, наполнить его 10 миллионами элементами
//Выполнить различные варианты обхода данного листа :
//При выполнении операций обхода, для нагрузки, внутри тела циклов
//кладем i- тый элемент в переменную temp
//(Пример :
// for (int i : list) {
//     int temp = i;
//        })
//перебрать for-each loop
//classic for и вызываем list.size() внутри каждой итерации
//classic for, но list.size() внутри каждой итерации присваиваем в переменную
//classic for, list.size()внутри каждой итерации присваиваем в переменную, перебираем с конца (i--)
//Тоже самое (list.size() внутри каждой итерации присваиваем в переменную) используя Itertor
//Тоже самое (list.size() внутри каждой итерации присваиваем в переменную) используя ListIterator
//для всех случаев(1-6) сделать замер времени
//результат вывести в консоль
package org.example.homework1011;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestList {
    public static void main(String[] args) {
//Создать лист, наполнить его 10 миллионами элементами
        List<Integer> myList = new ArrayList<>();
        myList.add (10000000); //добавляю в список

 //для всех случаев(1-6) сделать замер времени
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList.add(i);
            System.out.println();
        }
        endTime = System.currentTimeMillis();
        System.out.println(" Add 10M elements to list takes " + (endTime - startTime));
        
        //перебрать for-each loop
        for (int i : myList) {
            int temp = i;
        }

//classic for и вызываем list.size() внутри каждой итерации
        System.out.println("For with counter :");
        for (int i = 0; i < myList.size(); i++) {
            int temp = myList.get(i);
            System.out.print(" " + temp);
        }

//classic for, но list.size() внутри каждой итерации присваиваем в переменную

//classic for, list.size()внутри каждой итерации присваиваем в переменную, перебираем с конца (i--)
      for (int i = 0; i < myList.size(); i--) {
          int temp = myList.get(i);
          System.out.print(" " + temp);
      }


//Тоже самое (list.size() внутри каждой итерации присваиваем в переменную) используя Itertor
        System.out.println("Iterator : ");
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.print(" " + integer);
        }

//Тоже самое (list.size() внутри каждой итерации присваиваем в переменную) используя ListIterator
        System.out.println("Iterator : ");
        ListIterator<Integer> listiterator = myList.listIterator();
        while (listiterator.hasNext()) {
            int temp = listiterator.next();
            System.out.print(" " + temp);
        }
    }

}

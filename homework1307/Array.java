package org.example.homework1307;

/* Создайте массив из 8 случайных целых чисел из интервала [1;50]
Выведите массив на консоль в строку.
Замените каждый элемент с нечетным индексом на ноль.
Снова выведете массив на консоль в отдельной строке.*/

public class Array {
    public static void main(String[] args) {
        int[] Mas = new int[8];
        for(int i=0;i<Mas.length;i++){
            Mas[i]=(int)(Math.random() * 49 +1);
            System.out.print(Mas[i] + " ");
        }
        for(int i=0; i<Mas.length; i++){
            if(Mas[i] % 2!= 0)Mas[i]=0;
            System.out.println(Mas[i] + "");
        }
    }
}


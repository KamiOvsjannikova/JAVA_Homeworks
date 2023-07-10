package org.example.homework0607;

/*Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер) и напечатает максимум из трех чисел.*/

import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args) {

        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if ((a >= b) && (a >= c)) {
            int max1 = a;
            System.out.println("Highest number = " + max1);
        }
        if ((b >= a) && (b >= c)) {
            int max2 = b;
            System.out.println("Highest number = " + max2);
        }
        if ((c >= a) && (c >= b)) {
            int max3 = c;
            System.out.println("Highest number = " + max3);
        }
    }
}
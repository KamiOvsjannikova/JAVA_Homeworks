package org.example.homework0607;

/* No2
Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет. */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");

        double year = scanner.nextDouble();
        if (year % 100 == 0 && year % 400 == 0)
            System.out.println("Number of days per year: 366 - is a leap year");
        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println("Number of days per year: 366 - is a leap year");
        else if (year % 100 == 0)
            System.out.println("Number of days per year: 365 - is not a leap year");
        else
            System.out.println("Number of days per year: 365 - is not a leap year");
    }
}
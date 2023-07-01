package org.example.homework2906;

import java.util.Scanner;

public class HomeworkScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter first word: ");
        String firstWord = scanner.next();
        if(firstWord.length()%2 == 0) {
            System.out.println("Количество букв в первом слове четное.");
        } else {
            System.out.println("Количество букв в первом слове нечетное.");
            return;
        }


        System.out.println("Enter second word: ");
        String secondWord= scanner.next();
        if (secondWord.length() % 2 == 0) {
            System.out.println("Количество букв во втором слове четное.");
        } else {
            System.out.println("Количество букв во втором слове нечетное.");
            return;
        }
        System.out.println(firstWord.length());
        System.out.println(secondWord.length());

        System.out.println(firstWord.substring(0,firstWord.length()/2) + secondWord.substring(secondWord.length()/2));
    }
}

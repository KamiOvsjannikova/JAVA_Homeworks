package org.example.homework2906;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Summation: " + (num1 + num2));
        System.out.println("Substraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
    }
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static int substract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplic(int num1, int num2) {
        return num1 * num2;
    }

    public static int divis(int num1, int num2) {
        return  num1 / num2;
    }
}





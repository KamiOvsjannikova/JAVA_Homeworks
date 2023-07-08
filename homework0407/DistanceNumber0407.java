package org.example.homework0407;
/*
Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
Числа могут быть, как целочисленные, так и дробные.
Например :
ввод : m=10.5, n=10.45
вывод: Число 10.45 ближе к 10.
 */

public class DistanceNumber0407 {
    public static void main(String[] args) {
        double n = 10.5, m = 10.45, disMin = Math.abs(m - 10), disMax = Math.abs(n - 10);
        System.out.println("Ближе к 10 число " + (((disMin == disMax) ? "оба числа одинаковo" : (disMin > disMax) ? n : m)));
    }
}



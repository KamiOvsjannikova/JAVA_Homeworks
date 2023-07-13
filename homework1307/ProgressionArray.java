package org.example.homework1307;

import java.util.Random;

public class ProgressionArray {
    public static void main(String[] args) {
        int[] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = randInt(10, 99);
            System.out.print(Array[i] + " ");
        }

        String result = "Прогрессия возрастающая";
        for (int i = 0; i < Array.length; i++) {
            if (i > 0 && Array[i - 1] >= Array[i]) {
                result = "Прогрессия строго возрастающая";
            }
        }
        System.out.print(result);
    }
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}

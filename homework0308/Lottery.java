package org.example.homework0308;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static final int[] winningNumbers = new int[5];
    private static int[] customerNum1;
    private static int[] customerNum2;
    private static int[] customerNum3;

    public void run() {
        initializeWinningNumbers();
        setCustomerNumbers();
        printWinningAndCustomerNumbersTable();
        checkWinnings();
    }


    public static int[] initializeWinningNumbers() {
        Random random = new Random();
        int i = 0;
        int randomNumber;

        while (i < winningNumbers.length) {
            randomNumber = random.nextInt(50) + 1;

            if (!isThisNumberPresentInArray(randomNumber, winningNumbers)) {
                winningNumbers[i] = randomNumber;
                i++;
            }
        }
        return winningNumbers;
    }
    private void setCustomerNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] customerNum1 = new int[5];
        int[] customerNum2 = new int[5];
        int[] customerNum3 = new int[5];


        System.out.println("Customer № 1, попробуйте угадать 5 чисел");

        for (int i = 0; i < customerNum1.length; i++) {
            System.out.print((i + 1) + " число: ");
            customerNum1[i] = scanner.nextInt();
        }


        for (int i = 0; i < customerNum2.length; i++) {
            System.out.print("Customer № 2, попробуйте угадать 5 чисел. Число " + (i + 1) + " ");
            customerNum2[i] = scanner.nextInt();
        }

        for (int i = 0; i < customerNum3.length; i++) {
            System.out.print("Customer № 3, попробуйте угадать 5 чисел. Число " + (i + 1) + " ");
            customerNum3[i] = scanner.nextInt();
        }

        Lottery.customerNum1 = customerNum1;
        Lottery.customerNum2 = customerNum2;
        Lottery.customerNum3 = customerNum3;

    }
    private void printWinningAndCustomerNumbersTable() {
        System.out.println("Winning num. : Customer1 Customer2 Customer3");
        for (int i = 0; i < customerNum1.length &&
                i < customerNum2.length &&
                i < customerNum3.length; i++) {

            System.out.println(winningNumbers[i] + "                "
                    + customerNum1[i] + "        "
                    + customerNum2[i] + "        "
                    + customerNum3[i]);
        }
    }
    private void checkWinnings() {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int customerNumber1 : customerNum1) {
            if (isThisNumberPresentInArray(customerNumber1, winningNumbers)) {
                count1++;
            }
        }
        for (int customerNumber2 : customerNum2) {
            if (isThisNumberPresentInArray(customerNumber2, winningNumbers)) {
                count1++;
            }
        }
        for (int customerNumber3 : customerNum3) {
            if (isThisNumberPresentInArray(customerNumber3, winningNumbers)) {
                count1++;
            }
        }

        if (count1 >= 3) {
            System.out.println("Поздравляем, игрок № 1 выиграл в лотерею!");
        } else System.out.println("Customer № 1, Вы - проиграли");

        if (count2 >= 3) {
            System.out.println("Поздравляем, игрок № 2 выиграл в лотерею!");
        } else System.out.println("Customer № 2, Вы - проиграли");

        if (count3 >= 3) {
            System.out.println("Поздравляем, игрок № 3 выиграл в лотерею!");
        } else System.out.println("Customer № 3, Вы - проиграли");

    }

    public static boolean isThisNumberPresentInArray(int targetNumber, int[] array) {
        for (int curringNumber : array) {
            if (curringNumber == targetNumber) {
                return true;
            }
        }
        return false;
    }
}


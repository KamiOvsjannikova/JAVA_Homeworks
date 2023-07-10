package org.example.homework0607;

/* уровень сложности: Дз No1
        Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
        Реализует логический метод canBuy,  возвращающий boolean
        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
        Отобразите строку «Я могу купить еду, это ……» и значение. */
import java.util.Scanner;

public class ShopWorkTime {
    public static void main(String[] args) {

        int workTime, isEdekaOpen, end1, isReweOpen, end2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Старт работы Edeka = ");
        isEdekaOpen = scanner.nextInt(24);
        System.out.print("Окончание работы Edeka = ");
        end1 = scanner.nextInt(24);
        System.out.print("\nСтарт работы Rewe = ");
        isReweOpen = scanner.nextInt(24);
        System.out.print("Окончание работы Rewe = ");
        end2 = scanner.nextInt(24);

        System.out.print("\nВведите текущее время = ");
        workTime = scanner.nextInt(24);

        workingEdeka(isEdekaOpen, end1, workTime);
        workingRewe(isReweOpen, end2, workTime);
    }

    static void workingEdeka (int isEdekaOpen, int end1, int workTime) {
        String outMessage;
        if (workTime >= isEdekaOpen && workTime <= end1)
            outMessage = "Я могу купить еду, это Edeka";
        else outMessage = "Edeka не работает";
        System.out.println(outMessage);
    }
    static void workingRewe(int isReweOpen, int end2, int workTime) {
        String outMessage = (workTime >= isReweOpen && workTime <= end2) ? "Я могу купить еду, это Rewe" : "Rewe не работает";
        System.out.println(outMessage);
    }
}



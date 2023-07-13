package org.example.homework1107;

/*Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные temperature1 и temperature2.
В результате метод возвращает true или false. */
import java.util.Scanner;

public class VesselTemperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first temperature");
        int temperature1 = scanner.nextInt();

        System.out.println("Enter second temperature");
        int temperature2 = scanner.nextInt();

        checkDevice(temperature1, temperature2);
    }
public static void checkDevice (int temperature1, int temperature2){
    System.out.println(temperature1 > 100  && temperature2 < 100);
    }
}

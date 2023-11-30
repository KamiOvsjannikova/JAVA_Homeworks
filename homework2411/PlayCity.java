//Мини игра - City :
//В цикле, поочередно два игрока вводят название городов.
//Если город ранее не был назван, то он заносится в структуру , которая хранит названные города.
//Если город уже был назван, то игра прекращается и выводится сообщение, что такой город уже был использован.
//Ввод городов продолжается до тех пор , пока не будет введен уже ранее использованный город.
//Для удобства , любой введенный город хранить в верхнем регистре.
package org.example.homework2411;
import com.github.javafaker.Faker; //  библиотека, которая подставляет разные рандомные значения : фамилии, имена, адреса, товары и т.д.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PlayCity {
    private String player1 = new Faker().address().city(); // хочу использовать метод country() для генерации случайного названия страны
    private String player2 = new Faker().address().country();// использую метод capital() для генерации случайного названия столицы.
     // Метод toUpperCase() применяется к полученной строке, чтобы преобразовать все символы в верхний регистр.
    private List<String> allCity = new ArrayList<>(); // создаю список allCity, в который будут добавляться все введенные города

    public void playStart() {
        System.out.println("Начало игры!");
        System.out.println("Игрок № 1 вводит первый город: " + player1);
        System.out.println("Игрок № 2 вводит первый город: " + player2);
        if (!player1.equals(player2)) {
            if (!allCity.contains(player1)) {
                allCity.add(player1);
            } else {
                player1 = new Faker().address().city();
                allCity.add(player1);
            }
            if (!allCity.contains(player2)) {
                allCity.add(player2);

            } else {
                player2 = new Faker().address().country();
                allCity.add(player2);
            }
        }
        System.out.println("Первые города игроков: " + allCity);
    }

    public void playOn() {
        //в данном методе использую цикл do while. игроки вводят названия городов, которые затем проверяются на уникальность и добавляются в список allCity.
        // Список сортируется после каждого ввода города.

        do {
            System.out.println("Города игроков разные, поэтому они сохраняются в общей базе");
            System.out.print("Игрок № 1 вводит название города: ");
            System.out.println(player1 = new Faker().address().city());
            System.out.print("Игрок № 2 вводит название города: ");
            System.out.println(player2 = new Faker().address().country());

            if (!allCity.contains(player1)) {
                allCity.add(player1);
            }
            if (!allCity.contains(player2)) {
                allCity.add(player2);
            }
            Collections.sort(allCity);

            System.out.println(allCity);

        } while (!player1.equals(player2) || !allCity.contains(player1) || !allCity.contains(player2));
        System.out.println("Города игроков совпали, игра закончилась!");
    }
}



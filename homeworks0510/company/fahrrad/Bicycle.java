package org.example.homeworks0510.fahrrad;
// Напишите класс Велосипед  с минимум пятью полями.
// В программе создайте 3 разных велосипеда (например, шоссейный, горный, детский) и выведите каждый из них в консоль.
//Создайте массив из этих велосипедов. С помощью Arrays.toString() превратите массив в строку и выведите в консоль.
// Запустите программу.
//Вернитесь в объявление класса велосипед.
// Переопределите метод toString, чтобы он выводил полное описание велосипеда по его полям.
//Перейдите в код метода Arrays.toString() и посмотрите на его реализацию.
// В какой момент автомобиль становится строкой внутри этого метода?
public abstract class Bicycle {
    private  String type;
    private  String model;
    private Double price;
    private String color;
    private boolean isElectric;

    public Bicycle(String type, String model, Double price, String color, boolean isElectric) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.color = color;
        this.isElectric = isElectric;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isElectric() {
        return isElectric;
    }
    public void displayBicycleInfo() {
        System.out.println("Bicycle Model:" + getModel());
        System.out.println("Bicycle type:" + getType());
        System.out.println("Bicycle Price:" + getPrice());
        System.out.println("Bicycle Color:" + getColor());
        System.out.println("Bicycle is Electric:" + isElectric());
    }

}

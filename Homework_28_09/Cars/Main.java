package Homework_28_09.Cars;

import Homework_28_09.Cars.Cars;
import Homework_28_09.Cars.Factory;

public class Main {
    public static void main(String[] args) {
       // vizvatj pevij method
        Factory factory  = new Factory(); // ключик к нужному классу, чтобы понимать программе куда обращаться

        Cars LORRY =  factory.makeCar1("Volvo", 500, "FH16");
        System.out.println("Lorry: " + LORRY.type + ", " + LORRY.getMark() + " " + LORRY.getModel() + ", Power: "
                + LORRY.getPower() + " horsepower");
        Cars SPORTCAR = factory.makeCar2("Ferrari", 1000, "SF90 Spiders");
        System.out.println("Sportcar: " + SPORTCAR.type + ", " + SPORTCAR.getMark() + " " + SPORTCAR.getModel() + ", Power: "
                + SPORTCAR.getPower() + " horsepower");
        Cars PASSENGERCAR = factory.makeCar3("Toyota", 120, "C-HR");
        System.out.println("Passengercar: " + PASSENGERCAR.type + ", " + PASSENGERCAR.getMark() + " " + PASSENGERCAR.getModel() + ", Power: "
                + PASSENGERCAR.getPower() + " horsepower");
    }
}


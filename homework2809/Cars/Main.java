package org.example.homework2809.Cars;

import org.example.homework2809.Cars.Auto.Car;
import org.example.homework2809.Cars.Auto.CarType;
import org.example.homework2809.Cars.Auto.Factory;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();// ключик к нужному классу, чтобы понимать программе куда обращаться

        // Создаю типы автомобилей
        Car Lorry = factory.makeLorry(300, "Volvo", "VNL");
        Car Sportscar = factory.makeSportscar(500, "Ferrari", "458 Italia");
        Car passengerCar = factory.makePassengerCar(150, "Toyota", "Camry");

        //Вывожу инфо о машине Lorry

        System.out.println("Information about Lorry:");
        System.out.println("Type: " + Lorry.getType());
        System.out.println("Power: " + Lorry.getPower() + " horsepower");
        System.out.println("Mark: " + Lorry.getMark());
        System.out.println("Model: " + Lorry.getModel());

        //Вывожу инфо о машине Sportscar

        System.out.println("Information about Sportscar:");
        System.out.println("Type: " + Sportscar.getType());
        System.out.println("Power: " + Sportscar.getPower() + " horsepower");
        System.out.println("Mark: " + Sportscar.getMark());
        System.out.println("Model: " + Sportscar.getModel());

        // Вывожу инфо о машине passengerCar
        System.out.println("Information about passengerCar:");
        System.out.println("Type: " + passengerCar.getType());
        System.out.println("Power: " + passengerCar.getPower() + " horsepower");
        System.out.println("Mark: " + passengerCar.getMark());
        System.out.println("Model: " + passengerCar.getModel());
    }
}

package org.example.homework2809.Cars.Auto;

import org.example.homework2809.Cars.Auto.Car;
import org.example.homework2809.Cars.Auto.CarType;

public class Factory {
    public Car makeLorry(int power, String mark, String model) {
        return new Car(CarType.LORRY, power, mark, model);
    }

    public Car makeSportscar(int power, String mark, String model) {
        return new Car(CarType.SPORTCAR, power, mark, model);
    }

    public Car makePassengerCar(int power, String mark, String model) {
        return new Car(CarType.PASSENGERCAR, power, mark, model);
    }
}







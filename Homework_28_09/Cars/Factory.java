package Homework_28_09.Cars;

import Homework_28_09.Cars.Cars;
import Homework_28_09.Cars.CarsType;

public class Factory {

    //void method nulevoj, nichego ne vozvrawaet, return ne budet rabotj
    Cars car = new Cars(CarsType.LORRY, 700,"FH16", "10" );
    Cars car2 = new Cars(CarsType.SPORTCAR, 10000,"SF90", "15");
    Cars car3 = new Cars(CarsType.PASSENGERCAR, 120, "C-HR", "7");

    public void makeCar1 (CarsType type, int power, String mark, String model) { // метод использует глагол, поэтому исполую make
       // CarsType type = car.setCarsType(type);
       // car.setType(type);
        String newMark = car.setMark(mark);
        car.setMark(mark);
        String newModel = car.setModel(model);
        car.setModel(model);
        int newpower = car.setPower(power);
        car.setPower(power);

        System.out.println("A new car has been created"+ newMark + newModel + newpower);
    }
    public void makeCar2 (CarsType type, int power, String mark, String model) {
        String newMark = car.setMark(mark);
        car.setMark(mark);
        String newModel = car.setModel(model);
        car.setModel(model);
        int newpower = car.setPower(power);
        car.setPower(power);

        System.out.println("A new car has been created"+ newMark + newModel + newpower);
    }
    public void makeCar3 (CarsType type, int power, String mark, String model) {
        //Cars car = new Cars(CarsType.PASSENGERCAR);
        String newMark = car.setMark(mark);
        car.setMark(mark);
        String newModel = car.setModel(model);
        car.setModel(model);
        int newpower = car.setPower(power);
        car.setPower(power);

        System.out.println("A new car has been created" + newMark + newModel + newpower);
    }
}
package org.example.homeworks0510.fahrrad;

public class MountainBike extends Bicycle {
    private String producer;

    public MountainBike(String type, String model, Double price, String color, boolean isElectric, String producer) {
        super(type, model, price, color, isElectric);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }
    @Override
    public void displayBikeInfo() {
        System.out.println("Road Bike Model:" + getModel());
        System.out.println("Road Bike type:" + getType());
        System.out.println("Road Bike Price:" + getPrice());
        System.out.println("Road Bike Color:" + getColor());
        System.out.println("Road Bike is Electric:" + isElectric());
        System.out.println("Road Bike Producer:" + getProducer());
    }
}

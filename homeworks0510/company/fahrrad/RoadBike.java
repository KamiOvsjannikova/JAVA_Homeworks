package org.example.homeworks0510.fahrrad;

public class RoadBike extends Bicycle {
    private double weight;

    public RoadBike(String type, String model, Double price, String color, boolean isElectric, double weight) {
        super(type, model, price, color, isElectric);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public void displayBikeInfo() {
        System.out.println("Road Bike Model:" + getModel());
        System.out.println("Road Bike type:" + getType());
        System.out.println("Road Bike Price:" + getPrice());
        System.out.println("Road Bike Color:" + getColor());
        System.out.println("Road Bike is Electric:" + isElectric());
        System.out.println("Road Bike weight:" + weight);
    }
}

package org.example.homeworks0510.fahrrad;

public class KidsBike extends Bicycle {
    private Integer numberOfSeats;

    public KidsBike(String type, String model, Double price, String color, boolean isElectric, Integer numberOfSeats) {
        super(type, model, price, color, isElectric);
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    @Override
    public void displayBikeInfo() {
        System.out.println("Kids Bike Model:" + getModel());
        System.out.println("Kids Bike Type:" + getType());
        System.out.println("Kids Bike Price:" + getPrice());
        System.out.println("Kids Bike Color:" + getColor());
        System.out.println("Kids Bike is Electric:" + isElectric());
        System.out.println("Kids Bike Number Of Seats:" + getNumberOfSeats());
    }
}
